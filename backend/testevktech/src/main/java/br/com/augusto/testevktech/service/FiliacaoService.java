package br.com.augusto.testevktech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.entity.Filiacao;
import br.com.augusto.testevktech.model.entity.Pessoa;
import br.com.augusto.testevktech.model.enuns.TipoFiliacao;
import br.com.augusto.testevktech.repository.FiliacaoRepository;

@Service
public class FiliacaoService {

	private FiliacaoRepository filiacaoRepository;
	
	@Autowired
	public FiliacaoService(FiliacaoRepository filiacaoRepository) {
		this.filiacaoRepository = filiacaoRepository;
	}
	
	public List<Filiacao> register(String nomeMae, String nomePai, Pessoa pessoa){
		List<Filiacao> filiacoes = new ArrayList<>();
		filiacoes.add(filiacaoRepository.save(new Filiacao(nomeMae, TipoFiliacao.MAE, pessoa)));
		filiacoes.add(filiacaoRepository.save(new Filiacao(nomePai, TipoFiliacao.PAI, pessoa)));
		return filiacoes;
	}
	
}
