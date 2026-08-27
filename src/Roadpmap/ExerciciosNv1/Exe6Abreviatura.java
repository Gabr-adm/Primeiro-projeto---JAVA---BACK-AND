package Roadpmap.ExerciciosNv1;

import java.util.Scanner;

public class Exe6Abreviatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome para receber uma abreviatura: ");
        String nome = sc.nextLine();
        String abreviacao = "";

        for (int i = 0; i < nome.length(); i++){

            if (i == 0 || nome.charAt(i - 1) == ' ') {
                abreviacao += String.valueOf(nome.charAt(i)) + (". ");
            }
        }
        System.out.println(abreviacao);
    }
}
