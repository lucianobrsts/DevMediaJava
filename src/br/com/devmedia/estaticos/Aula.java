package br.com.devmedia.estaticos;

public class Aula {

	static String nome = "Ana";
	String sobrenome = "Monteiro";

	void imprimir() {
		System.out.println(nome + " " + sobrenome);
	}

	public static void main(String[] args) {

		// System.out.println(nome + " " + sobrenome);
		//
		// new Aula().imprimir();
		//
		// System.out.println(nome + " " + new Aula().sobrenome);
		//
		// show();

		// MyClass my = new MyClass();
		// my.imprime();
		//
		// MyClass.show();
		// my.show();

		Aula a1 = new Aula();
		a1.sobrenome = "da Silva";
		//a1.nome = "Marina";

		Aula a2 = new Aula();
		//a2.sobrenome = "da Sousa";

		Aula a3 = new Aula();
		a3.sobrenome = "Moura";

		System.out.println("a1: " + nome + " " + a1.sobrenome);
		System.out.println("a2: " + nome + " " + a2.sobrenome);
		System.out.println("a3: " + nome + " " + a3.sobrenome);
		System.out.println("a4: " + nome + " " + new Aula().sobrenome);

	}

	static void show() {
		System.out.println(nome + " " + new Aula().sobrenome);
	}

}
