package br.com.java;

import java.util.Scanner;

public class FahrenheitparaCelsius {

	public static void main(String[] args) {
		
		double fahr, parte, conversao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Conversao de Fahrenheit para Celsius");
		System.out.println("");
		
		//Entrada
		System.out.println("Digite o valor de Fahrenheit: ");
		fahr = teclado.nextDouble();
		
		//Processamento
		parte = (fahr - 32);
		conversao = (parte / 1.8);
		
		//saída
		System.out.println("Celsius: " + conversao);

	}

}
