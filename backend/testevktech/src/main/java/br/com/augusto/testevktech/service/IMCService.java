package br.com.augusto.testevktech.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.dto.Imc;
import br.com.augusto.testevktech.model.dto.ImcDTO;
import br.com.augusto.testevktech.model.dto.ObesosPorSexoDTO;
import br.com.augusto.testevktech.model.entity.Pessoa;
import br.com.augusto.testevktech.model.enuns.FaixaEtaria;
import br.com.augusto.testevktech.model.enuns.Sexo;

@Service
public class IMCService {

	public List<ImcDTO> imcPorEtaria(List<Pessoa> pessoas) {
		List<Imc> imcs = Imc.asValues();
		for(Pessoa pessoa: pessoas) {
			FaixaEtaria faixaEtaria = FaixaEtaria.verify(pessoa.calcularIdade());
			float imcPessoa = pessoa.calcularImc();						
			for(Imc imc: imcs) {
				if (imc.getFaixaEtaria().equals(faixaEtaria)) {
					imc.setImc( imcPessoa + imc.getImc());
					imc.setPessoas(imc.getPessoas()+1);
				}
			}
		}
		return ImcDTO.converter(imcs);
	}

	public ObesosPorSexoDTO sobrepesoPorSexo(List<Pessoa> pessoas) {
		int mulheres = 0;
		int homens = 0;
		for(Pessoa pessoa: pessoas) {
			if(pessoa.calcularImc() > 30) {
				if (pessoa.getSexo().equals(Sexo.Feminino)) {
					mulheres++;
				}else {
					homens++;
				}				
			}
		}
		return new ObesosPorSexoDTO(homens, mulheres);
	}

}
