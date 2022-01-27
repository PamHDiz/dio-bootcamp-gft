package br.com.dio.execicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números
 * pares e números ímpares
 */
public class Ex4_ParImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int n;
		int contaPar = 0;
		int contaImpar = 0;
		
		System.out.println("Quantos números você quer digitar: ");
		n = scan.nextInt();
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Digite um número inteiro: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) {
				contaPar++;
			} else {
				contaImpar++;
			}
		}
		System.out.println("Total de números pares: " + contaPar);
		System.out.println("Total de Números ímpares: " + contaImpar);
	}

}
