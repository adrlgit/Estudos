package com.andre.array;

import javax.swing.JOptionPane;

public class JavaJOP {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog(null, "Informe ano nascimento");
		int anoNasc = Integer.parseInt(valor);

		String valor2 = JOptionPane.showInputDialog(null, "Ano atual");
		int anoAtual = Integer.parseInt(valor2);

		int op = anoAtual - anoNasc;

		if (op < 18) {
			JOptionPane.showMessageDialog(null, "Menor por ter " + op + " anos de idade");
		} else {
			JOptionPane.showMessageDialog(null, "Maior de idade " + op + " anos de idade");
		}

	}
}
