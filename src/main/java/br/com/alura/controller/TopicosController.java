package br.com.alura.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

@Controller
public class TopicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> list(){
		Topico topico = new Topico("Duvida", "Duvida no Spring.", new Curso("Spring", "Programação"));
		return Arrays.asList(topico,topico,topico);
	}
}
