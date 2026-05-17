public class Jogador {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public String nome;
    public String posicao;
    public int numeroCamisa;
    public int gols;

    public Jogador() {
    }

    public void marcarGol() {
        gols++;
        System.out.printf("\n\nGOOOOL! %s marcou! Total: %d gols", nome, gols);
    }

    public void exibirJogador() {
        System.out.printf("\nJogador: %s", nome);
        System.out.printf("\nPosição: %s", posicao);
        System.out.printf("\nNúmero da camisa: %d", numeroCamisa);
        System.out.printf("\nGols: %d", gols);
    }
}
