package com.michael.aulamc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.michael.aulamc.domain.Categoria;
import com.michael.aulamc.repositories.CategoriaRepository;

@SpringBootApplication
public class AulamcApplication implements CommandLineRunner{
	@Autowired
	private CategoriaRepository categoriarepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AulamcApplication.class, args);
	}
	//excecutar ação quando o sistema iniciar
	public void run(String... args) throws Exception {
		Categoria cate1 = new Categoria(null,"Info");
		Categoria cate2 = new Categoria(null,"chilli beans");
		
		categoriarepository.saveAll(Arrays.asList(cate1,cate2));
		
		
	
		
	}
	
}
