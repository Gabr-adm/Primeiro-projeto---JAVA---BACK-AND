package Roadpmap.ExerciciosNv1;

import java.util.Scanner;

public class Ex1Primos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para saber se é primo ou não: ");
        int n = sc.nextInt();
        
        if (n <= 1){
            System.out.printf("%d não é um número primo.", n);
        } else if (n % 2 == 0 && n != 2) {
            System.out.printf("%d não é um número primo.", n);
        } else {
            System.out.printf("%d é um número primo.", n);
        }
    }
}
