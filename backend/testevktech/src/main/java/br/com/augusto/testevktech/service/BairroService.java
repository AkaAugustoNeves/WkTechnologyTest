package br.com.augusto.testevktech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.entity.Bairro;
import br.com.augusto.testevktech.model.entity.Cidade;
import br.com.augusto.testevktech.repository.BairroRepository;

@Service
public class BairroService {

	private BairroRepository bairroRepository;
	
	@Autowired
	public BairroService( BairroRepository bairroRepository) {
		this.bairroRepository = bairroRepository;
	}
	
	public Bairro verify(String nome, Cidade cidade) {
		return register(nome, cidade);
	}
	
	private Bairro register(String nome, Cidade cidade) {
		return bairroRepository.save(new Bairro(nome, cidade));
	}
	
}
