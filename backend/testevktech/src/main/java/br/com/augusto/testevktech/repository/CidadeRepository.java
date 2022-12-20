package br.com.augusto.testevktech.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.augusto.testevktech.model.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

	Optional<Cidade> findByNome(String nome);
	
}
