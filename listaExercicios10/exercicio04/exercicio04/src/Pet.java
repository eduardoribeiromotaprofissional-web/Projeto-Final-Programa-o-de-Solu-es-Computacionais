public class Pet {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255

    public String nome; 
    public String especie;
    public String raca;
    public int idade;
    public double peso;

    public Pet(String nome, String especie, String raca, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }
    
    public void apresentar() {
        System.out.printf("Olá! Meu nome é %s, sou um(a) %s da raça %s.", nome, especie, raca);
        System.out.printf("\nTenho %d anos e peso %.1f kg.", idade, peso);
    }

    public void avaliarPeso() {
        if (peso < 30) {
            System.out.printf("\n%s está abaixo do peso ideal (30.0 kg).", nome);
        } else {
            System.out.printf("\n%s está acima do peso ideal (30.0 kg).", nome);
        }
    }
}
