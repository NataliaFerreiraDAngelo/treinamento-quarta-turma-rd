package br.com.rd.quartaturma.arraysecollections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHomogeneo {
	public static void main(String[] args) {
//		Set<String> listaDeAprovados = new HashSet<>();
		SortedSet<String> listaDeAprovados = new TreeSet<>();
		
		listaDeAprovados.add("Ana");
		listaDeAprovados.add("Carlos");
		listaDeAprovados.add("Lucca");
		listaDeAprovados.add("Pedro");
		
		for(String candidato : listaDeAprovados) {
			System.out.println(candidato);
		}
		
		System.out.println();
		
//		Set<Integer> nums = new HashSet<>();
		SortedSet<Integer> nums = new TreeSet<>();
				
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n : nums) {
			System.out.println(n);
		}
	}
}
