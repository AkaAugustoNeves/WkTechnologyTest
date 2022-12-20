package br.com.augusto.testevktech.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.augusto.testevktech.model.entity.Documento;
import br.com.augusto.testevktech.model.entity.Pessoa;
import br.com.augusto.testevktech.model.enuns.TipoDocumento;
import br.com.augusto.testevktech.repository.DocumentoRepository;

@Service
public class DocumentoService {

	private DocumentoRepository documentoRepository;
	
	@Autowired
	public DocumentoService(DocumentoRepository documentoRepository) {
		this.documentoRepository = documentoRepository;
	}
	
	public List<Documento> register(String rg, String cpf, Pessoa pessoa){
		List<Documento> documentos = new ArrayList<>();
		documentos.add(documentoRepository.save(new Documento(rg, TipoDocumento.RG, pessoa)));
		documentos.add(documentoRepository.save(new Documento(cpf, TipoDocumento.CPF, pessoa)));
		return documentos;
	}
	
}
