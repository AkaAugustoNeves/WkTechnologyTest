package br.com.augusto.testevktech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.entity.Fisico;
import br.com.augusto.testevktech.repository.FisicoRepository;

@Service
public class FisicoService {

	private FisicoRepository fisicoRepository;
	
	@Autowired
	public FisicoService(FisicoRepository fisicoRepository) {
		this.fisicoRepository = fisicoRepository;
	}
	
	public Fisico register(int peso, float altura) {
		return fisicoRepository.save(new Fisico(altura, peso));
	}
	
}
