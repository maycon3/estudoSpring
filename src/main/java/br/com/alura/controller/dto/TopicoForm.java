package br.com.alura.controller.dto;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;
import br.com.alura.repository.CursoRepository;

public class TopicoForm {
	
	private String titulo;
	private String mensagem;
	private String nomeCurso;
	
	//Validações com Bean Validation aula 05
	
	public String getTitulo() {
		return titulo;
	}




	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}




	public String getMensagem() {
		return mensagem;
	}




	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}




	public String getNomeCurso() {
		return nomeCurso;
	}




	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}




	public Topico converte(CursoRepository cursoRepository) {
		Curso curso = cursoRepository.findByNome(nomeCurso);
		return new Topico(titulo,mensagem,curso);
	}

}
