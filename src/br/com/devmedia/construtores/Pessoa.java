package br.com.devmedia.construtores;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	private char sexo;

	public Pessoa() {
		super();
		System.out.println("Pessoa...");
	}

	public Pessoa(String nome, int idade) {
		// super();
		this();
		this.nome = nome;
		this.idade = idade;
		System.out.println("Nome e idade");
	}

	public Pessoa(String nome, String sobrenome, int idade, char sexo) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
