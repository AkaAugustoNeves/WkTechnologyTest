package br.com.augusto.testevktech.model.enuns;

import java.util.Arrays;
import java.util.List;

public enum FaixaEtaria {

	de0a10(0L,"de 0 á 10", 0, 10), 
	de11a20(1L,"de 11 á 20", 11, 20), 
	de21a30(2L,"de 21 á 30", 21, 30), 
	de31a40(3L,"de 31 á 40", 31, 40), 
	de41a50(4L,"de 41 á 50", 41, 50), 
	de51a60(5L,"de 51 á 60", 51, 60), 
	de61a70(6L,"de 61 á 70", 61, 70), 
	de71a80(7L,"de 71 á 80", 71, 80), 
	de81a90(8L,"de 81 á 90", 81, 90), 
	de91a999(9L,"de 91 á 100", 91, 999);
	
	private Long id;
	private String descricao;
	private int minimo;
	private int maximo;
	
	private FaixaEtaria() {
		// TODO Auto-generated constructor stub
	}
	
	private FaixaEtaria(Long id, String descricao, int minimo, int maximo) {
		this.id = id;
		this.descricao = descricao;
		this.minimo = minimo;
		this.maximo = maximo;
	}
	
	public static FaixaEtaria verify(int idade) {
		if(idade >= FaixaEtaria.de0a10.getMinimo() && idade <= FaixaEtaria.de0a10.getMaximo()) {
			return FaixaEtaria.de0a10;
		}else if(idade >= FaixaEtaria.de11a20.getMinimo() && idade <= FaixaEtaria.de11a20.getMaximo()) {
			return FaixaEtaria.de11a20;
		}else if(idade >= FaixaEtaria.de21a30.getMinimo() && idade <= FaixaEtaria.de21a30.getMaximo()) {
			return FaixaEtaria.de21a30;
		}else if(idade >= FaixaEtaria.de31a40.getMinimo() && idade <= FaixaEtaria.de31a40.getMaximo()) {
			return FaixaEtaria.de31a40;
		}else if(idade >= FaixaEtaria.de41a50.getMinimo() && idade <= FaixaEtaria.de41a50.getMaximo()) {
			return FaixaEtaria.de41a50;
		}else if(idade >= FaixaEtaria.de51a60.getMinimo() && idade <= FaixaEtaria.de51a60.getMaximo()) {
			return FaixaEtaria.de51a60;
		}else if(idade >= FaixaEtaria.de61a70.getMinimo() && idade <= FaixaEtaria.de61a70.getMaximo()) {
			return FaixaEtaria.de61a70;
		}else if(idade >= FaixaEtaria.de71a80.getMinimo() && idade <= FaixaEtaria.de71a80.getMaximo()) {
			return FaixaEtaria.de71a80;
		}else if(idade >= FaixaEtaria.de81a90.getMinimo() && idade <= FaixaEtaria.de81a90.getMaximo()) {
			return FaixaEtaria.de81a90;
		}else {
			return FaixaEtaria.de91a999;
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public static List<FaixaEtaria> valores(){
		return Arrays.asList(values());
	}
	
}