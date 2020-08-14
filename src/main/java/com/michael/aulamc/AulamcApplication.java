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
	private CategoriaRepository categoriarepository;
	@Autowired
	private ProdutoRepository produtorepository;
	@Autowired
	private CidadeRepository cidaderepository;
	@Autowired
	private EstadoRepository estadorepository;
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
		
		Estado est1 = new Estado(null,"Minas Gerais");
		Estado est2 = new Estado(null,"Goias");
		
		categoriarepository.saveAll(Arrays.asList(cate1,cate2));
		produtorepository.saveAll(Arrays.asList(prod1, prod2));
		
		Cidade c1 = new Cidade(null,"Uberlãndia",est1);
		Cidade c2 = new Cidade(null,"São Paulo",est2);
		Cidade c3 = new Cidade(null,"Campinas",est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		estadorepository.saveAll(Arrays.asList(est1, est2));
		cidaderepository.saveAll((Arrays.asList(c1,c2)));
		
		
		
		
	}
	
}
