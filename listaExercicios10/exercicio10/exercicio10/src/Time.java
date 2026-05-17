public class Time {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public String nome;
    public String cidade;
    public int titulos;
    public Jogador artilheiro;
    public Jogador goleiro;

    public Time() {
    }

    public void apresentarTime() {
        System.out.printf("\n%s - %s | Titulos: %d", nome, cidade, titulos);
    }

    public void exibirDestaques() {
        System.out.printf("\n\nArtilheiro: ");
        artilheiro.exibirJogador();

        System.out.printf("\n\nGoleiro: ");
        goleiro.exibirJogador();
    }

    public void ganharTitulo(String nomeTitulo) {

        titulos++;

        System.out.printf("\n\n%s conquistou a %s! Agora com %d títulos!%n", nome, nomeTitulo, titulos);
    }
}
