public class Hamburguer {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public String nome;
    public String descricao;
    public double preco;

    public Hamburguer() {
    }

    public void exibir() {
        System.out.printf("Nome: %s", nome);
        System.out.printf("\nDescrição: %s", descricao);
        System.out.printf("\nPreço: R$ %.2f", preco);
    }
}
