package br.com.java;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// A linha abaixo cria vari�veis num�ricas de precis�o
		// float e double s�o t�pos primitivos num�ricos
		double peso, altura, imc;
		System.out.println("Digite o seu  peso em kg: ");
		// entrada
		Scanner digitado = new Scanner(System.in);
		// a linha abaixo passa o valor digitado para a variavel peso
		peso = digitado.nextDouble();
		System.out.print("Digite a sua altura em metros: ");
		altura = digitado.nextDouble();
		// a linha abaixo faz o calculo de imc
		imc = peso / (altura * altura) / 2;
		// saida
		System.out.println("o valor da sua massa corporal �:" + imc);
	}

}
