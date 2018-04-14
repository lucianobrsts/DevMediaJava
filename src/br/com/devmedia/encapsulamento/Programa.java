package br.com.devmedia.encapsulamento;

public class Programa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Maria";
		pessoa.idade = 20;

		System.out.println("Pessoa: " + pessoa.nome + "\nIdade: " + pessoa.idade);
	}

}
