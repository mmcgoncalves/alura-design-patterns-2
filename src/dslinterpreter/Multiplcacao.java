package dslinterpreter;

public class Multiplcacao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;
	
	public Multiplcacao(Expressao esquerda, Expressao direita){
		this.esquerda = esquerda;
		this.direita = direita;
		
	}
	@Override
	public int avalia() {
		int resultadoDaEsquerda = esquerda.avalia();
        int resultadoDaDireita = direita.avalia();
        return resultadoDaEsquerda * resultadoDaDireita;
	}

}
