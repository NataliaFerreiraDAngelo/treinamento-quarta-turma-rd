package br.com.rd.quartaturma.oo.excecoes;

public class ChecadaNaoChecada {
	
	public static void main(String[] args) {
		try {
			gerarErro1();
		}catch(RuntimeException rx) {
			System.out.println(rx.getMessage());
		}
		
		try {
			gerarErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("FIM DA EXECUÇÃO : ");
	}
	
	static void gerarErro1() {
		throw new RuntimeException("Ocorreu um erro #01.");
	}
	
	static void gerarErro2() throws Exception {
		throw new Exception("Ocorreu um erro #02.");
	}
}
