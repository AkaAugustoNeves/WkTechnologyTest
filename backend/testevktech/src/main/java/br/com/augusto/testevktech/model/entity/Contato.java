package br.com.augusto.testevktech.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.augusto.testevktech.model.enuns.TipoContato;

@Entity
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String valor;
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "tipo_contato_id")
	private TipoContato tipoContato;
	@ManyToOne
	private Pessoa pessoa;
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}
	
	public Contato(String valor, TipoContato tipoContato, Pessoa pessoa) {
		this.valor = valor;
		this.tipoContato = tipoContato;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public TipoContato getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(TipoContato tipoContato) {
		this.tipoContato = tipoContato;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}