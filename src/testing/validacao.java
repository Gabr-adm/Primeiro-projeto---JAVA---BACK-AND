package testing;

import java.util.Scanner;

public class validacao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println(" Digite um número positivo: ");
        int numero = entrada.nextInt();
        int soma = 0;

        while (numero >= 0) {
           int total = soma += numero;
            System.out.println("Soma total: " + total);
            numero = entrada.nextInt();



        } if (numero < 0) {
            System.out.println("Você saiu do programa. ");

        }
    }
}
