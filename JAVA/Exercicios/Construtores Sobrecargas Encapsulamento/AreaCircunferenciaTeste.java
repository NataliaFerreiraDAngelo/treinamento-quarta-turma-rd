package br.com.rd.quartaturma.classes;

public class AreaCircunferenciaTeste {
	public static void main(String[] args) {
		double raio = 0;
		final double PI = 3.1415;
		double teste = 0;
		
		teste = calcularArea(raio, PI);
		
		System.out.println("PI :" + teste);

	}
	
	static double calcularArea(double raio, double PI) {
		return PI * (Math.pow(raio, 2));
	}
}
