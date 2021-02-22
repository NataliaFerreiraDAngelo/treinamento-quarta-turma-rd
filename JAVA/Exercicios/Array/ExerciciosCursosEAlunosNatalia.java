package Exercicio1Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CursosEAlunos {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantidade de Alunos na turma A ? ");
		int qtdAlunosA = entrada.nextInt();

		Set<Integer> turmaA = new HashSet<>();

		int codigo;

		for (int a = 0; a < qtdAlunosA; a++) {
			System.out.println("Informe o código do aluno : " + (a + 1) + ": ");
			codigo = entrada.nextInt();
			turmaA.add(codigo);
		}

		System.out.println("Quantidade de Alunos na turma B ? ");
		int qtdAlunosB = entrada.nextInt();

		Set<Integer> turmaB = new HashSet<>();

		for (int b = 0; b < qtdAlunosB; b++) {
			System.out.println("Informe o código do aluno : " + (b + 1) + ": ");
			codigo = entrada.nextInt();
			turmaB.add(codigo);
		}

		System.out.println("Quantidade de Alunos na turma C ? ");
		int qtdAlunosC = entrada.nextInt();

		Set<Integer> turmaC = new HashSet<>();

		for (int b = 0; b < qtdAlunosC; b++) {
			System.out.println("Informe o código do aluno : " + (b + 1) + ": ");
			codigo = entrada.nextInt();
			turmaC.add(codigo);
		}

		HashSet<Integer> totalAlunos = new HashSet<>();

		totalAlunos.addAll(turmaA);
		totalAlunos.addAll(turmaB);
		totalAlunos.addAll(turmaC);

		System.out.println("Total de Alunos matriculados nas turmas A, B e C: " + totalAlunos.size() + ".");

		System.out.println("Tamanho turma A: " + turmaA.size() + ". Alunos matriculados: " + turmaA + ".");
		System.out.println("Tamanho turma B: " + turmaB.size() + ". Alunos matriculados: " + turmaB + ".");
		System.out.println("Tamanho turma C: " + turmaC.size() + ". Alunos matriculados: " + turmaC + ".");

		entrada.close();

	}
}
