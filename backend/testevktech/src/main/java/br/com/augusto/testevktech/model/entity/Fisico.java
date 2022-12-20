package br.com.augusto.testevktech.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fisico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private float altura;
	private int peso;
	
	public Fisico() {
		// TODO Auto-generated constructor stub
	}
	
	public Fisico(float altura, int peso) {
		this.altura = altura;
		this.peso = peso;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}