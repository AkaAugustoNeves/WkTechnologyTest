package br.com.augusto.testevktech.model.enuns;

import java.util.Arrays;
import java.util.List;

public enum TipoDocumento {
	
	RG(0L,"RG"), 
	CPF(1L,"CPF");
	
	private Long id;
	private String nome;
	
	private TipoDocumento() {
		// TODO Auto-generated constructor stub
	}
	
	private TipoDocumento(Long id, String nome) {
		this.id = id;
		this.nome = nome;
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

	public static List<TipoDocumento> valores(){
		return Arrays.asList(values());
	}

}
