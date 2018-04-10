package br.com.devmedia.testeclasses;

import java.time.LocalDate;

public class ExpiravelMain {

	public static void main(String args[]) {
		 
        Assinatura assinatura = new Assinatura();
        assinatura.setDescricao("Assinatura MVP");
        assinatura.setCodigo(123);
        assinatura.setPreco(69.9);
        assinatura.setDataExpiracao(LocalDate.parse("2017-09-01"));
 
        Programa programa = new Programa();
        programa.exibirDiasAteExpirar(assinatura);
    }

}
