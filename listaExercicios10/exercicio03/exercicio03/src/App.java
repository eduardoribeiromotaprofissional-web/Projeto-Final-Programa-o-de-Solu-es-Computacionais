public class App {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("Cerveja", 7.50, 100);
        produto1.vender(30);

        produto1.exibirInformacoes();
    }
}
