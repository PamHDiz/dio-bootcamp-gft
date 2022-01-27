package br.com.dio.execicios.loops;

import java.util.Scanner;

/**
 * Fa�a um programa que pe�a N n�meros inteiros, calcule e mostre a quantidade de n�meros
 * pares e n�meros �mpares
 */
public class Ex4_ParImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int n;
		int contaPar = 0;
		int contaImpar = 0;
		
		System.out.println("Quantos n�meros voc� quer digitar: ");
		n = scan.nextInt();
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("Digite um n�mero inteiro: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) {
				contaPar++;
			} else {
				contaImpar++;
			}
		}
		System.out.println("Total de n�meros pares: " + contaPar);
		System.out.println("Total de N�meros �mpares: " + contaImpar);
	}

}
