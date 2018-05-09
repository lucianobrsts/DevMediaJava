package br.com.devmedia.classesaninhadas;

import java.time.LocalDate;

public class Aula {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.setNome("Ana");
		p.setSobrenome("Pinheiro");
		p.setDtNascimento(LocalDate.of(1975, 7, 20));

		System.out.printf("%s %s Possui %d anos, %d meses e %d dias.", p.getNome(), p.getSobrenome(),
				p.getIdade().getAnos(), p.getIdade().getMeses(), p.getIdade().getDias());

	}

}
