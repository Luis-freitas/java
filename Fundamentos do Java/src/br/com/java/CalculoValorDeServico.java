package br.com.java;

import java.util.Scanner;

public class CalculoValorDeServico {

	public static void main(String[] args) {
		double remuneracao, custo, horas, servico, estimativa, total;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("______Calculo de servi�o______");
		System.out.println("Remunera��o Mensal: ");
		remuneracao = teclado.nextDouble();
		System.out.println("Custo operacional mensal");
		custo = teclado.nextDouble();
		System.out.println("Carga hor�ria mensal de trabalho: ");
		horas = teclado.nextDouble();
		servico = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / horas;
		System.out.println("Valor da hora de servi�o: " + servico);
		System.out.println("");
		System.out.println("Estimativa de horas deste ervi�o: ");
		estimativa = teclado.nextDouble();
		total = estimativa * servico;
		System.out.println("Valor a ser cobrado deste cliente: " + total);
		
	}

}
