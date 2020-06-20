package br.com.alura.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.alura.forum.model.Topico;
import br.com.alura.repository.TopicoRepository;

public class AtualizaTopicoForm {

	@NotNull
	@NotEmpty
	@Length(min=5, message = "Obrigatorio minimo de 5 caracteres")
	private String titulo;
	
	@NotNull
	@NotEmpty
	@Length(min=10)
	private String mensagem;

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

	public Topico atualiza(Long id, TopicoRepository topicoRepository) {
		Topico topico = topicoRepository.getOne(id);
		topico.setMensagem(this.mensagem);
		topico.setTitulo(this.titulo);
		return topico;
	}
	
	
}
