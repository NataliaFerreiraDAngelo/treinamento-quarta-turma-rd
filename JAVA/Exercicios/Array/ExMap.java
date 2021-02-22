package br.com.rd.quartaturma.arraysecollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExMap {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Ivo");
		usuarios.put(2, "Jonas");
		usuarios.put(3, "Andreia");
		usuarios.put(4, "Fabio");
		usuarios.put(5, "Leo");
		
//		System.out.println(usuarios.size());
//		System.out.println(usuarios.isEmpty());
		
//		System.out.println(usuarios.keySet());
//		System.out.println(usuarios.values());
//		System.out.println(usuarios.entrySet());
//		
//		System.out.println(usuarios.containsKey(4));
//		System.out.println(usuarios.containsValue("Andreia"));
//		
		System.out.println(usuarios.get(5));
		
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
		
	}
}
