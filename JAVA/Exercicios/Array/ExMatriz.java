package br.com.rd.quartaturma.arraysecollections;

import java.util.Arrays;
import java.util.Scanner;

public class ExMatriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantidade de Alunos? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantidade de Notas por Aluno? ");
		int qtdNotas = entrada.nextInt();
		
		double[][] notasTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		
		for (int a = 0; a < notasTurma.length; a++) {
			for (int n = 0; n < notasTurma.length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: " , n + 1, a + 1);
				notasTurma[a][n] = entrada.nextDouble();
				total += notasTurma[a][n];
			}
		}
		
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Media da turma : " + media);
		
		for(double[] nota : notasTurma) {
			System.out.println(Arrays.toString(nota));
		}
		entrada.close();
	}
}
