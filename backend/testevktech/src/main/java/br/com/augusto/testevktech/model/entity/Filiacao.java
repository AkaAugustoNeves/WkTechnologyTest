package br.com.augusto.testevktech.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.augusto.testevktech.model.enuns.TipoFiliacao;

@Entity
public class Filiacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "tipo_filiacao_id")
	private TipoFiliacao tipoFiliacao;
	@ManyToOne
	private Pessoa pessoa;
	
	public Filiacao() {
		// TODO Auto-generated constructor stub
	}
	
	public Filiacao(String nome, TipoFiliacao tipoFiliacao, Pessoa pessoa) {
		this.nome = nome;
		this.tipoFiliacao = tipoFiliacao;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoFiliacao getTipoFiliacao() {
		return tipoFiliacao;
	}

	public void setTipoFiliacao(TipoFiliacao tipoFiliacao) {
		this.tipoFiliacao = tipoFiliacao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}