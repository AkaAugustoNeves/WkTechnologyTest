package br.com.augusto.testevktech.model.enuns;

import java.util.Arrays;
import java.util.List;

public enum Sexo {
	
	Feminino(0L,"Feminino"), 
	Masculino(1L,"Masculino");
	
	private Long id;
	private String nome;
	
	private Sexo() {
		// TODO Auto-generated constructor stub
	}
	
	private Sexo(Long id, String nome) {
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

	public static List<Sexo> valores(){
		return Arrays.asList(values());
	}

}
