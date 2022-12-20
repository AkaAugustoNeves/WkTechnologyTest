package br.com.augusto.testevktech.model.dto;

public class ManchaEstadoDTO {
	
	private String uf;
	private int quantidade;
	
	public ManchaEstadoDTO(String uf, int quantidade) {
		this.uf = uf;
		this.quantidade = quantidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}