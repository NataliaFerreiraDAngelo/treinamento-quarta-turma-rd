package br.com.rd.quartaturma.oo.excecoes;

public class Causa {
	public static void main(String[] args) throws Exception{
		
			metodoA(null);

	}
	
	static void metodoA(Aluno aluno) throws Exception{
		
			metodoB(aluno);

	}
	
	static void metodoB(Aluno aluno) throws Exception{
		if(aluno == null) {
			throw new Exception();
		}
		
		System.out.println(" FIM :");

	}
}
