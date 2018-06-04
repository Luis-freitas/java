package br.com.java;

import java.util.Scanner;

public class PontodeVenda {

      public static void main(String[] args) {
		double total, desconto, pago, Troco;
		Scanner teclado = new Scanner (System.in);
		//entrada
		System.out.println("inserir valor da compra ");
		total = teclado.nextDouble();
		System.out.println("desconto(%) ");
		desconto = teclado.nextDouble();
		//processamento 
		desconto = total - ((total * desconto)/100);
		System.out.println("total  " + desconto);
		System.out.println(" inserir o valor pago");
		pago = teclado.nextDouble();
		//processamento 
		Troco = pago - desconto; 
		System.out.println("troco = " + Troco);
		
		
		

      }
}
