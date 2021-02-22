package br.com.rd.quartaturma.oo.excecoes.personalizadaA;

public class StringVaziaException extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo %s est� vazio.", nomeDoAtributo);
	}
}
