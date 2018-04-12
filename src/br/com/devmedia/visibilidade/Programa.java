package br.com.devmedia.visibilidade;

import br.com.devmedia.testeclasses.ClassB;

public class Programa extends ClassB {

	public static void main(String[] args) {
		ClassA a = new ClassA();

		a.pacote = "pacote a";
		a.protegido = "protegido a";
		a.publico = "publico a";

		ClassB b = new ClassB();
		b.publico = "public b";

		Programa prog = new Programa();
		prog.publico = "publico de b";
		prog.protegido = "protegido de b por herança.";

		ClassD d = new ClassD();
		d.metodoD();
	}

}
