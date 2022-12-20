package br.com.augusto.testevktech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.augusto.testevktech.model.entity.Analise;
import br.com.augusto.testevktech.model.form.PessoaForm;
import br.com.augusto.testevktech.repository.AnaliseRepository;

@Service
public class AnaliseService {
	
	private JsonService jsonService;
	private AnaliseRepository analiseRepository;
	private PessoaService pessoaService;
	
	@Autowired
	public AnaliseService(JsonService jsonService, AnaliseRepository analiseRepository, PessoaService pessoaService) {
		this.jsonService = jsonService;
		this.analiseRepository = analiseRepository;
		this.pessoaService = pessoaService;
	}

	public ResponseEntity<?> register(MultipartFile arquivo) {
		// TODO Auto-generated method stub
		PessoaForm[] pessoas = jsonService.convert(arquivo);
		Analise analise = analiseRepository.save(new Analise());
		pessoaService.register(analise, pessoas);
		return  ResponseEntity.status(HttpStatus.OK).body(analise.getHash());
	}

}
