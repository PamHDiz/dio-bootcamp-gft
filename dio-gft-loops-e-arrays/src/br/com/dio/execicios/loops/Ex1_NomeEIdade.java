package br.com.dio.execicios.loops;

import java.util.Scanner;

/*
 * Fa�a um programa que leia conjuntos de dois valores, sendo o primeiro o nome	
 * do aluno e o segundo, a sua idade. (Pare inserindo o valor 0 no campo nome)
 */

public class Ex1_NomeEIdade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true) {
			System.out.println("Nome: ");
			nome = scan.next();
			
			if(nome.equals("0")) break;
			
			System.out.println("Idade: ");
			idade = scan.nextInt();
		}
		
		System.out.println("Continua aqui...");
		
	}
		
}
