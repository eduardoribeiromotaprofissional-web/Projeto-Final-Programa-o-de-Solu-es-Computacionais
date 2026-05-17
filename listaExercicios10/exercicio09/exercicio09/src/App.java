public class App {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255
    public static void main(String[] args) throws Exception {
        Hamburguer bigMac = new Hamburguer();
        bigMac.nome = "Big Mac";
        bigMac.descricao = "Pão com gergelim, dois hambúrgueres, queijo, alface, picles e molho especial";
        bigMac.preco = 36.90;

        Hamburguer whopper = new Hamburguer();
        whopper.nome = "Whopper";
        whopper.descricao = "Pão com gergelim, hambúrguer grelhado, tomate, alface, cebola, picles e maionese";
        whopper.preco = 39.90;

        Pedido pedido1 = new Pedido();
        pedido1.numeroPedido = 001;
        pedido1.nomeCliente = "Rafael";
        pedido1.item1 = bigMac;
        pedido1.item2 = whopper;

        pedido1.pagar();
        pedido1.exibirPedido();
    }
}
