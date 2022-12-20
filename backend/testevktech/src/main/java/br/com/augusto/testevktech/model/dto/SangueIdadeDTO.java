package br.com.augusto.testevktech.model.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.augusto.testevktech.model.enuns.TipoSanguineo;

public class SangueIdadeDTO {

	private TipoSanguineo tipoSanguineo;
	private float idadeMedia;
	
	public SangueIdadeDTO(SangueIdade sangueIdade) {
		this.tipoSanguineo = sangueIdade.getTipoSanguineo();
		this.idadeMedia = sangueIdade.getIdade()/sangueIdade.getPessoas();
	}
	
	public static List<SangueIdadeDTO> converter(List<SangueIdade> sangueIdades){
		List<SangueIdadeDTO> sangueIdadesFinal = new ArrayList<>();
		for(SangueIdade sangueIdade: sangueIdades) {
			sangueIdadesFinal.add(new SangueIdadeDTO(sangueIdade));
		}
		return sangueIdadesFinal;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public float getIdadeMedia() {
		return idadeMedia;
	}

	public void setIdadeMedia(float idadeMedia) {
		this.idadeMedia = idadeMedia;
	}
	
}