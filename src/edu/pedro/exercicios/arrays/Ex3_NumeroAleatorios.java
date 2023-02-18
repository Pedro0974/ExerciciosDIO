package edu.pedro.exercicios.arrays;

import java.util.Random;

public class Ex3_NumeroAleatorios {
	/*
	Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
	Ao final mostre os números e seus sucessores.
	*/
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] numeros = new int[20];
		
		for(int i = 0; i< numeros.length; i++) {
			int numero = random.nextInt(100);
			numeros[i] = numero;
		}
		
		System.out.println("Numeros Aleatorios: ");
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\nSucessor dos Numeros Aleatorios: ");
		for (int numero : numeros) {
			System.out.print((numero+1) + " ");
		}
	}

}
