package br.com.rd.quartaturma.arraysecollections;

import java.util.LinkedList;
import java.util.Queue;

public class ExFila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// offer e o add ==> Adicionam elementos na fila.
		// Diferença é o comportamento quando a fila está cheia.
		// add retorna um erro se a fila estiver cheia
		// offer rerorna false se a fila estiver cheia.
		fila.add("Leo");
		fila.offer("Ivo");
		fila.add("Fabio");
		fila.offer("Jona");
		fila.add("Andreia");
		fila.add("Patricia");
		
		System.out.println(fila.size());
		
		// Ambos retornam o primeiro elemento da fila
		// peek rerorna NULL se a fila estiver vazia
		// element rerorna um erro se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println(fila.size());
		System.out.println(fila.isEmpty());
		
		
		System.out.println(fila.poll()); // retornar false se a fila estiver vazia
		System.out.println(fila.remove()); // retorna exceção se a fila estiver vazia
		
		System.out.println(fila.size());
//		fila.size();
//		fila.clear();
//		fila.contains();
//		fila.isEmpty();
		
	}
}
