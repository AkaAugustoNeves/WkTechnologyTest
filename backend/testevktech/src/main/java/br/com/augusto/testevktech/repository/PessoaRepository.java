package br.com.augusto.testevktech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.augusto.testevktech.model.entity.Analise;
import br.com.augusto.testevktech.model.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	List<Pessoa> findByAnaliseHash(String hash);
	
}
