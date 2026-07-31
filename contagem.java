package testing;

import java.time.LocalDate;
import java.util.Scanner;

public class contagem {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int ano;

        System.out.println("Digite o ano atual ou o ano que você gostaria de saber se é bissexto ou não: ");
        ano = entrada.nextInt();


                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    System.out.println("O ano " + ano + " é bissexto.");
                } else {
                    System.out.println("O ano " + ano + " não é bissexto.");
                }

    }
}
