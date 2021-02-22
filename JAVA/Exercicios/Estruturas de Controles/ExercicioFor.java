package br.com.rd.quartaturma.estruturas;

public class ExercicioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		System.out.println("");
		
		for(String v = "#"; !v.contentEquals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
