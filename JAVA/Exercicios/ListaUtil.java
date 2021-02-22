package br.com.rd.quartaturma.oo.generics;

import java.util.List;


public class ListaUtil<T> {

	public static Object getUltimo(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size());
	}
	
	public void teste(List<T> lista){

	}
}

