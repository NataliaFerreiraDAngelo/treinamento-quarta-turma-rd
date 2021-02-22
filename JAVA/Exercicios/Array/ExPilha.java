package br.com.rd.quartaturma.arraysecollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExPilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.push("Aprenda Eletr�nica com Arduino");
		livros.push("De Bizancio para o mundo");
		livros.push("Os pilares da Terra");
		livros.push("A Firma");
		livros.push("Os dias antes de nenhum");
		livros.push("1984");
		livros.push("Use a Cabe�a Java");
		livros.push("Berlim 1961");
		
		System.out.println(livros.peek()); // retorna o elemento sem remov�-lo
		System.out.println(livros.poll()); // retorna o elemento e remove da pilha. Retorna null se a pilha estover vazia
		System.out.println(livros.pop()); // retorna o elemento e remove da pilha. Retorna uma exce��o se apilha estiver vazia.
		
		System.out.println(livros.toString());
		
//		for(String livro : livros) {
//			System.out.println(livro);
//		}
	}
}
