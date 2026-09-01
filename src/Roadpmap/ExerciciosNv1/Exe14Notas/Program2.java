package Roadpmap.ExerciciosNv1.Exe14Notas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program2 {

    // Define as médias mínimas usadas para classificar os alunos.
    private static final double MEDIA_APROVACAO = 7.0;
    private static final double MEDIA_EXAME = 5.0;

    public static void main(String[] args) {

        // Caminho do arquivo criado pelo programa de cadastro dos alunos.
        String caminho = "/home/gabriel.jose/Documentos/Notas/Alunos.csv";

        // Listas que armazenam o nome e a média dos alunos de cada situação.
        List<String> aprovados = new ArrayList<>();
        List<String> emExame = new ArrayList<>();
        List<String> reprovados = new ArrayList<>();

        // Variáveis utilizadas para calcular a média geral da turma.
        double somaMedias = 0.0;
        int quantidadeAlunos = 0;

        // Guarda temporariamente o aluno que está sendo lido do arquivo.
        Aluno aluno = null;

        /*
         * Abre o arquivo para leitura. O try-with-resources fecha o leitor
         * automaticamente ao final, mesmo que aconteça algum erro.
         */
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;

            // Lê uma linha do arquivo por vez até chegar ao seu final.
            while ((linha = br.readLine()) != null) {
                // Remove espaços desnecessários do início e do final da linha.
                linha = linha.trim();

                // Ignora as linhas vazias existentes entre os alunos.
                if (linha.isEmpty()) {
                    continue;
                }

                /*
                 * Identifica o conteúdo de cada linha e armazena o valor no
                 * atributo correspondente do aluno atual.
                 */
                if (linha.startsWith("---Aluno---")) {
                    // O cabeçalho indica que a leitura de um novo aluno começou.
                    aluno = new Aluno();
                } else if (aluno != null && linha.startsWith("Nome:")) {
                    aluno.setNome(extrairValor(linha));
                } else if (aluno != null && linha.startsWith("Total de Caracteres:")) {
                    aluno.setTotalCaracteres(Integer.parseInt(extrairValor(linha)));
                } else if (aluno != null && linha.startsWith("Matricula:")) {
                    aluno.setMatricula(Integer.parseInt(extrairValor(linha)));
                } else if (aluno != null && linha.startsWith("Primeira nota:")) {
                    aluno.setNota1(Double.parseDouble(extrairValor(linha)));
                } else if (aluno != null && linha.startsWith("Segunda nota:")) {
                    aluno.setNota2(Double.parseDouble(extrairValor(linha)));

                    // A segunda nota completa os dados necessários para calcular a média.
                    double media = (aluno.getNota1() + aluno.getNota2()) / 2.0;
                    String resultado = String.format("%s - média: %.2f", aluno.getNome(), media);

                    // Coloca o aluno na lista correspondente à média alcançada.
                    if (media >= MEDIA_APROVACAO) {
                        aprovados.add(resultado);
                    } else if (media >= MEDIA_EXAME) {
                        emExame.add(resultado);
                    } else {
                        reprovados.add(resultado);
                    }

                    // Acumula a média e conta o aluno para o cálculo geral da turma.
                    somaMedias += media;
                    quantidadeAlunos++;
                }
            }

            // Exibe os alunos agrupados conforme a situação acadêmica.
            mostrarGrupo("Aprovados", aprovados);
            mostrarGrupo("Em exame", emExame);
            mostrarGrupo("Reprovados", reprovados);

            // Calcula a média da turma somente se algum aluno tiver sido lido.
            if (quantidadeAlunos > 0) {
                System.out.printf("%nMédia da turma: %.2f%n", somaMedias / quantidadeAlunos);
            } else {
                System.out.println("Nenhum aluno foi encontrado no arquivo.");
            }

        // Trata problemas de abertura ou leitura do arquivo.
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());

        // Trata valores que deveriam ser numéricos, mas estão em formato inválido.
        } catch (NumberFormatException e) {
            System.out.println("O arquivo possui um valor numérico inválido: " + e.getMessage());
        }
    }

    /*
     * Retorna somente o conteúdo localizado depois do primeiro caractere ':'.
     * Exemplo: "Nome: Gabriel" se transforma em "Gabriel".
     */
    private static String extrairValor(String linha) {
        int posicaoDoisPontos = linha.indexOf(':');
        return linha.substring(posicaoDoisPontos + 1).trim();
    }

    // Exibe o título do grupo e os alunos armazenados na lista recebida.
    private static void mostrarGrupo(String titulo, List<String> alunos) {
        System.out.println("\n" + titulo + ":");

        // Informa quando não existe nenhum aluno naquela situação.
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno.");
            return;
        }

        // Percorre a lista e exibe um aluno por linha.
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
