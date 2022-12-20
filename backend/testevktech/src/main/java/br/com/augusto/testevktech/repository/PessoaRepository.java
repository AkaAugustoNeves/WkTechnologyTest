package br.com.augusto.testevktech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.augusto.testevktech.model.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
