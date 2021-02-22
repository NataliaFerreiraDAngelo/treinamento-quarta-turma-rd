package br.com.rd.quartaturma.revisao;

import java.util.Scanner;

public class RevisaoArray {
	public static void main(String[] args) {
		int tamanho;
		
		Scanner entrada = new Scanner(System.in);
		    System.out.print("Tamanho do Array: ");
			tamanho = entrada.nextInt(); // 5
		entrada.close();
		
		int[] numero = new int[tamanho];
		
		// array[lista] = valor;
		
		int i = 0; // índice
		int j = 1; // valores j + 2
		
		for(int k = i; k < tamanho; k++) {
			j += 2;
			numero[k] = j;
		}
		
		for (int j2 = 0; j2 < numero.length; j2++) {
			System.out.print(numero[j2]);
		}
	}
}
