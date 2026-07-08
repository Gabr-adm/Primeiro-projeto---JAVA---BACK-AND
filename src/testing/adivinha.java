package testing;

import java.util.Scanner;

public class adivinha {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroSecreto = 16;
        int resposta;


        for (int tentativas = 10; tentativas > 0; tentativas--){

            System.out.println( "Adivinhe um número de 0 a 100: ");
            resposta = entrada.nextInt();

            if (resposta == numeroSecreto) {
                System.out.println(" Você acertou! ");
                break;

            } else {
                if (resposta > numeroSecreto){
                    System.out.println(" O número informado é maior do que o número Secreto. ");
                    System.out.println(" Tentativas restantes: " + (tentativas - 1) + " restantes ");
                } else if (resposta < numeroSecreto){
                    System.out.println(" O número informado é menor do que o número Secreto. ");
                    System.out.println(" Tentativas restantes: " + (tentativas - 1) + " restantes ");
                }

            }





        }

    }
}
