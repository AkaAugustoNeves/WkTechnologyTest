package br.com.augusto.testevktech.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.augusto.testevktech.model.enuns.Sexo;
import br.com.augusto.testevktech.model.enuns.TipoSanguineo;
import br.com.augusto.testevktech.model.form.PessoaForm;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToMany(mappedBy = "pessoa")
	private List<Documento> documentos = new ArrayList<>();
	private Date dataNacimento;
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "sexo_id")
	private Sexo sexo;
	@OneToMany(mappedBy = "pessoa")
	private List<Filiacao> filiacoes = new ArrayList<>();
	@OneToMany(mappedBy = "pessoa")
	private List<Contato> contatos = new ArrayList<>();
	@ManyToOne
	private Endereco endereco;
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "tipo_sanguineo_id")
	private TipoSanguineo tipoSanguineo;
	@ManyToOne
	private Fisico fisico;
	@ManyToOne
	private Analise analise;

	public Pessoa(PessoaForm form) {
		// TODO Auto-generated constructor stub
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

	public Analise getAnalise() {
		return analise;
	}

	public void setAnalise(Analise analise) {
		this.analise = analise;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}

	public Date getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(Date dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public List<Filiacao> getFiliacoes() {
		return filiacoes;
	}

	public void setFiliacoes(List<Filiacao> filiacoes) {
		this.filiacoes = filiacoes;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public Fisico getFisico() {
		return fisico;
	}

	public void setFisico(Fisico fisico) {
		this.fisico = fisico;
	}
	
	
	
}