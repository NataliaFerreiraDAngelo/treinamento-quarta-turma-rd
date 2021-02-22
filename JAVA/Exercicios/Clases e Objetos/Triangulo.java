package br.com.rd.quartaturma.util;

public class Triangulo {

	public double area = 0;
	
	
	public double calcularArea(double base, double altura) {
		
		area = (base * altura) / 2;
		
		return area;
	}
}
