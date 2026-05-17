public class App {
    // Nome: Rafael Caetano Braga
    // Matrícula: 1261937255
    public static void main(String[] args) throws Exception {

        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2025;
        carro1.acelerar(60);
        carro1.frear(12);

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2020;
        carro2.acelerar(130);
        carro2.frear(40);

        System.out.println(carro1.retornarDados());
        System.out.println(carro2.retornarDados());
    }
}
