package Roadpmap.ExerciciosNv1;

import java.util.Scanner;

public class Exe7Inversao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome para vizualizar ele de trás para frente: ");
        String nome = sc.nextLine();


        for (int i = nome.length() - 1; i >=0; i--){
            System.out.print(nome.charAt(i));


        }

    }
}
