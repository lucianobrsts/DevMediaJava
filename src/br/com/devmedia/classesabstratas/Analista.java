package br.com.devmedia.classesabstratas;

public class Analista extends Funcionario {

	@Override
	public double calculaSalario() {
		return (getSalario() * 0.40) + getSalario();
	}

}
