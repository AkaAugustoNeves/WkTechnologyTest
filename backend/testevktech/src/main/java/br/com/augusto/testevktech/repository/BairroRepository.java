package br.com.augusto.testevktech.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.augusto.testevktech.model.entity.Bairro;

public interface BairroRepository extends JpaRepository<Bairro, Long> {

	Optional<Bairro> findByNome(String nome);
	
}
