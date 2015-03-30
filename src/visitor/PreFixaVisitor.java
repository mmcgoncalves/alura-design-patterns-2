package visitor;

public class PreFixaVisitor implements Visitor {

	public void visitaSoma(Soma soma) {
		System.out.print(" + ");
		System.out.print("(");
		soma.getEsquerda().aceita(this);
		soma.getDireita().aceita(this);
		System.out.print(")");

	}

	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print(" - ");
		System.out.print("(");
		subtracao.getEsquerda().aceita(this);
		subtracao.getDireita().aceita(this);
		System.out.print(")");
	}

	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());

	}
}
