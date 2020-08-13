package com.michael.aulamc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michael.aulamc.domain.Produto;



public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	
}
