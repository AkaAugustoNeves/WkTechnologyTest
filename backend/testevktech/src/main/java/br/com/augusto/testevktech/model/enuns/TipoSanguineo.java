package br.com.augusto.testevktech.model.enuns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TipoSanguineo {

	A_POSITIVO(
			0L, 
			"A+", 
			List.of("A+", "AB+"), 
			List.of("A+", "A-", "O+", "O-")),
	A_NEGATIVO(
			1L, 
			"A-",
			List.of("A+", "A-", "AB+", "AB-"),
			List.of("A-", "O-")),
	B_POSITIVO(
			2L,
			"B+",
			List.of("B+", "AB+"),
			List.of("B+", "B-", "O+", "O-")),
	B_NEGATIVO(
			3L,
			"B-",
			List.of("B+", "B-", "AB+", "AB-"),
			List.of("B-", "O-")),
	AB_POSITIVO(
			4L,
			"AB+",
			List.of("AB+"),
			List.of("A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-")),
	AB_NEGATIVO(
			5L, 
			"AB-", 
			List.of("AB+", "AB-"), 
			List.of("A-", "B-", "O-", "AB-")),
	O_POSITIVO(
			6L,
			"O+",
			List.of("A+", "B+", "O+", "AB+"),
			List.of("O+", "O")),
	O_NEGATIVO(
			7L,
			"O-",
			List.of("A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-"), 
			List.of("O-"));
	
	private Long id;
	private String nome;
	List<String> doaPara = new ArrayList<>();
	List<String> recebe = new ArrayList<>();
	
	private TipoSanguineo() {
		// TODO Auto-generated constructor stub
	}
	
	private TipoSanguineo(String nome) {
		this.nome = nome;
	}
	
	private TipoSanguineo(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	private TipoSanguineo(Long id, String nome, List<String> doaPara, List<String> recebe) {
		this.id = id;
		this.nome = nome;
		this.doaPara = doaPara;
		this.recebe = recebe;
	}
	
	public static TipoSanguineo converter(String tipo_sanguineo) {
		if(tipo_sanguineo.equals(TipoSanguineo.A_POSITIVO.toString())) {
			return TipoSanguineo.A_POSITIVO;
		}
		else if(tipo_sanguineo.equals(TipoSanguineo.A_NEGATIVO.toString())) {
			return TipoSanguineo.A_NEGATIVO;
		}else if(tipo_sanguineo.equals(TipoSanguineo.B_POSITIVO.toString())) {
			return TipoSanguineo.B_POSITIVO;
		}else if(tipo_sanguineo.equals(TipoSanguineo.B_NEGATIVO.toString())) {
			return TipoSanguineo.B_NEGATIVO;
		}else if(tipo_sanguineo.equals(TipoSanguineo.AB_POSITIVO.toString())) {
			return TipoSanguineo.AB_POSITIVO;
		}else if(tipo_sanguineo.equals(TipoSanguineo.AB_NEGATIVO.toString())) {
			return TipoSanguineo.AB_NEGATIVO;
		}else if(tipo_sanguineo.equals(TipoSanguineo.O_POSITIVO.toString())) {
			return TipoSanguineo.O_POSITIVO;
		}else if(tipo_sanguineo.equals(TipoSanguineo.O_NEGATIVO.toString())) {
			return TipoSanguineo.O_NEGATIVO;
		}
		return null;
	}
	
	public static List<TipoSanguineo> converterList(List<String> tipos_sanguineos) {
		List<TipoSanguineo> tipos = new ArrayList<>();
		for (String tipo_sanguineo: tipos_sanguineos) {
			tipos.add(converter(tipo_sanguineo));
		}
		return tipos;
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

	public static List<TipoSanguineo> valores(){
		return Arrays.asList(values());
	}
		
	public List<String> getDoaPara() {
		return doaPara;
	}

	public void setDoaPara(List<String> doaPara) {
		this.doaPara = doaPara;
	}

	public List<String> getRecebe() {
		return recebe;
	}

	public void setRecebe(List<String> recebe) {
		this.recebe = recebe;
	}

	@Override
	public String toString() {
		return nome;
	}

	
}
