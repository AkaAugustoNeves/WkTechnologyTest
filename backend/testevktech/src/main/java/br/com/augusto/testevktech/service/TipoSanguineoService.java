package br.com.augusto.testevktech.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.dto.DoadoresDTO;
import br.com.augusto.testevktech.model.dto.SangueIdade;
import br.com.augusto.testevktech.model.dto.SangueIdadeDTO;
import br.com.augusto.testevktech.model.entity.Pessoa;
import br.com.augusto.testevktech.model.enuns.TipoSanguineo;

@Service
public class TipoSanguineoService {

	public ResponseEntity<?> idadePorSangue(List<Pessoa> pessoas) {
		List<SangueIdade> sangueIdades = SangueIdade.asValues();
		for(Pessoa pessoa: pessoas) {
			for(SangueIdade sangueIdade : sangueIdades) {
				if(sangueIdade.getTipoSanguineo().equals(pessoa.getTipoSanguineo())) {
					sangueIdade.setIdade(sangueIdade.getIdade() + pessoa.calcularIdade());
					sangueIdade.setPessoas(sangueIdade.getPessoas()+1);
				}
			}
		}
		return ResponseEntity.status(HttpStatus.OK).body(SangueIdadeDTO.converter(sangueIdades));
	}

	public ResponseEntity<?> receptores(List<Pessoa> pessoas) {
		List<SangueIdade> sangues = SangueIdade.asValues();
		for(Pessoa pessoa: pessoas) {
			if(pessoa.calcularIdade() >= 16 && pessoa.calcularIdade() <= 69 && pessoa.getFisico().getPeso() > 50) {
				for(String doaPara: pessoa.getTipoSanguineo().getDoaPara()) {
					sangues = contar(TipoSanguineo.converter(doaPara), sangues);
				}				
			}
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(DoadoresDTO.converter(sangues));
	}

	private List<SangueIdade> contar(TipoSanguineo tipoSanguineo, List<SangueIdade> sangues) {
		for(SangueIdade sangue: sangues) {
			if(sangue.getTipoSanguineo().equals(tipoSanguineo)) {
				sangue.setPessoas(sangue.getPessoas()+1);
			}
		}
		return sangues;
	}	
	
	
}