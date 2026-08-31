// Define o pacote ao qual esta classe pertence.
package Roadpmap.ExerciciosNv1;

// Importa a classe Arrays para exibir o conteúdo do array.
import java.util.Arrays;
// Importa a classe Scanner para ler dados digitados pelo usuário.
import java.util.Scanner;

// Declara a classe principal do exercício.
public class Exe11Primos {

    // Método principal, onde a execução do programa começa.
    public static void main(String[] args) {

        // Cria um Scanner que lê os dados digitados no teclado.
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário um número inteiro maior que 1.
        System.out.println("Digite um número inteiro maior que 1: ");
        // Lê o número inteiro informado e o armazena em n.
        int n = sc.nextInt();

        // Repete a solicitação enquanto o número informado não for maior que 1.
        while (n <= 1) {
            // Informa que o usuário deve digitar um valor válido.
            System.out.println("Informe um número maior que 1: ");
            // Lê um novo número para substituir o valor inválido.
            n = sc.nextInt();
        }

        // Cria uma cópia de n para que o valor original não seja alterado.
        int numeroParaCalculo = n;
        // Começa a procurar fatores pelo menor número primo, que é 2.
        int divisor = 2;
        // Armazena quantos fatores primos serão encontrados.
        int quantidadeFatores = 0;

        // Primeira passagem: conta quantos fatores primos existem.
        // Continua a decomposição até o número ser completamente reduzido a 1.
        while (numeroParaCalculo > 1) {
            // Verifica se a divisão pelo divisor atual é exata.
            if (numeroParaCalculo % divisor == 0) {
                // Aumenta a quantidade porque um fator primo foi encontrado.
                quantidadeFatores++;
                // Divide o número pelo fator encontrado e guarda o resultado.
                numeroParaCalculo /= divisor;
            } else {
                // Tenta o próximo divisor quando a divisão não é exata.
                divisor++;
            }
        }

        // Cria o array com exatamente a quantidade de fatores encontrados.
        int[] fatoresPrimos = new int[quantidadeFatores];

        // Restaura o número original para repetir a decomposição.
        numeroParaCalculo = n;
        // Reinicia o divisor pelo menor número primo.
        divisor = 2;
        // Indica a próxima posição livre do array.
        int indice = 0;

        // Segunda passagem: armazena os fatores no array de tamanho exato.
        // Continua até o número ser completamente reduzido a 1 novamente.
        while (numeroParaCalculo > 1) {
            // Verifica se o número pode ser dividido exatamente pelo divisor.
            if (numeroParaCalculo % divisor == 0) {
                // Armazena o divisor encontrado na posição atual do array.
                fatoresPrimos[indice] = divisor;
                // Avança para a próxima posição livre do array.
                indice++;
                // Divide o número pelo fator que acabou de ser armazenado.
                numeroParaCalculo /= divisor;
            } else {
                // Tenta o próximo divisor quando a divisão não é exata.
                divisor++;
            }
        }

        // Exibe o número original e todos os seus fatores primos.
        System.out.println("Fatores primos de " + n + ": "
                // Converte o array em um texto no formato [valor, valor, ...].
                + Arrays.toString(fatoresPrimos));

        // Fecha o Scanner e libera o recurso utilizado para leitura.
        sc.close();
    }
}
