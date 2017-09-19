package com.andre.array;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[4][4];
		
		notasAlunos[0][0] = 6;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 5;
		notasAlunos[0][3] = 8.5;
		
		notasAlunos[1][0] = 8;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9.6;
		notasAlunos[2][2] = 9.9;
		notasAlunos[2][3] = 7;
		
		notasAlunos[3][0] = 10;
		notasAlunos[3][1] = 1.5;
		notasAlunos[3][2] = 1.8;
		notasAlunos[3][3] = 3;
		
		double maior =0;
		
		for(int i = 0; i < notasAlunos.length; i++){
			for(int j = 0; j < notasAlunos.length; j++){
				System.out.print(notasAlunos[i][j] + " - ");
			}
			//quebra de linha
			System.out.println();
		}
			//array para achar a maior nota
		for(int i =0; i < notasAlunos.length; i++){
			for(int j = 0; j < notasAlunos.length; j++){
				if(notasAlunos[i][j] > maior)
					maior =notasAlunos[i][j];
			}
			
		}
		
		System.out.println("\nMaior nota -> " + maior);
		
	}

}
