package br.com.rd.quartaturma.oo.excecoes.personalizadaA;

import br.com.rd.quartaturma.oo.excecoes.Aluno;

public class Validar {
	
	private Validar() {
		
	}
	
	public static void aluno(Aluno aluno) {
		
		if(aluno.nome == null) {
			throw new IllegalArgumentException("O aluno está nulo.");
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaDoIntervaloException("nota");
		}
	}
	
	public void calcularMedia() {
		
	}
}
