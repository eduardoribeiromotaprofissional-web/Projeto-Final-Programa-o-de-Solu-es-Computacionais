public class Pedido {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public int numeroPedido;
    public String nomeCliente;
    public Hamburguer item1;
    public Hamburguer item2;
    public boolean pago;

    public Pedido() {
    }

    public double calcularTotal() {
        double total = 0;

        if (item1 != null) {
            total += item1.preco;
        }

        if (item2 != null) {
            total += item2.preco;
        }

        return total;
    }

    public void pagar() {
        pago = true;
    }

    public void exibirPedido() {
        System.out.printf("===== PEDIDO #%d =====", numeroPedido);
        System.out.printf("\nCliente: %s", nomeCliente);

        if (item1 != null) {
            System.out.printf("\nItem 1: %s - R$ %.2f", item1.nome, item1.preco);
        }

        if (item2 != null) {
            System.out.printf("\nItem 2: %s - R$ %.2f", item2.nome, item2.preco);
        }

        System.out.printf("\nTotal: R$ %.2f", calcularTotal());

        if (pago) {
            System.out.printf("\nStatus: PAGO");
        } else {
            System.out.printf("\nStatus: PENDENTE");
        }
    }
}
