package com.exercicio.caixa;

public class TreSP {

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, -1, 2, 3 }, { 1, -3, 4, 2, 0 }, { -3, 5, 2, 3, 4 } };
		int sl[] = { 0, 0, 0 };
		int x;
		x = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				sl[i] = sl[i] + mat[i][j];
				//System.out.println("soma parcial: "+sl[i]);
				//System.out.println(i);
				//System.out.println(mat[i][j]);
			}
			x = x + sl[i];
		}
		System.out.println(x);
	}
}
