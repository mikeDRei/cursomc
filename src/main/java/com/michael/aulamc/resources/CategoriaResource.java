package com.michael.aulamc.resources;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.michael.aulamc.domain.Categoria;

@RestController
@RequestMapping(value="categorias")


public class CategoriaResource {
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar(){
		Categoria cate = new Categoria(1,"Informatica");
		Categoria cate2 = new Categoria(2,"Justi");
		
		List<Categoria> lista =new ArrayList<Categoria>();
		lista.add(cate);
		lista.add(cate2);
		
		
		return lista;
		
		
	}
}
