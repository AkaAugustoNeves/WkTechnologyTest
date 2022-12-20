package br.com.augusto.testevktech.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.entity.Cidade;
import br.com.augusto.testevktech.model.entity.Estado;
import br.com.augusto.testevktech.repository.CidadeRepository;

@Service
public class CidadeService {
	
	private CidadeRepository cidadeRepository;
	
	@Autowired
	public CidadeService(CidadeRepository cidadeRepository) {
		this.cidadeRepository = cidadeRepository;
	}

	public Cidade verify(String nome, Estado estado) {
		Optional<Cidade> optional = findByNome(nome);
		if (optional.isPresent()) {
			if(optional.get().getEstado().equals(estado)) {
				return optional.get();				
			}
		}
		return register(nome, estado);
	}

	private Optional<Cidade> findByNome(String nome){
		return cidadeRepository.findByNome(nome);
	} 
	
	private Cidade register(String nome, Estado estado) {
		return cidadeRepository.save(new Cidade(nome, estado));
	}
	
}
