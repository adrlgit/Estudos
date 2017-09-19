package com.andre.array;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Idade {

	public static void main(String[] args) {
		
		//Scanner tec = new Scanner(System.in);
		
	
		String valor = JOptionPane.showInputDialog(null,"Informe ano nascimento?");
		int anoNasc = Integer.parseInt(valor);
		//System.out.println("Informe ano de nascimento ");
		//int anoNasc = tec.nextInt();
		
		String valor2 = JOptionPane.showInputDialog(null, "Ano atual?");
		int anoAtual = Integer.parseInt(valor2);
		//System.out.println("Informe ano atual ");
		//int anoAtual = tec.nextInt();
		
		int op = anoAtual - anoNasc;
		
		if(op < 18){
			JOptionPane.showMessageDialog(null,"Menor de idade por ter " +op+" anos");
			//System.out.println("Menor de idade por ter "+op+" Anos");
		}else{
			JOptionPane.showMessageDialog(null,"Maior de idade por ter " +op+" anos");
			//System.out.println("Maior de idade por ter " +op+ " Anos");
		}
		
		
	}

}
