package testing;

import java.util.Scanner;
public class nota {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nota;

        System.out.println(" Digite sua nota: ");
        nota = entrada.nextInt();

        if (nota >= 7) {
            System.out.println(" Aprovado ");
        } else if (nota <= 7 && nota >= 4) {
            System.out.println(" Recuperação ");
        } else {
            System.out.println("Reprovado");
        }
    }
}
