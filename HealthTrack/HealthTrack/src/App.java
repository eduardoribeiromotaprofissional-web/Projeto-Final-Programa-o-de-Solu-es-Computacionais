import service.HealthService;
import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);

    static HealthService service = new HealthService();

    public static void exibirMenu() {

        System.out.println("\n=== HealthTrack - Menu Principal ===");
        System.out.println("1 - Atividades Físicas");
        System.out.println("2 - Dados Biométricos");
        System.out.println("3 - Hábitos de Saúde");
        System.out.println("4 - Relatório de Saúde");
        System.out.println("0 - Sair");
        System.out.print("\nEscolha: ");
    }

    public static void menuAtividades() {

        int opcao;

        do {

            System.out.println("\n=== Atividades Físicas ===");
            System.out.println("1 - Registrar atividade");
            System.out.println("2 - Listar atividades");
            System.out.println("3 - Atualizar atividade");
            System.out.println("4 - Remover atividade");
            System.out.println("5 - Filtrar atividades acima de duração");
            System.out.println("0 - Voltar");
            System.out.print("\nEscolha: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:

                    System.out.print("Digite a atividade: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a duração em minutos: ");
                    int duracao = Integer.parseInt(scanner.nextLine());

                    service.cadastrarAtividade(nome, duracao);

                    break;

                case 2:

                    service.listarAtividades();

                    break;

                case 3:

                    service.listarAtividades();

                    System.out.print("Digite o ID da atividade: ");
                    int idAtualizar = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nova atividade: ");
                    String novoNome = scanner.nextLine();

                    System.out.print("Nova duração: ");
                    int novaDuracao = Integer.parseInt(scanner.nextLine());

                    service.atualizarAtividade(idAtualizar, novoNome, novaDuracao);

                    break;

                case 4:

                    service.listarAtividades();

                    System.out.print("Digite o ID da atividade: ");
                    int idRemover = Integer.parseInt(scanner.nextLine());

                    service.removerAtividade(idRemover);

                    break;

                case 5:

                    System.out.print("Mostrar atividades acima de quantos minutos? ");

                    int minutos =
                            Integer.parseInt(scanner.nextLine());

                    service.filtrarAtividades(minutos);

                    break;

                case 0:

                    System.out.println("Voltando...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public static void menuBiometrico() {

        int opcao;

        do {

            System.out.println("\n=== Dados Biométricos ===");
            System.out.println("1 - Registrar dados");
            System.out.println("2 - Consultar dados");
            System.out.println("3 - Atualizar dados");
            System.out.println("4 - Remover dados");
            System.out.println("0 - Voltar");
            System.out.print("\nEscolha: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:

                    System.out.print("Digite o peso (em Kg): ");
                    double peso =
                            Double.parseDouble(scanner.nextLine());

                    System.out.print("Digite a altura (ex: 1.70): ");
                    double altura =
                            Double.parseDouble(scanner.nextLine());

                    System.out.print("Digite a idade: ");
                    int idade =
                            Integer.parseInt(scanner.nextLine());

                    service.cadastrarBiometria(
                            peso,
                            altura,
                            idade
                    );

                    break;

                case 2:

                    service.listarBiometria();

                    break;

                case 3:

                    service.listarBiometria();

                    System.out.print("Digite o ID do dado: ");
                    int idAtualizar =
                            Integer.parseInt(scanner.nextLine());

                    System.out.print("Novo peso (em Kg): ");
                    double novoPeso =
                            Double.parseDouble(scanner.nextLine());

                    System.out.print("Nova altura (ex: 1.70): ");
                    double novaAltura =
                            Double.parseDouble(scanner.nextLine());

                    System.out.print("Nova idade: ");
                    int novaIdade =
                            Integer.parseInt(scanner.nextLine());

                    service.atualizarBiometria(
                            idAtualizar,
                            novoPeso,
                            novaAltura,
                            novaIdade
                    );

                    break;

                case 4:

                    service.listarBiometria();

                    System.out.print("Digite o ID do dado: ");
                    int idRemover =
                            Integer.parseInt(scanner.nextLine());

                    service.removerBiometria(idRemover);

                    break;

                case 0:

                    System.out.println("Voltando...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public static void menuHabitos() {

        int opcao;

        do {

            System.out.println("\n=== Hábitos de Saúde ===");
            System.out.println("1 - Registrar hábito");
            System.out.println("2 - Listar hábitos");
            System.out.println("3 - Atualizar hábito");
            System.out.println("4 - Remover hábito");
            System.out.println("0 - Voltar");
            System.out.print("\nEscolha: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:

                    System.out.print("Digite o hábito: ");
                    String descricao = scanner.nextLine();

                    service.cadastrarHabito(descricao);

                    break;

                case 2:

                    service.listarHabitos();

                    break;

                case 3:

                    service.listarHabitos();

                    System.out.print("Digite o ID do hábito: ");
                    int idAtualizar = Integer.parseInt(scanner.nextLine());

                    System.out.print("Novo hábito: ");
                    String novoHabito = scanner.nextLine();

                    service.atualizarHabito(idAtualizar, novoHabito);

                    break;

                case 4:

                    service.listarHabitos();

                    System.out.print("Digite o ID do hábito: ");
                    int idRemover = Integer.parseInt(scanner.nextLine());

                    service.removerHabito(idRemover);

                    break;

                case 0:

                    System.out.println("Voltando...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public static void main(String[] args) {

        int opcao;

        do {

            exibirMenu();

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:

                    menuAtividades();
                    break;

                case 2:

                    menuBiometrico();
                    break;

                case 3:

                    menuHabitos();
                    break;

                case 4:

                    service.relatorioSaude();

                    break;

                case 0:

                    System.out.println("\nEncerrando o HealthTrack...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}