public class Aluno {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;

    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprovado() {
        return calcularMedia() >= 6.0;
    }

    public void exibirBoletim() {
        System.out.println("Aluno: " + nome + " | " + "Matricula: " + matricula);
        System.out.println("Nota 1: " + nota1 + " | " + "Nota 2: " + nota2);
        System.out.println("Média: " + calcularMedia());
        
        if (aprovado()) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }
}
