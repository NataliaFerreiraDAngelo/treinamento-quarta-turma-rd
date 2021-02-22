package br.com.rd.quartaturma.oo.excecoes.personalizadaA;

import br.com.rd.quartaturma.oo.excecoes.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", -7);
			
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		}catch(StringVaziaException e) {
			System.out.println(e.getMessage());
		}catch(NumeroForaDoIntervaloException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
