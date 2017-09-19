package com.andre.array;

public class MetodosEspeciais {
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
		Double[] ArrayDeDoub = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Character[] ArrayCha = { 'O', 'L', 'Á', };

		System.out.println("Array integerArray: ");
		imprimirMetodo( intArray );
		System.out.println("\nArray double:");
		imprimirMetodo(ArrayDeDoub);
		System.out.println("\nArray de Caracters:");
		imprimirMetodo(ArrayCha);
	}

	// Método genérico
	public static <lista> void imprimirMetodo(lista[] inputArray) {
		for (lista element : inputArray)
			System.out.printf("%s", element);

		System.out.println();
	}
}
