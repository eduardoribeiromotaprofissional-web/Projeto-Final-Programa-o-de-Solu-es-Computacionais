public class Celular {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public String marca;
    public String modelo;
    public int bateria;
    public boolean ligado;
    public double armazenamentoUsado;
    public double armazenamentTotal;

    public Celular(String marca, String modelo, int bateria, boolean ligado, double armazenamentoUsado, double armazenamentTotal) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.ligado = ligado;
        this.armazenamentoUsado = armazenamentoUsado;
        this.armazenamentTotal = armazenamentTotal;
    }

    public void ligar() {
        if (bateria > 0) {
            ligado = true;
        }
    }

    public void desligar() {
        ligado = false;
    }

    public void carregarBateria(int percentual) {
        bateria += percentual;
        if (bateria > 100) {
            bateria = 100;
        }
    }

    public void usarArmazenamento(double gb) {
        double armazenamentoLivre = armazenamentTotal - armazenamentoUsado;
        if (armazenamentoLivre <= gb) {
            armazenamentoUsado += gb;
        }
    }
    
    public void exibirStatus() {
        String status;
        if (ligado) {
            status = "LIGADO";
        } else {
            status = "DESLIGADO";
        }

        System.out.printf("\n%s %s - %s", marca, modelo, status);
        System.out.printf("\nBateria: %d%%", bateria);
        System.out.printf("\nArmazenamento: %.1f GB / %.1f GB usados", armazenamentTotal, armazenamentoUsado);
    }
}
