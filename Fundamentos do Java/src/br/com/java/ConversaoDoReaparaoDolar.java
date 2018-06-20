package br.com.java;

import java.util.Scanner;

public class ConversaoDoReaparaoDolar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double dolar, real;
		System.out.print("converter dolar para real = ");
		dolar = teclado.nextDouble();
		//processamento 
		real = (dolar * 3.73);
		//saida 
		System.out.println(" valor do real: " + real);
		

	}

}
