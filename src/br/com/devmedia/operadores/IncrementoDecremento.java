package br.com.devmedia.operadores;

public class IncrementoDecremento {

	public static void main(String[] args) {
		int numero = 10;
		int desafio1 = 5;
		int desafio2 = 5;

		numero++;

		System.out.println("O valor de número é: " + numero);

		numero--;

		System.out.println("O valor de número é: " + numero);
		
		System.out.println();
		
		System.out.print(desafio1 += ++desafio1);

		System.out.print(desafio2 += desafio2++);
		
		

	}

}
