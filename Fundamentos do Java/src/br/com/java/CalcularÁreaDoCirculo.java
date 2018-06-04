package br.com.java;

import java.util.Scanner;

public class Calcular¡reaDoCirculo {

	public static void main(String[] args) {
		double area, raio, pi;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calcular area do circulo");
		raio = teclado.nextDouble();
		// calculo 
		area = (3.14* (raio*raio));
		System.out.println("a area do circulo È: " + area );

	}

}
