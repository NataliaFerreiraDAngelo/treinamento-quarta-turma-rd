package br.com.rd.quartaturma.oo.excecoes;

import java.util.Scanner;

public class Finnaly {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Numero");
			System.out.println(7 / entrada.nextInt());
			
			
			
		}catch(Exception e) {
			System.out.println("TESTE");
			
		}finally {
			entrada.close();
			System.out.println("FIM :");
		}
		
	}
}
