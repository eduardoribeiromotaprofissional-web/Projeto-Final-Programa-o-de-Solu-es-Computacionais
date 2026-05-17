public class Filme {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public String titulo;
    public String diretor;
    public int anoLancamento;
    public int duracao;
    public double nota;

    public Filme(String titulo, String diretor, int anoLancamento, int duracao, double nota) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.nota = nota;
    }

    public String duracaoFormatada() {
        int horas = duracao / 60;
        int minutos = duracao % 60;

        return horas + "h " + minutos + "m";
    }

    public boolean recomendado() {
        return nota >= 7.0;
    }

    public void exibitDetalhes() {
        System.out.printf("Titulo: %s (%s)", titulo, anoLancamento);
        System.out.printf("\nDiretor: %s", diretor);
        System.out.println("\nDuração: " + duracaoFormatada());
        System.out.printf("Nota: %.1f", nota);
        if (recomendado()) {
            System.out.println("\nRecomendado: SIM");
        } else {
            System.out.println("\nRecomendado: NÃO");
        }
    }


}
