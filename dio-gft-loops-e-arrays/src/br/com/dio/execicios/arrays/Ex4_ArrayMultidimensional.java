package br.com.dio.execicios.arrays;

import java.util.Random;

/**
 * Gere uma matriz multidimensional 4X4 com valores aleatórios entre 0-9.
 *
 */
public class Ex4_ArrayMultidimensional {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[][] m = new int[4][4];
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				m[i][j] = random.nextInt(9);
			}
		}
		
		System.out.println("Matriz: ");
		for (int[] linha : m) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
	}

}
