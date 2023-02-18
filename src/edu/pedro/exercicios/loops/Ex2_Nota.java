package edu.pedro.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
	/*
	Faça um programa que peça uma nota, entre zero e dez.
	Mostre uma mensagem caso o valor seja inválido
	e continue pedindo
	até que o usuário informe um valor válido.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		while(true) {
			
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = scan.nextInt();
			if(nota>10 | nota<0) {
				System.out.println("Digite Um Valor Valido! ");
				
			}else break;
			
			
		}
		System.out.println("Saimos do While!");
		
	}

}
