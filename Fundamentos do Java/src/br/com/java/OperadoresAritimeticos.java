package br.com.java;

import java.util.Scanner;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		float x = 10;
		float y = 3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Operadores Aritimeticos");
		System.out.print("Digite o valor de x :");
		x = teclado.nextFloat();
		System.out.print("Digite o valor de y: ");
		y = teclado.nextFloat();
		// Soma
		
		System.out.println("x + y = " + (x + y));
		// Subtração
		
		System.out.println("x - y = " + (x - y));
		// Divisão
		
		System.out.println("x / y = " + (x / y));
		// multiplicação
		
		System.out.println("x * y = " + (x * y));
		//Modulo
	    
		System.out.println("x % y = " + (x % y));
	    //Incremento x++ (equivale  a x = x + 1)
	    x++;
	    
	    System.out.println("x++ " + x);
	    //Decremento x-- ( equivale a y = y - 1)
	    y--;
	    System.out.print("y-- " + y);
	}

}
