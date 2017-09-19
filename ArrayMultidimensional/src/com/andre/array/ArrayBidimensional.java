package com.andre.array;

public class ArrayBidimensional {

	public static void main(String[] args) {
		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 },{8, 9,},{ 5, 1} };

		int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		System.out.println("Values in array1 by row are");
		outputArray(array1);

		System.out.println("Values in array2 by row are");
		outputArray(array2);
	}

	private static void outputArray(int[][] array) {
		for (int linha = 0; linha < array.length; linha++) {
			for (int coluna = 0; coluna < array[linha].length; coluna++)
				System.out.printf("%d", array[linha][coluna]);

			System.out.println();
		}
	}
}