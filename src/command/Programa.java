package command;

public class Programa {

	public static void main(String[] args) {
        Pedido pedido = new Pedido("Mauro", 150.0);
        Pedido pedido2 = new Pedido("Teste", 250.0);
        
        FilaDeTrabalho fila = new FilaDeTrabalho();
        
        fila.adiciona(new PagaPedido(pedido));
        fila.adiciona(new PagaPedido(pedido2));
        fila.adiciona(new ConcluiPedido(pedido));

        fila.processa();
	}

}
