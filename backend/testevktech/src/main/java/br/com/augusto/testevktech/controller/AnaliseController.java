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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.augusto.testevktech.model.dto.ManchaEstadoDTO;
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
	
	@GetMapping("/{analiseHash}/mancha")
	public ResponseEntity<?> mancha(@PathVariable String analiseHash){
		return analiseService.mancha(analiseHash);
	}
	
	@GetMapping("/{analiseHash}/imc")
	public ResponseEntity<?> imc(@PathVariable String analiseHash){
		return analiseService.imc(analiseHash);
	}	

	@GetMapping("/{analiseHash}/sobrepeso")
	public ResponseEntity<?> sobrepeso(@PathVariable String analiseHash){
		return analiseService.sobrepeso(analiseHash);
	}
	
	@GetMapping("/{analiseHash}/idadePorSangue")
	public ResponseEntity<?> idadePorSangue(@PathVariable String analiseHash){
		return analiseService.idadePorSangue(analiseHash);
	}
	
	@GetMapping("/{analiseHash}/receptores")
	public ResponseEntity<?> receptores(@PathVariable String analiseHash){
		return analiseService.receptores(analiseHash);
	}
	
}