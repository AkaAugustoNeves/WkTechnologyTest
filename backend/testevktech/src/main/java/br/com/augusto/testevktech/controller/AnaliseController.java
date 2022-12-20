package br.com.augusto.testevktech.controller;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.augusto.testevktech.model.enuns.TipoSanguineo;
import br.com.augusto.testevktech.model.form.PessoaForm;
import br.com.augusto.testevktech.service.AnaliseService;

@RestController
@RequestMapping("/analise")
public class AnaliseController {
	
	private AnaliseService analiseService;
	
	@Autowired
	public AnaliseController(AnaliseService analiseService) {
		this.analiseService = analiseService;
	}
	
	@PostMapping
	public ResponseEntity<?> upload(@RequestBody(required = true) MultipartFile arquivo) {
		return analiseService.register(arquivo);
	}

}