package br.com.rd.quartaturma.oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		
		Heroi j1 = new Heroi(10,10);
		
		Vilao j2 = new Vilao(10,11);
		

//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
		
		j1.atacar(j2);
		j2.atacar(j1);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		
	}
}
