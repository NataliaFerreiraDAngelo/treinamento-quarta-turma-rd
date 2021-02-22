package br.com.rd.quartaturma.arraysecollections;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas que ser� inseridas : ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota : " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		
		for(double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		
		System.out.println("A Media das notas : " + media);
		entrada.close();
	}
}
