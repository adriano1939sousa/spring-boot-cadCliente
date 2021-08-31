package com.clientecidade.ClienteCidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clientecidade.ClienteCidade.entity.Cidade;
import com.clientecidade.ClienteCidade.service.CidadeService;


@RestController
@RequestMapping("/cidade")
public class CidadeController {
	
	@Autowired
	private CidadeService cidadeService;
	
	
	@PostMapping(consumes  = "application/json")
	public Cidade adicionar(@RequestBody Cidade cidade) {
		return cidadeService.save(cidade);
	}

	@GetMapping
	public List<Cidade> listaTodos() {
		return cidadeService.findAll();
	}

	@GetMapping(path = "/{id}")
	public Cidade cidadePorId(@PathVariable Long id) {
		return cidadeService.findId(id);
	}
	
	@GetMapping(path = "/cidade/{nome}")
	public List<Cidade> cidadePorNome(@PathVariable String nome) {
		return cidadeService.findName(nome);
	}
	
	@GetMapping(path = "/estado/{estado}")
	public List<Cidade> cidadePorEstado(@PathVariable String estado) {
		return cidadeService.findEstado(estado);
	}
}
