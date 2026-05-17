public class App {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255
    public static void main(String[] args) throws Exception {
        Celular celular = new Celular("Samsung", "S23 FE", 80, false, 132, 256);

        celular.ligar();
        celular.carregarBateria(19);
        celular.usarArmazenamento(15);
        celular.exibirStatus();
    }
}
