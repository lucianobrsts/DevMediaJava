package br.com.devmedia.polimorfismo;

public class Programa {

	private Veiculo veiculo;
	private Carro carro;
	private Moto moto;

	void veiculos() {
		veiculo = new Ford();
		veiculo.setCor("Amarelo");
		veiculo.setPeso(600);
		System.out.println(veiculo.toString());

		veiculo = new Yamaha(); // up cast
		veiculo.setCor("Preta");
		veiculo.setPeso(120);
		System.out.println(veiculo.toString());

		Yamaha m = (Yamaha) veiculo; // Down cast
		m.setNome("Fazer 300");
		System.out.println(m.toString() + ", " + m.getNome());

	}

	void carrosEMotos() {
		carro = new Ford();
		carro.setCor("Preta");
		carro.setPeso(600);
		System.out.println(carro.toString());

		moto = new Yamaha();
		moto.setCor("Azul");
		moto.setPeso(120);
		moto.setNome("Fazer 250");
		System.out.println(moto.toString() + ", " + moto.getNome());

	}

	public static void main(String[] args) {

		new Programa().veiculos();

		Ford f = new Ford();
		f.setCor("Preta");
		f.setPeso(600);
		System.out.println(f.toString());

		Yamaha y = new Yamaha();
		y.setCor("Azul");
		y.setPeso(120);
		System.out.println(y.toString());

	}

}
