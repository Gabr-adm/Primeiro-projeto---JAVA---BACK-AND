package testing;

import java.util.Scanner;

public class comparacao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o 1° número:");
        int numero = entrada.nextInt();
        int maior = numero;

        for (int i = 2; i < 11; i++) {
            System.out.println(" Digite o " + i + "° número: ");
             numero = entrada.nextInt();
             maior = numero;

            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número digitado foi " + maior);


        entrada.close();

    }
}
