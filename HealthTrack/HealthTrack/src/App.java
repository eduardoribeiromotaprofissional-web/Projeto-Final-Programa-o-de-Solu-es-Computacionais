import java.util.Scanner;
public class App {

    static Scanner scanner = new Scanner(System.in);

    static String[] atividades = null;
    static double[] pesos = null;
    static String[] habitos = null;

    static boolean atividadesCadastradas = false;
    static boolean biometriaCadastrada = false;
    static boolean habitosCadastrados = false;

    public static void exibirMenu() {
        System.out.println("\n=== HealthTrack - Menu Principal ===");
        System.out.println("1 - Atividades Físicas");
        System.out.println("2 - Dados Biométricos");
        System.out.println("3 - Hábitos de Saúde");
        System.out.println("0 - Sair");
        System.out.print("\nEscolha: ");
    }

    public static void listarAtividades() {
        System.out.println("\n--- Atividades Cadastradas ---");

        for (int i = 0; i < atividades.length; i++) {
            if (atividades[i] == null) {
                System.out.println((i + 1) + " - vazio");
            } else {
                System.out.println((i + 1) + " - " + atividades[i]);
            }
        }
    }

    public static void menuAtividades() {
        int opcao;

        do {
            System.out.println("\n=== Atividades Físicas ===");
            System.out.println("1 - Registrar atividade");
            System.out.println("2 - Listar atividades");
            System.out.println("3 - Atualizar atividade");
            System.out.println("4 - Remover atividade");
            System.out.println("0 - Voltar");
            System.out.print("\nEscolha: ");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {

                case 1:

                    if (atividadesCadastradas) {
                        System.out.println("As atividades já foram cadastradas!");
                    } else {

                        System.out.print("Quantas atividades deseja cadastrar? ");
                        int tamanho = Integer.parseInt(scanner.nextLine());

                        atividades = new String[tamanho];

                        for (int i = 0; i < atividades.length; i++) {
                            System.out.print("Digite a atividade " + (i + 1) + ": ");
                            atividades[i] = scanner.nextLine();
                        }

                        atividadesCadastradas = true;
                    }
                    break;

                case 2:

                    if (!atividadesCadastradas) {
                        System.out.println("Cadastre primeiro!");
                    } else {
                        listarAtividades();
                    }
                    break;

                case 3:

                    if (!atividadesCadastradas) {
                        System.out.println("Cadastre primeiro!");
                    } else {

                        listarAtividades();

                        System.out.print("Qual atividade deseja atualizar? ");
                        int pos = Integer.parseInt(scanner.nextLine());

                        if (pos < 1 || pos > atividades.length) {
                            System.out.println("Posição inválida!");
                        } else {

                            int i = pos - 1;

                            if (atividades[i] == null) {
                                System.out.println("Posição vazia!");
                            } else {
                                System.out.print("Nova atividade: ");
                                atividades[i] = scanner.nextLine();

                                System.out.println("Atualizado com sucesso!");
                            }
                        }
                    }
                    break;

                case 4:

                    if (!atividadesCadastradas) {
                        System.out.println("Cadastre primeiro!");
                    } else {

                        listarAtividades();

                        System.out.print("Qual atividade deseja remover? ");
                        int pos = Integer.parseInt(scanner.nextLine());

                        if (pos < 1 || pos > atividades.length) {
                            System.out.println("Posição inválida!");
                        } else {

                            int i = pos - 1;

                            if (atividades[i] == null) {
                                System.out.println("Já está vazio!");
                            } else {
                                atividades[i] = null;

                                System.out.println("Removido com sucesso!");
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public static void listarPesos() {

        System.out.println("\n--- Dados Biométricos ---");

        for (int i = 0; i < pesos.length; i++) {

            if (pesos[i] == -1) {
                System.out.println((i + 1) + " - vazio");
            } else {
                System.out.println((i + 1) + " - " + pesos[i] + " kg");
            }
        }
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

                    if (biometriaCadastrada) {
                        System.out.println("Os dados já foram cadastrados!");
                    } else {

                        System.out.print("Quantos pesos deseja cadastrar? ");
                        int tamanho = Integer.parseInt(scanner.nextLine());

                        pesos = new double[tamanho];

                        for (int i = 0; i < pesos.length; i++) {

                            do {
                                System.out.print("Digite o peso " + (i + 1) + ": ");
                                pesos[i] = Double.parseDouble(scanner.nextLine());

                                if (pesos[i] <= 0) {
                                    System.out.println("Peso inválido!");
                                }

                            } while (pesos[i] <= 0);
                        }

                        biometriaCadastrada = true;
                    }
                    break;

                case 2:

                    if (!biometriaCadastrada) {
                        System.out.println("Cadastre primeiro!");
                    } else {
                        listarPesos();
                    }
                    break;

                case 3:

                    if (!biometriaCadastrada) {
                        System.out.println("Cadastre primeiro!");
                    } else {

                        listarPesos();

                        System.out.print("Qual dado deseja atualizar? ");
                        int pos = Integer.parseInt(scanner.nextLine());

                        if (pos < 1 || pos > pesos.length) {
                            System.out.println("Posição inválida!");
                        } else {

                            int i = pos - 1;

                            System.out.print("Novo peso: ");
                            pesos[i] = Double.parseDouble(scanner.nextLine());

                            System.out.println("Atualizado com sucesso!");
                        }
                    }
                    break;

                case 4:

                    if (!biometriaCadastrada) {
                        System.out.println("Cadastre primeiro!");
                    } else {

                        listarPesos();

                        System.out.print("Qual dado deseja remover? ");
                        int pos = Integer.parseInt(scanner.nextLine());

                        if (pos < 1 || pos > pesos.length) {
                            System.out.println("Posição inválida!");
                        } else {

                            int i = pos - 1;

                            pesos[i] = -1;

                            System.out.println("Removido com sucesso!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public static void listarHabitos() {

        System.out.println("\n--- Hábitos de Saúde ---");

        for (int i = 0; i < habitos.length; i++) {

            if (habitos[i] == null) {
                System.out.println((i + 1) + " - vazio");
            } else {
                System.out.println((i + 1) + " - " + habitos[i]);
            }
        }
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

                    if (habitosCadastrados) {
                        System.out.println("Os hábitos já foram cadastrados!");
                    } else {

                        System.out.print("Quantos hábitos deseja cadastrar? ");
                        int tamanho = Integer.parseInt(scanner.nextLine());

                        habitos = new String[tamanho];

                        for (int i = 0; i < habitos.length; i++) {

                            System.out.print("Digite o hábito " + (i + 1) + ": ");
                            habitos[i] = scanner.nextLine();
                        }

                        habitosCadastrados = true;
                    }
                    break;

                case 2:

                    if (!habitosCadastrados) {
                        System.out.println("Cadastre primeiro!");
                    } else {
                        listarHabitos();
                    }
                    break;

                case 3:

                    if (!habitosCadastrados) {
                        System.out.println("Cadastre primeiro!");
                    } else {

                        listarHabitos();

                        System.out.print("Qual hábito deseja atualizar? ");
                        int pos = Integer.parseInt(scanner.nextLine());

                        if (pos < 1 || pos > habitos.length) {
                            System.out.println("Posição inválida!");
                        } else {

                            int i = pos - 1;

                            System.out.print("Novo hábito: ");
                            habitos[i] = scanner.nextLine();

                            System.out.println("Atualizado com sucesso!");
                        }
                    }
                    break;

                case 4:

                    if (!habitosCadastrados) {
                        System.out.println("Cadastre primeiro!");
                    } else {

                        listarHabitos();

                        System.out.print("Qual hábito deseja remover? ");
                        int pos = Integer.parseInt(scanner.nextLine());

                        if (pos < 1 || pos > habitos.length) {
                            System.out.println("Posição inválida!");
                        } else {

                            int i = pos - 1;

                            habitos[i] = null;

                            System.out.println("Removido com sucesso!");
                        }
                    }
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

            try {
                opcao = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números!");
                opcao = -1;
                continue;
            }

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

                case 0:
                    System.out.println("\nEncerrando o HealthTrack. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}