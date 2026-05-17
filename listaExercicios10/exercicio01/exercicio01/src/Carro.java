public class Carro {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public String marca;
    public String modelo;
    public int ano;

    private double velocidade = 0.0;

    public Carro() {
    }

    public void acelerar(double incremento) {
        velocidade += incremento;
    }

    public void frear(double decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    public String retornarDados() {
        return "Marca: " + marca + "| Modelo: " + modelo + "| Ano: " + ano + "| Velocidade: " + velocidade;
    }
}
