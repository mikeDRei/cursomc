package com.michael.aulamc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.aulamc.domain.Cliente;
import com.michael.aulamc.repositories.ClienteRepository;
import com.michael.aulamc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	//instancia automaticamente a camada
	@Autowired
	
	private ClienteRepository repo;
 
	public Cliente Buscar(Integer id) {
		 Optional<Cliente> obj = repo.findById(id);
		 return obj.orElseThrow(() -> new ObjectNotFoundException(
		  "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		 } 


}
