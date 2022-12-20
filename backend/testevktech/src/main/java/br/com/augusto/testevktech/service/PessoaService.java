package br.com.augusto.testevktech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.entity.Analise;
import br.com.augusto.testevktech.model.entity.Endereco;
import br.com.augusto.testevktech.model.entity.Fisico;
import br.com.augusto.testevktech.model.entity.Pessoa;
import br.com.augusto.testevktech.model.form.PessoaForm;
import br.com.augusto.testevktech.repository.PessoaRepository;

@Service
public class PessoaService {

	private PessoaRepository pessoaRepository;
	private EnderecoService enderecoService;
	private FisicoService fisicoService;
	private ContatoService contatoService;
	private FiliacaoService filiacaoService;
	private DocumentoService documentoService;
	
	@Autowired
	public PessoaService(PessoaRepository pessoaRepository, EnderecoService enderecoService, FisicoService fisicoService, ContatoService contatoService, FiliacaoService filiacaoService, DocumentoService documentoService) {
		this.pessoaRepository = pessoaRepository;
		this.enderecoService = enderecoService;
		this.fisicoService = fisicoService;
		this.contatoService = contatoService;
		this.filiacaoService = filiacaoService;
		this.documentoService = documentoService;
	}
	
	public List<Pessoa> register(Analise analise, PessoaForm[] forms){
		List<Pessoa> pessoas = new ArrayList<>();
		
		for (PessoaForm form: forms) {
			Pessoa pessoa =
					pessoaRepository.save(
						new Pessoa(
							form,
							enderecoService.create(form.getCep(), form.getEndereco(), form.getNumero(), form.getBairro(), form.getCidade(), form.getEstado()),
							fisicoService.register(form.getPeso(), form.getAltura()),
							analise
						)
					);
			pessoa.setContatos(contatoService.register(form.getEmail(), form.getTelefone_fixo(), form.getCelular(), pessoa));
			pessoa.setFiliacoes(filiacaoService.register(form.getMae(), form.getPai(), pessoa));
			pessoa.setDocumentos(documentoService.register(form.getRg(), form.getCpf(), pessoa));
			pessoas.add(pessoa);
		}
		return pessoas;
		
	}
	
}
