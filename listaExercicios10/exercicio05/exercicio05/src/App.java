public class App {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255
    public static void main(String[] args) throws Exception {
        ContaBancaria conta = new ContaBancaria("Rafael", "0042-7", 2000);

        conta.depositar(1000);
        conta.sacar(1200);
        conta.exibirExtrato();
    }
}
