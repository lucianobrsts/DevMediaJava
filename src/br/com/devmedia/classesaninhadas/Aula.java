package br.com.devmedia.classesaninhadas;

public class Aula {

	public static void main(String[] args) {

		// Pessoa p = new Pessoa();
		// p.setNome("Ana");
		// p.setSobrenome("Pinheiro");
		// p.setDtNascimento(LocalDate.of(1975, 7, 20));
		//
		// System.out.printf("%s %s Possui %d anos, %d meses e %d dias.", p.getNome(),
		// p.getSobrenome(),
		// p.getIdade().getAnos(), p.getIdade().getMeses(), p.getIdade().getDias());

		// System.out.println("Multiplicação = " + new Aula().getCalculo(9, 5));

		Calculo c = new Calculo();

		System.out.println("Soma = " + c.somar(10, 5));

		System.out.println("Multiplica = " + c.multiplicar(10, 5));

	}

	// int getCalculo(int x, int y) {
	//
	// System.out.println("Valor de X = " + x);
	//
	// System.out.println("Valor de Y = " + y);
	//
	// int z = 10;
	//
	// class Calculo {
	//
	// private int a;
	// private int b;
	//
	// Calculo() {
	//
	// }
	//
	// Calculo(int a, int b) {
	// this.a = a;
	// this.b = b;
	// }
	//
	// int soma() {
	// return x + y;
	// }
	//
	// int multiplicar() {
	// return a * b * z;
	// }
	// }
	//
	// System.out.println("Soma = " + new Calculo().soma());
	//
	// return new Calculo(10, 2).multiplicar();
	// }
}
