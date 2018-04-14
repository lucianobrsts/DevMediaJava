package br.com.devmedia.encapsulamento;

public class Programa {

	private boolean ativo;

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria");
		pessoa.setIdade(20);

		System.out.println("Pessoa: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
		System.out.println();

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Luciana");
		pessoa2.setIdade(-8);

		System.out.println("Pessoa: " + pessoa2.getNome() + "\nIdade: " + pessoa2.getIdade());
	}

}
