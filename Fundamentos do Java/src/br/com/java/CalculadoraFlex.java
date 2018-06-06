package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double Gasolina, alcool, porcentagem;
		
		
		System.out.println("");
		System.out.println("Digite o valor do alcool");
		alcool = teclado.nextDouble();
		System.out.println("Digite o valor da Gasolina:");
		Gasolina = teclado.nextDouble();
        
		porcentagem = alcool / Gasolina;		
		if (porcentagem < 0.7) {
			System.out.println("É mais vantajoso usar Alcool");
			
		} else {
			System.out.println("É mais vantajoso usar Gasolina");
			

		}

	}

}
