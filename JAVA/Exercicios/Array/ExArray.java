package br.com.rd.quartaturma.arraysecollections;

import java.util.Arrays;

public class ExArray {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		
		notasAlunoA[0] = 7.8;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		
		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.println(notasAlunoA[i]);
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println("Media Aluno A: " + totalAlunoA / notasAlunoA.length);
		
		
	}
}
