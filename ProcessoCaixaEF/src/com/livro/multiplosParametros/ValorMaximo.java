package com.livro.multiplosParametros;

import java.util.Scanner;

public class ValorMaximo {
	public void determinaValorMaximo(){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numero1 = teclado.nextDouble();
		double numero2 = teclado.nextDouble();
		double numero3 = teclado.nextDouble();
		
		double result = maximum( numero1, numero2, numero3 );	
		
		System.out.println("Maximo é "+result);
	}
	public double maximum(double x, double y, double z){
		double valorMaximo = x;
		if(y > valorMaximo)
			valorMaximo = y;
		if(z > valorMaximo)
			valorMaximo = z;
		return valorMaximo;
	}
}
