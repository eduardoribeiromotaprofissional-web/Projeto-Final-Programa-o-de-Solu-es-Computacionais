package service;

import database.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HealthService {
    
    // ================= ATIVIDADES =================

    public void cadastrarAtividade(String nome, int duracao) {

        try {

            Connection conexao = Conexao.conectar();

            String sql =
                    "INSERT INTO atividade_fisica(nome, duracao) VALUES (?, ?)";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setInt(2, duracao);

            stmt.executeUpdate();

            System.out.println("Atividade cadastrada!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro ao cadastrar atividade!");
            e.printStackTrace();
        }
    }

    public void listarAtividades() {

        try {

            Connection conexao = Conexao.conectar();

            String sql = "SELECT * FROM atividade_fisica";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            System.out.println("\n--- Atividades ---");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " - " +
                                rs.getString("nome") + " - " +
                                rs.getInt("duracao") + " min"
                );
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro ao listar!");
            e.printStackTrace();
        }
    }

    public void atualizarAtividade(int id, String nome, int duracao) {

        try {

            Connection conexao = Conexao.conectar();

            String sql =
                    "UPDATE atividade_fisica SET nome=?, duracao=? WHERE id=?";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            stmt.setString(1, nome);
            stmt.setInt(2, duracao);
            stmt.setInt(3, id);

            stmt.executeUpdate();

            System.out.println("Atividade atualizada!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro ao atualizar!");
            e.printStackTrace();
        }
    }

    public void removerAtividade(int id) {

        try {

            Connection conexao = Conexao.conectar();

            String sql =
                    "DELETE FROM atividade_fisica WHERE id=?";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();

            System.out.println("Atividade removida!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro ao remover!");
            e.printStackTrace();
        }
    }

    public void filtrarAtividades(int minutos) {

        try {

            Connection conexao = Conexao.conectar();

            String sql =
                    "SELECT * FROM atividade_fisica WHERE duracao > ?";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            stmt.setInt(1, minutos);

            ResultSet rs = stmt.executeQuery();

            System.out.println("\n--- Atividades Filtradas ---");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " - " +
                                rs.getString("nome") + " - " +
                                rs.getInt("duracao") + " min"
                );
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    // ================= BIOMETRIA =================

    public void cadastrarBiometria(
            double peso,
            double altura,
            int idade
    ) {

        try {

            Connection conexao = Conexao.conectar();

            String verificar =
                    "SELECT COUNT(*) AS total FROM dado_biometrico";

            PreparedStatement stmtVerificar =
                    conexao.prepareStatement(verificar);

            ResultSet rs =
                    stmtVerificar.executeQuery();

            if (rs.next()) {

                if (rs.getInt("total") > 0) {

                    System.out.println(
                            "Os dados biométricos já foram cadastrados!"
                    );

                    rs.close();
                    stmtVerificar.close();
                    conexao.close();

                    return;
                }
            }

            String sql =
                    "INSERT INTO dado_biometrico(peso, altura, idade) VALUES (?, ?, ?)";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            stmt.setDouble(1, peso);
            stmt.setDouble(2, altura);
            stmt.setInt(3, idade);

            stmt.executeUpdate();

            System.out.println("Dado biométrico cadastrado!");

            rs.close();
            stmtVerificar.close();

            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    public void listarBiometria() {

        try {

            Connection conexao = Conexao.conectar();

            String sql = "SELECT * FROM dado_biometrico";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            System.out.println("\n--- Dados Biométricos ---");

            while (rs.next()) {

                double peso =
                        rs.getDouble("peso");

                double altura =
                        rs.getDouble("altura");

                double imc =
                        peso / (altura * altura);

                String situacao;

                if (imc < 18.5) {

                    situacao = "Abaixo do peso";

                } else if (imc < 25) {

                    situacao = "Peso normal";

                } else if (imc < 30) {

                    situacao = "Sobrepeso";

                } else {

                    situacao = "Obesidade";
                }

                System.out.println(
                        rs.getInt("id") + " - " +
                                "Peso: " + peso + "kg | " +
                                "Altura: " + altura + "m | " +
                                "Idade: " + rs.getInt("idade") + " | " +
                                "IMC: " + String.format("%.2f", imc) + " | " +
                                "Situação: " + situacao
                );
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    public void atualizarBiometria(
            int id,
            double peso,
            double altura,
            int idade
    ) {

        try {

            Connection conexao = Conexao.conectar();

            String sql =
                    "UPDATE dado_biometrico SET peso=?, altura=?, idade=? WHERE id=?";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            stmt.setDouble(1, peso);
            stmt.setDouble(2, altura);
            stmt.setInt(3, idade);
            stmt.setInt(4, id);

            stmt.executeUpdate();

            System.out.println("Atualizado!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    public void removerBiometria(int id) {

        try {

            Connection conexao = Conexao.conectar();

            String sql =
                    "DELETE FROM dado_biometrico WHERE id=?";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();

            System.out.println("Removido!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    // ================= HABITOS =================

    public void cadastrarHabito(String descricao) {

        try {

            Connection conexao = Conexao.conectar();

            String sql =
                    "INSERT INTO habito_saude(descricao) VALUES (?)";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            stmt.setString(1, descricao);

            stmt.executeUpdate();

            System.out.println("Hábito cadastrado!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    public void listarHabitos() {

        try {

            Connection conexao = Conexao.conectar();

            String sql = "SELECT * FROM habito_saude";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            System.out.println("\n--- Hábitos ---");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " - " +
                                rs.getString("descricao")
                );
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    public void atualizarHabito(int id, String descricao) {

        try {

            Connection conexao = Conexao.conectar();

            String sql =
                    "UPDATE habito_saude SET descricao=? WHERE id=?";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            stmt.setString(1, descricao);
            stmt.setInt(2, id);

            stmt.executeUpdate();

            System.out.println("Atualizado!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    public void removerHabito(int id) {

        try {

            Connection conexao = Conexao.conectar();

            String sql =
                    "DELETE FROM habito_saude WHERE id=?";

            PreparedStatement stmt =
                    conexao.prepareStatement(sql);

            stmt.setInt(1, id);

            stmt.executeUpdate();

            System.out.println("Removido!");

            stmt.close();
            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro!");
            e.printStackTrace();
        }
    }

    public void relatorioSaude() {

        try {

            Connection conexao = Conexao.conectar();

            System.out.println("\n=== Relatório ===");

            String sqlBiometria =
                    "SELECT * FROM dado_biometrico LIMIT 1";

            PreparedStatement stmtBiometria =
                    conexao.prepareStatement(sqlBiometria);

            ResultSet rsBiometria =
                    stmtBiometria.executeQuery();

            if (rsBiometria.next()) {

                double peso =
                        rsBiometria.getDouble("peso");

                double altura =
                        rsBiometria.getDouble("altura");

                double imc =
                        peso / (altura * altura);

                String situacao;

                if (imc < 18.5) {

                    situacao = "Abaixo do peso";

                } else if (imc < 25) {

                    situacao = "Peso normal";

                } else if (imc < 30) {

                    situacao = "Sobrepeso";

                } else {

                    situacao = "Obesidade";
                }

                System.out.println(
                        "\nPeso atual: " +
                                peso + "kg"
                );

                System.out.println(
                        "Altura: " +
                                altura
                );

                System.out.println(
                        "IMC: " +
                                String.format("%.1f", imc)
                );

                System.out.println(
                        "Situação: " +
                                situacao
                );
            }

            String sqlAtividades =
                    "SELECT COUNT(*) AS total FROM atividade_fisica";

            PreparedStatement stmtAtividades =
                    conexao.prepareStatement(sqlAtividades);

            ResultSet rsAtividades =
                    stmtAtividades.executeQuery();

            if (rsAtividades.next()) {

                System.out.println(
                        "\nAtividades cadastradas: " +
                                rsAtividades.getInt("total")
                );
            }

            String sqlHabitos =
                    "SELECT COUNT(*) AS total FROM habito_saude";

            PreparedStatement stmtHabitos =
                    conexao.prepareStatement(sqlHabitos);

            ResultSet rsHabitos =
                    stmtHabitos.executeQuery();

            if (rsHabitos.next()) {

                System.out.println(
                        "Hábitos cadastrados: " +
                                rsHabitos.getInt("total")
                );
            }

            rsBiometria.close();
            stmtBiometria.close();

            rsAtividades.close();
            stmtAtividades.close();

            rsHabitos.close();
            stmtHabitos.close();

            conexao.close();

        } catch (Exception e) {

            System.out.println("Erro no relatório!");
            e.printStackTrace();
        }
    }
}