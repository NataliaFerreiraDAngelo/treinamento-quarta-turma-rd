package br.com.rd.quartaturma.arraysecollections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoHeterogeneo {
	public static void main(String[] args) {
		Set conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho : " + conjunto.size());
//		System.out.println(conjunto.contains('x'));
//		System.out.println(conjunto.contains(false));
//		System.out.println(conjunto.contains(true));
		
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println("Tamanho : " + conjunto.size());
		
		HashSet nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums); // União de conjuntos
		
		conjunto.retainAll(nums); // Intersecção de conjuntos
		System.out.println("Intersecção : " + conjunto);
	}
}
