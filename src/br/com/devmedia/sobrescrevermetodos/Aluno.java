package br.com.devmedia.sobrescrevermetodos;

public class Aluno extends Pessoa {

	@Override
	public void setMatricula(String matricula) {
		if (matricula.length() == 10) {
			super.setMatricula(matricula);
		} else {
			System.out.println("Matrícula inválida para o aluno " + getNome());
		}
	}

	@Override
	public void imprime(String cor, String tipo) {

	}

}
