package Roadpmap.ExerciciosNv1;

import java.util.Random;
import java.util.Scanner;

public class Ex2Sorteio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int reposta = random.nextInt(10);

        System.out.println("Adivinhe qual número está armazenado: ");
        int n = sc.nextInt();
        int contador = 0;

        while (n != reposta){
            System.out.println("Número incorreto, tente novamente! ");
            n = sc.nextInt();
            contador++;

            if (n > reposta){
                System.out.println("O número digitado é maior do que está armazenado.");
            }
            else {
                System.out.println("O número digitado é menor do que está armazenado.");
            }
            if (n == reposta){
                System.out.println("Você acertou!!");
                break;
            }
        }
        System.out.println("Você tentou " + contador + " vezes até acertar.");



    }
}
