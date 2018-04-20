package br.com.devmedia.construtores;

public class PessoaFisica extends Pessoa {

	public PessoaFisica() {
		super();
		System.out.println("PessoaFisica...");
	}
	
	public PessoaFisica(String nome, int idade) {
		super(nome, idade);
		System.out.println("Pessoa(String nome, int idade)");
	}

}
