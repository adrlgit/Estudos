package com.andre.array;

import java.util.Scanner;

public class JavaSystem {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe data de nascimento");
		int anoNasc = teclado.nextInt();
		
		System.out.println("Informe o ano Atual");
		int anoAtual = teclado.nextInt();
		
		int oper =   anoAtual - anoNasc;
		
		if(oper < 18){
			System.out.println("Menor de idade");
		}else{
			System.out.println("Maior de idade");
		}
		
	}

}
