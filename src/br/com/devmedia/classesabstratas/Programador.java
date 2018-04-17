package br.com.devmedia.classesabstratas;

public class Programador extends Funcionario {

	@Override
	public double calculaSalario() {
		return (getSalario() * 0.25) + getSalario();
	}

}
