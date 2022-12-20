package br.com.augusto.testevktech.service;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.augusto.testevktech.model.form.PessoaForm;

@Service
public class JsonService {

	public PessoaForm[] convert(MultipartFile arquivo){	
		try {
		    ObjectMapper mapper = new ObjectMapper();
		    Path filepath = Paths.get("./", arquivo.getOriginalFilename());
		    arquivo.transferTo(filepath);
		    File file = Paths.get("./"+arquivo.getOriginalFilename()).toFile();
		    PessoaForm[] form = mapper.readValue(file,  PessoaForm[].class);
		    file.delete();
			return form;
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
		return null;
	}
	
}
