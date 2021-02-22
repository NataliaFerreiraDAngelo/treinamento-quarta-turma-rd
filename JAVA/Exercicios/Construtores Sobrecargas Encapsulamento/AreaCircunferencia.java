package br.com.rd.quartaturma.classes;

public class AreaCircunferencia {
	double raio;
	final static double PI = 3.1415;
	
	AreaCircunferencia(){
		
	}
	
	
	double calcularArea() {
		return PI *(Math.pow(raio, 2));
	}
}
