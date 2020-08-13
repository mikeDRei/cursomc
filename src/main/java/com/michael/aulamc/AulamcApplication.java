package com.michael.aulamc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.michael.aulamc.domain.Categoria;
import com.michael.aulamc.domain.Produto;
import com.michael.aulamc.repositories.CategoriaRepository;
import com.michael.aulamc.repositories.ProdutoRepository;

@SpringBootApplication
public class AulamcApplication implements CommandLineRunner{
	@Autowired
	private CategoriaRepository categoriarepository;
	@Autowired
	private ProdutoRepository produtorepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AulamcApplication.class, args);
	}
	//excecutar ação quando o sistema iniciar
	public void run(String... args) throws Exception {
		Categoria cate1 = new Categoria(null,"Info");
		Categoria cate2 = new Categoria(null,"chilli beans");
		
		Produto prod1 = new Produto(null,"pc",4000.00);
		Produto prod2 = new Produto(null,"Smart TV",5000.00);
		
		
		
		//salvando categorias no banco
		
		cate1.getProdutos().addAll(Arrays.asList(prod1,prod2));
		cate2.getProdutos().addAll(Arrays.asList(prod2));
		prod1.getCategorias().addAll(Arrays.asList(cate1));
		prod2.getCategorias().addAll(Arrays.asList(cate1,cate2));
		
		categoriarepository.saveAll(Arrays.asList(cate1,cate2));
		produtorepository.saveAll(Arrays.asList(prod1, prod2));
		
		
	}
	
}
