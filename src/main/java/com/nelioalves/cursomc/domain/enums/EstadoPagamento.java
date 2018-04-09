package com.nelioalves.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String description;
	
	//CONSTRUYOT DE TIPO ENUMERADO É PRIVATE!
	private EstadoPagamento(int cod, String description) {
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
	
	public static EstadoPagamento toEnum(Integer cod) {
		
		if (cod == null) {
			return null;
		}
		
		for(EstadoPagamento x : EstadoPagamento.values()){
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("ID inválido " + cod);
	}

}
