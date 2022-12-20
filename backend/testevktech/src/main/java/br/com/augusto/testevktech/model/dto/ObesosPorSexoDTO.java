package br.com.augusto.testevktech.model.dto;

public class ObesosPorSexoDTO {
	
	private int homens;
	private int mulheres;
	
	public ObesosPorSexoDTO(int homens, int mulheres) {
		this.mulheres = mulheres;
		this.homens = homens;
	}

	public int getHomens() {
		return homens;
	}

	public void setHomens(int homens) {
		this.homens = homens;
	}

	public int getMulheres() {
		return mulheres;
	}

	public void setMulheres(int mulheres) {
		this.mulheres = mulheres;
	}
	
	

}
