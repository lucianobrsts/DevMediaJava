package br.com.devmedia.estaticos;

public class MyClass extends Aula {

	@Override
	void imprimir() {
		System.out.println(Aula.nome + " " + new Aula().sobrenome);

		Aula.show();

		new Aula().imprimir();
	}

	static void show() {
		System.out.println(Aula.nome + " " + new Aula().sobrenome);
	}

}
