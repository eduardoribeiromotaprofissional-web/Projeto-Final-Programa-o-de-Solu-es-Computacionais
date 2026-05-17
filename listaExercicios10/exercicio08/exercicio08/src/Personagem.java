public class Personagem {

    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public String nome;
    public String classe;
    public int nivel;
    public int pontosDeVida;
    public int pontosDeVidaMaximos;
    public int ataque;
    public int defesa;

    public Personagem(
        String nome,
        String classe,
        int nivel,
        int pontosDeVida,
        int pontosDeVidaMaximos,
        int ataque,
        int defesa
    ) {

        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeVidaMaximos = pontosDeVidaMaximos;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar(Personagem alvo) {

        int dano = this.ataque - alvo.defesa;

        if (dano < 1) {
            dano = 1;
        }

        alvo.receberDano(dano);
    }

    public void receberDano(int dano) {

        pontosDeVida -= dano;

        if (pontosDeVida < 0) {
            pontosDeVida = 0;
        }
    }

    public void curar(int valor) {

        pontosDeVida += valor;

        if (pontosDeVida > pontosDeVidaMaximos) {
            pontosDeVida = pontosDeVidaMaximos;
        }
    }

    public boolean estaVivo() {

        return pontosDeVida > 0;
    }

    public void subirNivel() {

        nivel++;

        ataque += 5;
        defesa += 3;
        pontosDeVidaMaximos += 10;

        pontosDeVida = pontosDeVidaMaximos;
    }

    public void exibirStatus() {
        System.out.printf("[%s - %s Nv.%d] HP: %d/%d | ATK: %d | DEF: %d%n",nome, classe, nivel, pontosDeVida, pontosDeVidaMaximos, ataque, defesa);
    }
}