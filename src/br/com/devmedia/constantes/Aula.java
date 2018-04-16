package br.com.devmedia.constantes;

public class Aula {

	public static final String OURO = "ouro";
	public static final String PAUS = "paus";
	public static final String ESPADAS = "espadas";
	public static final String COPAS = "copas";

	public static void main(String[] args) {
		String naipe = Aula.PAUS;

		switch (naipe) {
		case Aula.OURO:
			System.out.println("Sua carta � de ouro.");
			break;
		case Aula.PAUS:
			System.out.println("Sua carta � de paus.");
			break;
		case Aula.ESPADAS:
			System.out.println("Sua carta � de espadas.");
			break;
		case Aula.COPAS:
			System.out.println("Sua carta � de copas.");
			break;
		default:
			System.out.println("Nenhum naipe est� presente.");
			break;
		}
	}

}
