package br.com.rd.quartaturma.revisao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RevisaoMatriz {
	public static void main(String[] args) {
		
		Map<Integer, ArrayList> listaNomes = new HashMap<>();
		ArrayList<Double> notas = new ArrayList<>();
		
//		Map<Integer, Double> medias = new HashMap<>();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de Alunos : ");
		int qtdAluno = entrada.nextInt();
		
		System.out.print("Informe a quantidade de Notas : ");
		int qtdNotas = entrada.nextInt();
		
		Integer codAluno;

		try {
			for(int a = 0; a < qtdAluno; a++) {
				System.out.println("Informe o código do aluno.");
				codAluno = entrada.nextInt();
				for(int n = 0; n < qtdNotas; n++) {
					System.out.println("Informe as notas do Aluno :");
					notas.add(entrada.nextDouble());
				}
				listaNotasAlunos.put(codAluno, notas);
			}
		}catch(Exception e) {
			
		}
		
		listaNomes.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + " " + entry.getValue());  
		 });
		
		entrada.close();
	}
}
