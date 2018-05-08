package br.com.devmedia.blocosestaticoseinstancia;

public class Aula {

	static int vStatic = 1;

	int vInstance = 1;

	static {
		System.out.println("bloco estático.");
		System.out.println(vStatic);
		System.out.println(new Aula().vInstance);
	}

	{
		System.out.println("Bloco de Instância");
		System.out.println(vStatic + vInstance);
		vStatic = 8;
	}

	public Aula() {
		super();
		System.out.println("new Aula()");
		this.vInstance = 9;
	}

	public static void main(String[] args) {
		Aula a = new Aula();
		a.vInstance = 5;
		System.out.println(a.vInstance);
	}

}
