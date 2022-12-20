package br.com.augusto.testevktech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.augusto.testevktech.model.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>  {

}
