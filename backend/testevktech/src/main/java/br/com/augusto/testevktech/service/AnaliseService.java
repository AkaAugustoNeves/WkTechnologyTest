package br.com.augusto.testevktech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.augusto.testevktech.model.dto.ManchaEstadoDTO;
import br.com.augusto.testevktech.model.entity.Analise;
import br.com.augusto.testevktech.model.entity.Estado;
import br.com.augusto.testevktech.model.entity.Pessoa;
import br.com.augusto.testevktech.model.enuns.FaixaEtaria;
import br.com.augusto.testevktech.model.form.PessoaForm;
import br.com.augusto.testevktech.repository.AnaliseRepository;

@Service
public class AnaliseService {
	
	private JsonService jsonService;
	private AnaliseRepository analiseRepository;
	private PessoaService pessoaService;  
	private EstadoService estadoService;
	private IMCService imcService;
	
	@Autowired
	public AnaliseService(JsonService jsonService, AnaliseRepository analiseRepository, PessoaService pessoaService, EstadoService estadoService, IMCService imcService) {
		this.jsonService = jsonService;
		this.analiseRepository = analiseRepository;
		this.pessoaService = pessoaService;
		this.estadoService = estadoService;
		this.imcService = imcService;
	}

	public ResponseEntity<?> register(MultipartFile arquivo) {
		// TODO Auto-generated method stub
		PessoaForm[] pessoas = jsonService.convert(arquivo);
		Analise analise = analiseRepository.save(new Analise());
		pessoaService.register(analise, pessoas);
		return  ResponseEntity.status(HttpStatus.OK).body(analise.getHash());
	}

	public ResponseEntity<?> mancha(String analiseHash) {
		List<ManchaEstadoDTO> mancha = new ArrayList<>();
		List<Pessoa> pessoas =  pessoaService.findByAnaliseHash(analiseHash);
		List<Estado> estados = estadoService.findAll();
		for(Estado estado: estados) {
			int quantidade = 0;
			for(Pessoa pessoa: pessoas ) {
				if(pessoa.getEndereco().getBairro().getCidade().getEstado().equals(estado)) {
					quantidade++;
				}
			}			
			mancha.add(new ManchaEstadoDTO(estado.getUf(), quantidade));
		}
		return ResponseEntity.ok(mancha);
	}

	public ResponseEntity<?> imc(String analiseHash) {
		List<Pessoa> pessoas =  pessoaService.findByAnaliseHash(analiseHash);
		return ResponseEntity.status(HttpStatus.OK).body(imcService.imcPorEtaria(pessoas));
	}

}
