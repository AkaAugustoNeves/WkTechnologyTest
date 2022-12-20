package br.com.augusto.testevktech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.entity.Estado;
import br.com.augusto.testevktech.repository.EstadoRepository;

@Service
public class EstadoService {
	
	private EstadoRepository estadoRepository;
	
	@Autowired
	public EstadoService(EstadoRepository estadoRepository) {
		this.estadoRepository = estadoRepository;
	}
	
	public Estado verify(String uf) {
		Optional<Estado> optional = findByUf(uf);
		if (optional.isPresent()) {
			return optional.get();
		}
		return register(uf);
	}

	private Optional<Estado> findByUf(String uf){
		return estadoRepository.findByUf(uf);
	} 
	
	private Estado register(String uf) {
		return estadoRepository.save(new Estado(uf));
	}
	
	public List<Estado> findAll(){
		return estadoRepository.findAll();
	}
	
}