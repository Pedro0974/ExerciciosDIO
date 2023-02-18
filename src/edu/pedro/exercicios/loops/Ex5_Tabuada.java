package edu.pedro.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
	/*
	Desenvolva um gerador de tabuada,
	capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
	O usuário deve informar de qual numero ele deseja ver a tabuada.
	A saída deve ser conforme o exemplo abaixo:
	Tabuada de 5:
	5 X 1 = 5
	5 X 2 = 10
	...
	5 X 10 = 50
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int contadorMultiplicacao = 1;
		int resultado;
		
		System.out.println("Digite um numero para gerar a tabuada: ");
		numero = scan.nextInt();
		
		if(numero>1&&numero<=10) {
			for(int i=0; i<10; i++) {
				
				resultado = numero * contadorMultiplicacao;
				System.out.println(numero + " X " + contadorMultiplicacao +" = "+ resultado);
				contadorMultiplicacao++;
			}
		}
	}

}
