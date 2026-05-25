package model;

public class DadoBiometrico extends RegistroSaude {

    private double peso;

    public DadoBiometrico(int id, double peso) {
        super(id);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Peso: " + peso + " kg";
    }
}