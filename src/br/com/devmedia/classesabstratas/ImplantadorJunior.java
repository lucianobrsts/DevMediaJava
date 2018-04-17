package br.com.devmedia.classesabstratas;

public class ImplantadorJunior extends Implantador {

	@Override
	public double calculaSalario() {
		return (getSalario() * 0.15) + getSalario();
	}

}
