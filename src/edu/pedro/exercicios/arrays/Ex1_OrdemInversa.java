package edu.pedro.exercicios.arrays;

public class Ex1_OrdemInversa {

	/*
	Crie um vetor de 6 números inteiros
	e mostre-os na ordem inversa.
	*/
	
	public static void main(String[] args) {
		
		int[] vetor = {10,-1,5,50,-30,9};
		
		 System.out.print("Vetor: ");
	        for(int i = (vetor.length - 1); i >= 0; i --) {
	            System.out.print(vetor[i] + " ");
	        }
		
	}

}
