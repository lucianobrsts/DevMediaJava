package br.com.devmedia.colecionador.aplicacao;

import java.util.Scanner;

import br.com.devmedia.colecionador.dominio.Colecionador;
import br.com.devmedia.colecionador.dominio.Item;

public class Programa {

	public static void main(String args[]) {
		Colecionador colecionador;
		Item item;
		String nomeDoColecionador, nomeDoItem;
		int ano;
		Scanner lerDados = new Scanner(System.in);

		System.out.print("Digite o nome do colecionador: ");
		nomeDoColecionador = lerDados.nextLine();
		colecionador = new Colecionador(nomeDoColecionador);

		while (true) {
			System.out.println("===============================");
			System.out.print("Informe o nome do Item: ");
			nomeDoItem = lerDados.nextLine();

			if (nomeDoItem.isEmpty()) {
				break;
			}

			System.out.print("Informe o ano em que esse item foi fabricado: ");
			ano = Integer.parseInt(lerDados.nextLine());

			item = new Item(nomeDoItem, ano);
			colecionador.getColecao().add(item);

		}

		System.out.println("A cole��o de " + colecionador.getNome() + " �: " + colecionador.getColecao());

		lerDados.close();
	}

}
