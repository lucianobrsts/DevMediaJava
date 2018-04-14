package br.com.devmedia.construtores;

public class Programa {

	public static void main(String[] args) {
		Livro livro = new Livro();

		livro.setTitulo("Java I");
		livro.setAutor("Luciano Brito");
		livro.setPaginas(50);
		livro.setLancamento(false);

		System.out.println(livro.toString());

		Livro livro2 = new Livro("Java II");

		System.out.println(livro2.toString());

		Livro livro3 = new Livro(50);
		System.out.println(livro3.toString());

		Livro livro4 = new Livro("Java III", "Beltrano", 58, true);
		System.out.println(livro4.toString());

	}

}
