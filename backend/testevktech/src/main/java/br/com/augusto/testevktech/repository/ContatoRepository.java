package br.com.augusto.testevktech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.augusto.testevktech.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
