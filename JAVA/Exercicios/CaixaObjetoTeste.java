package br.com.rd.quartaturma.oo.generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		
		try{
			CaixaObjeto caixa = new CaixaObjeto();
			caixa.guardar(2.3);

			Double coisaA = (Double) caixa.abrir();
			System.out.println(coisaA);

			CaixaObjeto caixaB = new CaixaObjeto();
			caixaB.guardar("Teste");

			String coisaB = (String) caixa.abrir();
			System.out.println(coisaB);
			
		}catch(ClassCastException e) {
			System.out.println("Erro : Cast não Permitido");
		}
	}
}
