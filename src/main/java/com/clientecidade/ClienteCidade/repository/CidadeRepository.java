package com.clientecidade.ClienteCidade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clientecidade.ClienteCidade.entity.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	List<Cidade> findByNome(String nome);
	
	List<Cidade> findByEstado(String estado);

}
