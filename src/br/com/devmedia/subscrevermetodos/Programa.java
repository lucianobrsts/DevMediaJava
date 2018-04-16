package br.com.devmedia.subscrevermetodos;

public class Programa {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome("Joana da Silva");
		a.setMatricula("123456789");

		System.out.println("Nome: " + a.getNome() + "\nMatrícula: " + a.getMatricula());
	}

}
