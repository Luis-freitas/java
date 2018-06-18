package br.com.java;

public class Agenda {

	public static void main(String[] args) {

		String[][] contatos = { { "Bill Gates", "1111-1111", "bill@outlook.com" },
				{ "Linus Torvalds", "2222-2222", "linus@gmail.com" },
				{ "Steve Jobs", "3333,3333", "steve@icloud.com" } };

		// System.out.println("Recuperar o email do Linus Torvalds: " + contatos[1][2]);
		// contatos [0][1] = "9999-9999";
		// System.out.println("Alterando o telefenofe bill: " + contatos[0][1]);
		for (int i = 0; i < contatos.length; i++) {
			System.out.println("_________________________________");
			for (int j = 0; j < contatos.length; j++) {
			System.out.println(contatos[i][j]);
		}
	}

}
}