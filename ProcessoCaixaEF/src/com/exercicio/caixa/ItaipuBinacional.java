package com.exercicio.caixa;

import java.util.Scanner;

public class ItaipuBinacional {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);
		
		int i = 0;
		System.out.println("Informe codigo");
		i = tec.nextInt();
		
		switch (i) {
		case 1:
			System.out.print("A");
			break;
		case 2:
			System.out.print("B");

		case 3:
			System.out.print("C");
			break;
		case 4:
			System.out.println("D");
			break;
		default:
			System.out.print("E");
		}
	}

}
