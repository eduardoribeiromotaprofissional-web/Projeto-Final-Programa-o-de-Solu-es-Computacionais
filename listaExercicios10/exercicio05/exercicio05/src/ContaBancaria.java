public class ContaBancaria {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public String titular;
    public String numeroConta;
    public double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.printf("\nSaldo insuficiente, possui %.2f na conta", saldo);
        } else {
            saldo -= valor;
            System.out.printf("\nSacou R$ %.2f | saldo restante: %.2f", valor, saldo);
        }
    }

    public void exibirExtrato() {
        System.out.println("\n====== Extrato ======");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f", saldo);
        System.out.println("\n=====================");
    }
}