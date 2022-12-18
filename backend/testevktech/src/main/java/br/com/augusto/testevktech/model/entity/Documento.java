package br.com.augusto.testevktech.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.augusto.testevktech.model.enuns.TipoDocumento;

@Entity
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numero;
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "tipo_documento_id")
	private TipoDocumento tipoDocumento;
	@ManyToOne
	private Pessoa pessoa;
	
	public Documento() {
		// TODO Auto-generated constructor stub
	}
	
	public Documento(String numero, TipoDocumento tipoDocumento, Pessoa pessoa) {
		this.numero = numero;
		this.tipoDocumento = tipoDocumento;
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}