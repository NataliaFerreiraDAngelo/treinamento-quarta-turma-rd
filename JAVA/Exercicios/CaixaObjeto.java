package br.com.rd.quartaturma.oo.generics;

public class CaixaObjeto {
	private Object coisa;
	
	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir() {
		return coisa;
	}
}
