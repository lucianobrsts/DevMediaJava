package br.com.devmedia.colecionador.dominio;

public class Item {
	private String nome;
	private int anoCriacao;

	public Item(String nome, int anoCriacao) {
		this.nome = nome;
		this.setAnoCriacao(anoCriacao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}

	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	@Override
	public String toString() {
		return "Item \nnome: " + nome + ", \nanoCriacao: " + anoCriacao;
	}
	
}
