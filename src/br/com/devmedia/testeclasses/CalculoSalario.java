package br.com.devmedia.testeclasses;

public class CalculoSalario {

	int quantidadeAnos = 5;
	int horasTrabalhadas = 40;
	int valorHora = 50;
	int salario = 0;

	public int definirSalario() {
		if (quantidadeAnos <= 1) {
			salario = 1500 + (valorHora * horasTrabalhadas);
		} else if (quantidadeAnos > 1 && (quantidadeAnos < 3)) {
			salario = 2000 + (valorHora * horasTrabalhadas);
		} else {
			salario = 3000 + (valorHora * horasTrabalhadas);
		}
		
		return salario;
	}

}
