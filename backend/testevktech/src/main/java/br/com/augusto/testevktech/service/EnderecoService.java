package br.com.augusto.testevktech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.entity.Endereco;
import br.com.augusto.testevktech.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	private EnderecoRepository enderecoRepository;
	private BairroService bairroService;
	private CidadeService cidadeService;
	private EstadoService estadoService;
	
	@Autowired
	public EnderecoService(
			EnderecoRepository enderecoRepository,
			BairroService bairroService,
			CidadeService cidadeService,
			EstadoService estadoService) {
		this.enderecoRepository = enderecoRepository;
		this.bairroService = bairroService;
		this.cidadeService = cidadeService;
		this.estadoService = estadoService;
	}
	
	public Endereco create(String cep, String rua, int numero, String bairroNome, String cidadeNome, String ufEstado){
		System.out.println(ufEstado);
		return enderecoRepository.save(
				new Endereco(
						rua, 
						numero, 
						cep, 
						bairroService.verify(
								bairroNome, 
								cidadeService.verify(
										cidadeNome, 
										estadoService.verify(
												ufEstado
										)
								)
						)
				)
		);
	}

}
