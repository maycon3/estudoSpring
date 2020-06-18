package br.com.alura.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.controller.dto.TopicoDto;
import br.com.alura.forum.model.Topico;
import br.com.alura.repository.TopicoRepository;

@RestController
public class TopicosController {

	@Autowired
	private TopicoRepository topicoRepository;
	
	@GetMapping("/topicos")
	public List<TopicoDto> list(String nomeCurso){
		if(nomeCurso == null) {
			List<Topico> topicos = this.topicoRepository.findAll();
			return TopicoDto.converter(topicos);			
		}else {
			List<Topico> topicos = this.topicoRepository.findByCursoNome(nomeCurso);
			return TopicoDto.converter(topicos);
		}
	}
}
