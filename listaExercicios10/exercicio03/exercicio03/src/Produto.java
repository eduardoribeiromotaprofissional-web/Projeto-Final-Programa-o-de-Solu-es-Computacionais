public class Produto {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void vender(int quantidade) {
        if (quantidade > quantidadeEstoque) {
            System.out.println("Não tem essa quantide em estoque! Quantidade disponível: " + quantidadeEstoque);
        } else {
            quantidadeEstoque -= quantidade;
        }
    }

    public void repor(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidadeEstoque;
    }

    public void exibirInformacoes() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d", nome, preco, quantidadeEstoque);
        System.out.printf("\nValor total em estoque: R$ %.2f", calcularValorTotal());
    }
}
