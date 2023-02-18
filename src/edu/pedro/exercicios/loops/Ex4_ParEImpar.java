package edu.pedro.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
	/*
	Faça um programa que peça N números inteiros,
	calcule e mostre a quantidade de números pares
	e a quantidade de números impares.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int numerosPar = 0;
		int numerosImpar = 0;
		int qtdNumeros;
		
		int cont = 0;
		
		System.out.println("Digite a quantidade de numero que seram digitados: ");
		qtdNumeros = scan.nextInt();
		
		do {
			System.out.println("Digite um numero: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) {
				numerosPar++;
			}else numerosImpar++;
			
			cont++;
			
		}while(cont<qtdNumeros);
		
		System.out.println("Quantidade de Numeros Pares: " + numerosPar);
		System.out.println("Quantidade de Numeros Impares: " + numerosImpar);
		
		
	}

}
