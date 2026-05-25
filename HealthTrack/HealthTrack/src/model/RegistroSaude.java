package model;

public abstract class RegistroSaude {

    private int id;

    public RegistroSaude(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}