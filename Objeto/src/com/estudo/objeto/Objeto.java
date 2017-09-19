package com.estudo.objeto;

public class Objeto {
	 public String nome;
	 private boolean idade;
	
	public void print(){
		
		System.out.println("Um nome esta adicionado" + this.nome);
		System.out.println("uma idade: " + this.idade);
	}
	
	public void desp(){
		this.idade = true;
	}
	
}
