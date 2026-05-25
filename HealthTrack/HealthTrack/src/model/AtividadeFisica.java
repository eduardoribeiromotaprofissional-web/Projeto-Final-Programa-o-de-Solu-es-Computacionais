package model;

public class AtividadeFisica extends RegistroSaude {

    private String nome;
    private int duracao;

    public AtividadeFisica(int id, String nome, int duracao) {
        super(id);
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Atividade: " + nome + " | Duração: " + duracao + " min";
    }
}