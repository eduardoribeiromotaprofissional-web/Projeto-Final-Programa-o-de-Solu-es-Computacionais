public class App {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255
    public static void main(String[] args) {

        Jogador atacante = new Jogador();
        atacante.nome = "Rafael";
        atacante.posicao = "Atacante";
        atacante.numeroCamisa = 17;
        atacante.gols = 23;

        Jogador goleiro = new Jogador();
        goleiro.nome = "Everson";
        goleiro.posicao = "Goleiro";
        goleiro.numeroCamisa = 22;
        goleiro.gols = 0;

        Time time = new Time();
        time.nome = "Atlético Mineiro";
        time.cidade = "Belo Horizonte";
        time.titulos = 47;

        time.artilheiro = atacante;
        time.goleiro = goleiro;

        time.apresentarTime();
        time.exibirDestaques();
        atacante.marcarGol();
        time.ganharTitulo("Copa do Brasil 2026");
    }
}