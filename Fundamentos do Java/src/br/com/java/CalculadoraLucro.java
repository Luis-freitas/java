package br.com.java;

import java.util.Scanner;

public class CalculadoraLucro {

	public static void main(String[] args) {
	   double custo, lucro, venda ;
	   Scanner teclado = new Scanner(System.in);
	   System.out.println("Calculadora de Lucro");
	   System.out.print("");
	   //entrada
	   System.out.print("Preço de Custo: ");
	   custo = teclado.nextDouble();
	   System.out.print("% de Lucro: ");
	   lucro = teclado.nextDouble(); 
	   //Prcessamento 
	   venda = custo + ((custo * lucro) / 100);
	   //Saida
	   System.out.print("Preço de venda: " + venda);
	   

	}

}
