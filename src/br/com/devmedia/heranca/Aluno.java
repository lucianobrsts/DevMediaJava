package br.com.devmedia.heranca;

import java.time.LocalDate;

public class Aluno extends Pessoa {

	private Turno turno;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String sobrenome, LocalDate dataNascimento, char sexo, Turno turno) {
		super(nome, sobrenome, dataNascimento, sexo);
		this.turno = turno;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return super.toString() + "turno=" + turno + "]";
	}

}
