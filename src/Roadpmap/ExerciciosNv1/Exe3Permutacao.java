package Roadpmap.ExerciciosNv1;

import java.util.Arrays;
import java.util.Scanner;

public class Exe3Permutacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        String s1 =  String.valueOf(numero1);
        String s2 = String.valueOf(numero2);

        char[] n1 = s1.toCharArray();
        char[] n2 = s2.toCharArray();

        Arrays.sort(n1);
        Arrays.sort(n2);

        if (Arrays.equals(n1,n2)){
            System.out.println("Os números são permutações. ");
        }
        else {
            System.out.println("Os números NÃO são permutações ");
        }
        sc.close();

        System.out.println(Arrays.toString(n1));
    }
}
