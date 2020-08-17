package com.michael.aulamc.domain.enums;

public enum TipoCliente {

PESSOAFISICA(1,"Pessoa Fisca"),
PESSOAJURIDICA(2,"Pessoa juridica");
	
private int codigo;
private String descricao;

private TipoCliente(int cod, String descricao){
	this.codigo = cod;
	this.descricao = descricao;
	
	
}
public int getCod() {
	return codigo;
	
}
public String getDescricao() {
	return descricao;
	
}
	public static TipoCliente toEnum(Integer cod) {
		if(cod ==null) {
			return null;
		}
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
			
		}
		throw new IllegalArgumentException("Id invalido:"+cod);
		
		
	}
}

