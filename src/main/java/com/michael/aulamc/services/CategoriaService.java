package com.michael.aulamc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.aulamc.domain.Categoria;
import com.michael.aulamc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	//instancia automaticamente a camada
	@Autowired
	
	private CategoriaRepository repo;
 
	public Categoria Buscar(Integer id) {
		 Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		} 

}
