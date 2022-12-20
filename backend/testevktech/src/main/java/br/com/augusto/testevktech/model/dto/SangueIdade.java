package br.com.augusto.testevktech.model.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.augusto.testevktech.model.enuns.TipoSanguineo;

public class SangueIdade {

	private TipoSanguineo tipoSanguineo;
	private int idade;
	private int pessoas;
	
	public SangueIdade() {
		// TODO Auto-generated constructor stub
	}
	
	public SangueIdade(TipoSanguineo tipoSanguineo, int idade) {
		this.tipoSanguineo = tipoSanguineo;
		this.idade = idade;
		this.pessoas = 1;
	}
	
	public SangueIdade(TipoSanguineo tipoSanguineo, int idade, int pessoas) {
		this.tipoSanguineo = tipoSanguineo;
		this.idade = idade;
		this.pessoas = pessoas;
	}
	
	public static List<SangueIdade> asValues(){
		List<SangueIdade> sangueIdade = new ArrayList<>();
		sangueIdade.add(new SangueIdade(TipoSanguineo.A_NEGATIVO, 0, 0));
		sangueIdade.add(new SangueIdade(TipoSanguineo.A_POSITIVO, 0, 0));
		sangueIdade.add(new SangueIdade(TipoSanguineo.AB_NEGATIVO, 0, 0));
		sangueIdade.add(new SangueIdade(TipoSanguineo.AB_POSITIVO, 0, 0));
		sangueIdade.add(new SangueIdade(TipoSanguineo.B_NEGATIVO, 0, 0));
		sangueIdade.add(new SangueIdade(TipoSanguineo.B_POSITIVO, 0, 0));
		sangueIdade.add(new SangueIdade(TipoSanguineo.O_NEGATIVO, 0, 0));
		sangueIdade.add(new SangueIdade(TipoSanguineo.O_POSITIVO, 0, 0));
		return sangueIdade;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}
	
	
	
}
