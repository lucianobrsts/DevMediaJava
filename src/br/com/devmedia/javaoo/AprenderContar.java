package br.com.devmedia.javaoo;

public class AprenderContar {
	int resultado = 1;
	
	public void tabuada(int multiplicarPor) {
	
		System.out.println("Tabuada de " + multiplicarPor);
		System.out.println("-------------");
		for(int i = 1; i <= 10; i++) {
			resultado = i * multiplicarPor;
			System.out.println(multiplicarPor + " x " + i + " = " + resultado);
		}
		
	}

	public static void main(String[] args) {
		AprenderContar aprender = new AprenderContar();

		aprender.tabuada(10);
	}

}
