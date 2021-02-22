package br.com.rd.quartaturma.classes;

public class ContaCorrente {
	private String nome;
	private int agencia;
	private long conta;
	private static long proximoNrConta;
	
	//private static long qtdContasAbertas;
	
	
	ContaCorrente(String nomeInicial,
				  int agenciaInicial,
				  long contaInicial){
		nome = nomeInicial;
		agencia = agenciaInicial;
		conta = contaInicial;
		//qtdContasAbertas += qtdContas;
		
	
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public long getConta() {
		return conta;
	}
	
	public static long getProximoNrConta() {
		return proximoNrConta;
	}
	
}
