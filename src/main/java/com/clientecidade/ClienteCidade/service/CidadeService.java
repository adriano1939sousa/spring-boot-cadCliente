package com.clientecidade.ClienteCidade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clientecidade.ClienteCidade.entity.Cidade;
import com.clientecidade.ClienteCidade.repository.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	
	public Cidade findId(Long id) {
		return cidadeRepository.getById(id);
	}

	public List<Cidade> findAll() {
		return cidadeRepository.findAll();
	}

	public Cidade save(Cidade cidade) {
		return cidadeRepository.save(cidade);
	}

	public void delete(Cidade cidade) {
		if(cidadeRepository.existsById(cidade.getId())) {
			cidadeRepository.delete(cidade);
		}
	}
	
	public List<Cidade> findName(String nome) {
		return cidadeRepository.findByNome(nome);
	}
	
	
	public List<Cidade> findEstado(String estado) {
		return cidadeRepository.findByEstado(estado);
	}
	
}
