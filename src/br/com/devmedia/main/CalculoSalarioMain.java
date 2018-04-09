package br.com.devmedia.main;

import br.com.devmedia.testeclasses.CalculoSalario;

public class CalculoSalarioMain {

	public static void main(String[] args) {

		CalculoSalario cs = new CalculoSalario();

		System.out.println("Total Salário: " + cs.definirSalario());

	}

}
