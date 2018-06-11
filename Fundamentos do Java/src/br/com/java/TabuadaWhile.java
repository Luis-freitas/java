package br.com.java;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		int valor;
		int i = 1 ; // VARIAVEL DE APOIO AO LAÇO WHILE
		Scanner teclado = new Scanner(System.in);
		System.out.println("______Tabuada_______");
		System.out.println("");
		System.out.println("Digite o valor da tabuada=");
		System.out.println("");
		valor = teclado.nextInt();
		while (i < 11) {
			System.out.println(valor + " x " + i + "  = " + (valor * i));
			i++;

		}

	}
}
