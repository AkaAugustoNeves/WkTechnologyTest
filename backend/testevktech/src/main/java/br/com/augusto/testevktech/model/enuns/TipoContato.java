package br.com.augusto.testevktech.model.enuns;

import java.util.Arrays;
import java.util.List;

public enum TipoContato {

	EMAIL(0L,"EMAIL"), 
	CELULAR(1L,"CELULAR"),
	TELEFONE_FIXO(2L,"TELEFONE_FIXO");
	
	private Long id;
	private String nome;
	
	private TipoContato() {
		// TODO Auto-generated constructor stub
	}
	
	private TipoContato(Long id, String nome) {
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

	public static List<TipoContato> valores(){
		return Arrays.asList(values());
	}
	
}
