package Roadpmap.ExerciciosNv1;

import java.util.Scanner;

public class Exe12ArrayBidimenssional {

    public static void main(String[] args) {

        // Cria o Scanner responsável por ler os valores digitados pelo usuário.
        Scanner sc = new Scanner(System.in);

        /*
         * Define a quantidade de linhas e colunas e cria uma matriz 5 x 5.
         * Cada posição n[i][j] representa a distância entre duas cidades:
         * i representa a cidade de origem e j representa a cidade de destino.
         */
        int x = 5;
        int y = 5;
        int[][] n = new int[x][y];

        /*
         * Percorre todas as linhas e colunas da matriz para preencher seus
         * 25 elementos. O índice começa em 0, mas i + 1 e j + 1 são usados
         * na mensagem para apresentar linhas e colunas numeradas de 1 a 5.
         */
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Digite o valor da linha %d, coluna %d: ", i + 1, j + 1);
                n[i][j] = sc.nextInt();
            }
        }

        /*
         * Exibe a matriz preenchida em formato de tabela. O \t insere uma
         * tabulação entre os valores, e o println muda de linha sempre que
         * uma linha completa da matriz termina de ser exibida.
         */
        System.out.println("As distâncias entre as cidades já estão criadas, segue abaixo a tabela representativa: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }

        /*
         * Lê a quantidade de cidades que fará parte do percurso. O percurso
         * precisa conter pelo menos duas cidades para existir um deslocamento.
         * Uma cidade pode aparecer mais de uma vez no percurso.
         */
        System.out.println("Quantas cidades você percorrerá?: ");
        int tamanho = sc.nextInt();
        while (tamanho < 2) {
            System.out.println("O percurso deve possuir pelo menos duas cidades. Digite novamente: ");
            tamanho = sc.nextInt();
        }

        /*
         * Cria um array com o tamanho exato do percurso e armazena as cidades
         * na ordem em que serão visitadas. Cada valor deve estar entre 1 e 5,
         * pois a matriz contém somente essas cinco cidades.
         */
        int[] cidades = new int[tamanho];
        System.out.println("Quais cidades você percorrerá? Informe valores de 1 a 5:");
        for (int i = 0; i < tamanho; i++) {
            cidades[i] = sc.nextInt();

            // Continua pedindo a cidade enquanto o valor estiver fora de 1 a 5.
            while (cidades[i] < 1 || cidades[i] > 5) {
                System.out.println("Cidade inválida. Informe uma cidade de 1 a 5:");
                cidades[i] = sc.nextInt();
            }
        }

        // Acumula a soma das distâncias de todos os deslocamentos do percurso.
        int distanciaTotal = 0;

        /*
         * Percorre o array até a penúltima posição, pois cada repetição usa
         * uma cidade atual e a próxima cidade. Subtrair 1 transforma o número
         * informado pelo usuário (1 a 5) em um índice válido da matriz (0 a 4).
         * Em seguida, consulta a distância na matriz e acrescenta ao total.
         */
        for (int i = 0; i < tamanho - 1; i++) {
            int cidadeAtual = cidades[i] - 1;
            int proximaCidade = cidades[i + 1] - 1;

            distanciaTotal += n[cidadeAtual][proximaCidade];
        }

        // Apresenta a soma de todas as distâncias percorridas.
        System.out.println("Distância total percorrida: " + distanciaTotal + " km.");

        // Fecha o Scanner após o término das leituras.
        sc.close();
    }
}
