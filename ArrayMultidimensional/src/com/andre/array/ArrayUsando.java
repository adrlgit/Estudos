package com.andre.array;


public class ArrayUsando {

	public static void main(String[] args) {
		int[] array;
		array = new int[10];//cria o objeto array
		
		System.out.printf("%s%8s", "Index", "Value");//títulos de coluna
		
		for(int c = 0; c < array.length; c++ )
			System.out.printf("%5d%8d\n",c ,array[c]);
	}

}
