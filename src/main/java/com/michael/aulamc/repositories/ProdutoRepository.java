package com.michael.aulamc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.michael.aulamc.domain.Produto;



@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	
}
