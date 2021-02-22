package br.com.rd.quartaturma.oo.excecoes;

public class Basico {

	 public static void main(String[] args) {
		 Aluno aluno = null;

		 try {
			 imprimirNomeDoAluno(aluno);
		 }catch(Exception e){
			 System.out.println("Erro ao imprimir nome do Aluno");
			 System.out.println(e.getMessage());
			 e.printStackTrace();
		 }
		 
		 try {
			 System.out.println(7/0);
		 }catch(ArithmeticException e) {
			 System.out.println("Erro de cálculo.");
			 System.out.println("Erro : " + e.getMessage());
			 e.printStackTrace();
		 }
		 
		 System.out.println("FIM :");
	}
	 
	 public static void imprimirNomeDoAluno(Aluno aluno) {
		 System.out.println(aluno.nome);
	 }
	
}
