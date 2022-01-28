package br.com.dio.execicios.arrays;

import java.util.Random;

/**
 * Fa�a um programa que leia 20 n�meros aleat�rios entre 0 e 100 e
 * os armazene num vetor. No final, mostre os n�meros e seus sucessores.
 */
public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] numerosAleatorios = new int[20];
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.println("N�meros aleat�rios: ");
		for (int contador : numerosAleatorios) {
			System.out.print(contador + " ");
		}
		
		System.out.println("\nSucessores dos N�meros aleat�rios: ");
		for (int contador : numerosAleatorios) {
			System.out.print((contador + 1) + " ");
		}
		

	}

}
