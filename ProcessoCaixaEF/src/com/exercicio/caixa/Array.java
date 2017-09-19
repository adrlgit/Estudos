package com.exercicio.caixa;

public class Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
			array[i + 1] = array[i];
			System.out.println( array[i+1]);
		}
		
	}

}
