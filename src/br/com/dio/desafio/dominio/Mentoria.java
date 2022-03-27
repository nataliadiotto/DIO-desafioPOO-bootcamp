package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20.0;
	}

	@Override
	public String toString() {
		return   "Título: " + getTitulo() + 
				" / Descrição: " + getDescricao() + 
				" / Data: "+ getData();
	}
	
	
	
	
	
	
	
}
