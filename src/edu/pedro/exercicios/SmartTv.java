package edu.pedro.exercicios;

public class SmartTv {
	/*
	 Exemplos de modelos para criação de metodos com as normas da comunidade e boas praticas
	 */
	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void aumentarCanal() {
		canal++;
	}
	public void diminuirCanal() {
		canal--;
	}
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}
	
	
	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		volume--;
	}
	
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
	
	
	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("Tv Ligada? " + smartTv.ligada);
		System.out.println("Canal Atual: " + smartTv.canal);
		System.out.println("Volume Atual: " + smartTv.volume);
		
		//aumentando volume da smartTv com o metodo aumentarVolume
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		
		//diminuindo volume da smartTv com o metodo diminuirVolume
		smartTv.diminuirVolume();
		
		//mudando de canal com o metodo aumentarCanal
		smartTv.aumentarCanal();
		
		//mudando de canal com parametro no metodo mudarCanal
		smartTv.mudarCanal(20);
		
		//ligando tv com metodo ligar
		smartTv.ligar ();
		System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);
		
		//desligando tv com o metodo desligar
		smartTv.desligar();
		System.out.println("Novo Status -> Tv Ligada? " + smartTv.ligada);
	}
	
	
}
