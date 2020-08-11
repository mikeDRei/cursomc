package com.michael.aulamc.domain;

import java.io.Serializable;
//herança da classe Serializable para que os objetos possam ser salvos em arquivos
public class Categoria implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
private Integer id;
 private String nome;
 
 public Categoria(){
	 
	 
 }
//method construtor
public Categoria(Integer id, String nome) {
	super();
	this.id = id;
	this.nome = nome;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
 // gerando HashCode equals ou seja comparando classes por valores e não ponteiro de memoria
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Categoria other = (Categoria) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}
 

}
