package br.com.devmedia.sobrescrevermetodos;

public class Programa {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.setNome("Joana da Silva");
		a.setMatricula("123456789");

		System.out.println("Nome: " + a.getNome() + "\nMatrícula: " + a.getMatricula());
		System.out.println();

		Aluno a2 = new Aluno();
		a2.setNome("Joana da Silva");
		a2.setMatricula("1234567890");

		System.out.println("Nome: " + a2.getNome() + "\nMatrícula: " + a2.getMatricula());
		System.out.println();

		Professor p = new Professor();
		p.setNome("Marcos da Silva");
		p.setMatricula("1234567890");

		System.out.println("Nome: " + p.getNome() + "\nMatrícula: " + p.getMatricula());
	}

}
