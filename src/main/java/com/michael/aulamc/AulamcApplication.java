package com.michael.aulamc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.michael.aulamc.domain.Categoria;
import com.michael.aulamc.domain.Cidade;
import com.michael.aulamc.domain.Estado;
import com.michael.aulamc.domain.Produto;
import com.michael.aulamc.repositories.CategoriaRepository;
import com.michael.aulamc.repositories.CidadeRepository;
import com.michael.aulamc.repositories.EstadoRepository;
import com.michael.aulamc.repositories.ProdutoRepository;

@SpringBootApplication
public class AulamcApplication implements CommandLineRunner{
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	
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
		
		categoriaRepository.saveAll(Arrays.asList(cate1,cate2));
		produtoRepository.saveAll(Arrays.asList(prod1, prod2));
		
		Estado esti1 = new Estado(null,"Minas Gerais");
		Estado esti2 = new Estado(null,"São Paulo");
		
		Cidade c1 = new Cidade(null,"Uberlandia",esti1);
		Cidade c2 = new Cidade(null,"São Paulo",esti2);
		Cidade c3 = new Cidade(null,"Campinas",esti2);
		
		esti1.getCidades().addAll(Arrays.asList(c1));
		esti2.getCidades().addAll(Arrays.asList(c2,c3));
		
		estadoRepository.saveAll(Arrays.asList(esti1,esti2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		
		
		
	}
	
}
