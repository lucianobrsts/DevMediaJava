package br.com.devmedia.javaoo;

public class Exemplo1 {
	int x = 1;
	String y = "Olá";
	String z = "Mundo!";

	public void soma(int a, int b) {
		int soma = a + b;
		System.out.println("A soma é " + soma);
	}

	public int subtracao(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Exemplo1 ex = new Exemplo1();

		int x2 = ex.x + 2;

		System.out.println("Valor de x: " + ex.x);
		System.out.println("Valor de x2: " + x2);

		System.out.println(ex.y + " " + ex.z);

		ex.soma(2, 5);

		int sub = ex.subtracao(10, 7);

		System.out.println("Resultado: " + sub);

		for (int i = 0; i < 5; i++) {
			ex.soma(x2, i);
		}
	}
}
