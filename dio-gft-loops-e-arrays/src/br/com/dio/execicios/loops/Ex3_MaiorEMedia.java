package br.com.dio.execicios.loops;

import java.util.Scanner;

/**
 * Fa�a um programa que leia 5 n�meros 
 * e informe o maior n�mero e a m�dia desses n�meros.
 */

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int contador = 0;
		int maior = 0;
		int soma = 0;
		
		do {
			
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			if(numero > maior) {
				maior = numero;
			}
			
			contador++;
			soma = soma + numero;
		} while(contador < 5); 
			
		
		System.out.println("O maior n�mero �: " + maior);
		System.out.println("A m�dia �: " + (soma/contador));
	}

}
