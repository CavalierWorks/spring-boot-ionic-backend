package com.nelioalves.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String description;
	
	//CONSTRUYOT DE TIPO ENUMERADO É PRIVATE!
	private TipoCliente(int cod, String description) {
		this.cod = cod;
		this.description = description;
	}
	
	//A TIPOS ENUMERADOS APLICA SE APENAS O GET
	public int getCod() {
		return cod;
	}
	
	public String getDescription() {
		return description;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()){
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("ID inválido " + cod);
	}

}
