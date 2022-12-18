package br.com.augusto.testevktech.model.enuns;

import java.util.Arrays;
import java.util.List;

public enum TipoFiliacao {

	MAE(0L,"MAE"), 
	PAI(1L,"PAI");
	
	private Long id;
	private String nome;
	
	private TipoFiliacao() {
		// TODO Auto-generated constructor stub
	}
	
	private TipoFiliacao(Long id, String nome) {
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

	public static List<TipoFiliacao> valores(){
		return Arrays.asList(values());
	}

	
}
