package br.com.augusto.testevktech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.dto.Imc;
import br.com.augusto.testevktech.model.dto.ImcDTO;
import br.com.augusto.testevktech.model.entity.Pessoa;
import br.com.augusto.testevktech.model.enuns.FaixaEtaria;

@Service
public class IMCService {

	public List<ImcDTO> imcPorEtaria(List<Pessoa> pessoas) {
		List<Imc> imcs = Imc.asValues();
		for(Pessoa pessoa: pessoas) {
			int idade = pessoa.calcularIdade();
			System.out.println("idade: "+ idade); 
			FaixaEtaria faixaEtaria = FaixaEtaria.verify(idade);
			System.out.println("faixa etaria: "+faixaEtaria);
			float imcPessoa = pessoa.calcularImc();
			System.out.println("imcPessoa: "+imcPessoa);
						
			for(Imc imc: imcs) {
				//System.out.println("imcs faixa: "+ imc.getFaixaEtaria());
				if (imc.getFaixaEtaria().equals(faixaEtaria)) {
					imc.setImc( imcPessoa + imc.getImc());
					imc.setPessoas(imc.getPessoas()+1);
				}/*else {
					imcs.add(new Imc(faixaEtaria, imcPessoa));
				}*/
			}
		}
		return ImcDTO.converter(imcs);
	}

}
