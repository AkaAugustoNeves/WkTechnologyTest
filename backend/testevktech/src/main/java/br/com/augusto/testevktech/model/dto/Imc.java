package br.com.augusto.testevktech.model.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.augusto.testevktech.model.enuns.FaixaEtaria;

public class Imc {

	private FaixaEtaria faixaEtaria;
	private float imc;
	private int pessoas;
	
	public Imc(FaixaEtaria faixaEtaria, float imc) {
		this.faixaEtaria = faixaEtaria;
		this.imc = imc;
		this.pessoas = 1;
	}
	
	public Imc(FaixaEtaria faixaEtaria, float imc, int pessoas) {
		this.faixaEtaria = faixaEtaria;
		this.imc = imc;
		this.pessoas = pessoas;
	}
	
	public Imc() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Imc> asValues(){
		List<Imc> imcs = new ArrayList<>();
		imcs.add(new Imc(FaixaEtaria.de0a10, 0, 0));
		imcs.add(new Imc(FaixaEtaria.de11a20, 0, 0));
		imcs.add(new Imc(FaixaEtaria.de21a30, 0, 0));
		imcs.add(new Imc(FaixaEtaria.de31a40, 0, 0));
		imcs.add(new Imc(FaixaEtaria.de41a50, 0, 0));
		imcs.add(new Imc(FaixaEtaria.de51a60, 0, 0));
		imcs.add(new Imc(FaixaEtaria.de61a70, 0, 0));
		imcs.add(new Imc(FaixaEtaria.de71a80, 0, 0));
		imcs.add(new Imc(FaixaEtaria.de81a90, 0, 0));
		imcs.add(new Imc(FaixaEtaria.de91a999, 0, 0));
		return imcs;
	}

	public FaixaEtaria getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}	
	
}