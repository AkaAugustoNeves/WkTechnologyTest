package br.com.augusto.testevktech.model.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.augusto.testevktech.model.enuns.TipoSanguineo;

public class DoadoresDTO {

	private TipoSanguineo tipoSanguineo;
	private int quantidade;
	
	public DoadoresDTO(SangueIdade sangue) {
		this.tipoSanguineo = sangue.getTipoSanguineo();
		this.quantidade = sangue.getPessoas();
	}
	
	public static List<DoadoresDTO> converter(List<SangueIdade> sangues){
		List<DoadoresDTO> doadoresFinal = new ArrayList<>();
		for(SangueIdade sangue: sangues) {
			doadoresFinal.add(new  DoadoresDTO(sangue));
		}
		return doadoresFinal;
	}
	

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
