package br.com.devmedia.testeclasses;

public class Programa {

	public void exibirDiasAteExpirar(Expiravel expiravel) {
		System.out.println("Dias restantes: " + expiravel.calculaPeriodoAteExpiracao().getDays());
	}

}
