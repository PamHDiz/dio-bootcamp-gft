package br.com.dio.execicios.arrays;

import java.util.Scanner;

/**
 * Faça um programa que leia um vetor de 6 caracteres e diga quantas
 * consoates foram lidas. Imprima as consoantes
 */
public class Ex2_Consoantes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] caracteres = new String[6];
		int totalConsoantes = 0;
		
		
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println("Digite a letra " + (i+1) + ": ");
			caracteres[i] = scan.next();
		}
				
		for(int i = 0; i < caracteres.length; i++) {
			if(!(caracteres[i].equalsIgnoreCase("a") | 
					caracteres[i].equalsIgnoreCase("e") | 
					caracteres[i].equalsIgnoreCase("i") |
					caracteres[i].equalsIgnoreCase("o") | 
					caracteres[i].equalsIgnoreCase("u"))) {
				System.out.println("Contoante: " + caracteres[i]);
				totalConsoantes++;
		}
	}
		System.out.println("Total de consoantes: " + totalConsoantes);

}
}
