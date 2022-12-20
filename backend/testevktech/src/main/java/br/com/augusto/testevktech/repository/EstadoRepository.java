package br.com.augusto.testevktech.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.augusto.testevktech.model.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{

	Optional<Estado> findByUf(String uf);
	
}
