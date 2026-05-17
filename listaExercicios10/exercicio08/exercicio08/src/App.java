public class App {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255
    public static void main(String[] args) {

        Personagem heroi = new Personagem("Aragorn", "Guerreiro", 5, 100, 100, 35, 20);
        Personagem inimigo = new Personagem("Orc Selvagem", "Inimigo", 7, 120, 120, 45, 30);
        
        heroi.atacar(inimigo);
        inimigo.atacar(heroi);
        heroi.exibirStatus();
        inimigo.exibirStatus();
    }
}