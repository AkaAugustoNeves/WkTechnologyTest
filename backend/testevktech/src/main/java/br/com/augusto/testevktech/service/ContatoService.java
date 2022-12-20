package br.com.augusto.testevktech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.entity.Contato;
import br.com.augusto.testevktech.model.entity.Pessoa;
import br.com.augusto.testevktech.model.enuns.TipoContato;
import br.com.augusto.testevktech.repository.ContatoRepository;

@Service
public class ContatoService {
	
	private ContatoRepository contatoRepository;
	
	@Autowired
	public ContatoService(ContatoRepository contatoRepository) {
		this.contatoRepository = contatoRepository;
	}
	
	public List<Contato> register(String email, String TelefoneFixo, String celular, Pessoa pessoa){
		List<Contato> contatos = new ArrayList<>();
		contatos.add(contatoRepository.save(new Contato(email, TipoContato.EMAIL, pessoa)));
		contatos.add(contatoRepository.save(new Contato(TelefoneFixo, TipoContato.TELEFONE_FIXO, pessoa)));
		contatos.add(contatoRepository.save(new Contato(celular, TipoContato.CELULAR, pessoa)));
		return contatos;
	}

}
