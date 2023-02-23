package edu.pedro.exercicios.listaCircular;

public class Main {

	public static void main(String[] args) {
		
		ListaCircular<String>  minhaListaCircular = new ListaCircular<>();
		
		System.out.println(minhaListaCircular);
		
		minhaListaCircular.add("c1");
		minhaListaCircular.add("c2");
		minhaListaCircular.add("c3");
		minhaListaCircular.add("c4");
		minhaListaCircular.add("c5");
		minhaListaCircular.add("c6");
		
		for( int i = 0; i<10; i++) {
			System.out.println(minhaListaCircular.get(i));
		}
		
		
	}

}
