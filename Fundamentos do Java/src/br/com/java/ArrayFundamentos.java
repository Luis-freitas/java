package br.com.java;

public class ArrayFundamentos {

	public static void main(String[] args) {
		String time1 = "corinthians";
		String time2 = "Palmeiras";
		String time3 = "Santos";
		String time4 = "São Paulo";
		System.out.println("Fundamentos do array");
		System.out.println("Exemplo 1: Sem array");
		System.out.println("Time: " + time3);
		//A linha abaixo cria um vetor simples
		
		String[] times = {"corinthians","Palmeiras","Santos","São Paulo"};
		System.out.println("Exemplo 2: Com array");
		//a linha abaixo recupera o conteúdo do índice [2] do array
		System.out.println("Time: " + times[2]);
		//a linha abaixo modifica o conteúdo do índice [2] do array
		times[2] = "Flamengo";
		
		
	System.out.println("Time: " + times[2]);
	// obtendo o tamanho total do array
	System.out.println("Total de times: " + times.length);

		
	
	}

}
