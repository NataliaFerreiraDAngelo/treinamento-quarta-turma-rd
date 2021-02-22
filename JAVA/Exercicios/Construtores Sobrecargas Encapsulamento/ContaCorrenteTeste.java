package br.com.rd.quartaturma.classes;

public class ContaCorrenteTeste {
	public static void main(String[] args) {
		
		long nr = ContaCorrente.getProximoNrConta();
		ContaCorrente contaCorrente = new ContaCorrente("Leo", 2345, nr);
		

		contaCorrente.setNome("Leo Barbosa");
		contaCorrente.setAgencia(4281);
			
		
		
	}
}
