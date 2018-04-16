package br.com.devmedia.heranca;

public class Professor extends Pessoa {

	private Horas horas;

	public Horas getHoras() {
		return horas;
	}

	public void setHoras(Horas horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return super.toString() + "horas=" + horas + "]";
	}
	
	

}
