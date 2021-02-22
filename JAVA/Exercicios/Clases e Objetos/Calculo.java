package br.com.rd.quartaturma.main;

import java.util.Scanner;

import br.com.rd.quartaturma.util.Triangulo;



public class Calculo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Triangulo triangulo = new Triangulo();
		
		System.out.println(triangulo);
		System.out.println("Base: ");
		double base = entrada.nextDouble();
		
		System.out.println("Altura");
		double altura = entrada.nextDouble();
		
		double area = triangulo.calcularArea(base, altura);

		System.out.println("Área do Triangulo " + area);
		
		
		entrada.close();
	}
}
