package br.com.dio.execicios.loops;

import java.util.Scanner;

/**
 * Fa�a um programa que pe�a uma nota entre zero e dez.
 * Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at�
 * o usu�rio informar um valor v�lido
 *
 */
public class Ex2_Nota {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.print("Nota inv�lida! Por favor, digite novamente: ");
			nota = scan.nextInt();
		}
	}

}
