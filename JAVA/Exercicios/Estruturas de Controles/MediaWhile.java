package br.com.rd.quartaturma.estruturas;

import java.util.Scanner;

public class MediaWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota ou -1 para sair: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			}
		}
		
		double media = total / quantidadeDeNotas;
		System.out.println("Média das Notas: " + media);
		entrada.close();
	}
}
