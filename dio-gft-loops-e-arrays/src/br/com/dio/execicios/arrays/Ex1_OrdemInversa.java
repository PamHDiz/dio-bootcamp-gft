package br.com.dio.execicios.arrays;

/**
 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 *
 */
public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		
		int[] vetor = {3, 5, 0, 4, 2, 9};
		
		System.out.print("vetor: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.print("\nVetor inverso: ");
		for(int i = vetor.length - 1; i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}

	}

}
