package model;

public class HabitoSaude extends RegistroSaude {

    private String descricao;

    public HabitoSaude(int id, String descricao) {
        super(id);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Hábito: " + descricao;
    }
}