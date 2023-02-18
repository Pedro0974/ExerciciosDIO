package edu.pedro.exercicios.arrays;

public class Ex1_OrdemInversa {

	/*
	Crie um vetor de 6 números inteiros
	e mostre-os na ordem inversa.
	*/
	
	public static void main(String[] args) {
		
		int[] vetor = {1,2,3,4,5,6};
		int cont = 0;
		
		System.out.println("Vetor Normal: ");
		while(cont <= (vetor.length -1)) {
			System.out.print(vetor[cont]+ " ");
			cont++;
		}
		
		System.out.println("\nVetor inverso: ");
		for (int i = (vetor.length-1); i >= 0; i--) {

			System.out.print(vetor[i]+ " ");
		}
		
	}

}
