package br.com.devmedia.ifelseternario;

public class ControleEstoque {

	public static void main(String[] args) {
		int estoque = 40;
		
		if(estoque >= 100) {
			System.out.println("Produto com quantidade suficiente...");
		} else if(estoque < 100 && estoque > 50) {
			System.out.println("Alerta: avaliar possibilidade de um novo pedido...");
		} else {
			System.out.println("Atenção: Faça um novo pedido...");
		}
	}

}
