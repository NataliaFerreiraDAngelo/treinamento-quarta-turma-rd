package br.com.rd.quartaturma.classes;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4356.89, 0.25);
		
		Produto prodGrazi = new Produto();
		
		prodGrazi.setNome("Caneta");
				
		System.out.println(p1.getNome());
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = prodGrazi.precoComDesconto(0.25);
		
		System.out.println("Pre�o " + p1.nome.getNome() + " � " + precoFinal1);
		System.out.println("Pre�o " + prodGrazi.getNome() + " � " + precoFinal2);
	}
}
