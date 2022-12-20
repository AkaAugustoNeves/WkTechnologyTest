package br.com.augusto.testevktech.model.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.augusto.testevktech.model.enuns.FaixaEtaria;

public class ImcDTO {

	private FaixaEtaria faixaEtaria;
	private float imcMedio;
	
	public ImcDTO(Imc imc) {
		this.faixaEtaria = imc.getFaixaEtaria();
		this.imcMedio = imc.getImc()/imc.getPessoas();
	}
	
	public static List<ImcDTO> converter(List<Imc> imcs){
		List<ImcDTO> imcsFinal = new ArrayList<>();
		for(Imc imc: imcs) {
			imcsFinal.add(new ImcDTO(imc));
		}
		return imcsFinal;
	}

	public FaixaEtaria getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public float getImcMedio() {
		return imcMedio;
	}

	public void setImcMedio(float imcMedio) {
		this.imcMedio = imcMedio;
	}
	
}
