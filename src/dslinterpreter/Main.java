package dslinterpreter;

public class Main {

	public static void main(String[] args) {
		Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));       

        Expressao conta = new Soma(esquerda, direita);

        int resultado = conta.avalia();
        System.out.println(resultado);
        
        Expressao multiplicacao = new Multiplcacao(esquerda, direita);
        System.out.println(multiplicacao.avalia());
        
        Expressao divisao = new Divisao(esquerda, direita);
        System.out.println(divisao.avalia());
	}

}
