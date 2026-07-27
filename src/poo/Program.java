package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double alturaSoma = 0;
        int n = 0;



        List<People> people = new ArrayList<>();


        System.out.println("Digite a quantidade de pessoas irá ser informado:  ");
        n = sc.nextInt();
        int[] quantity = new int[n];

        System.out.println("Digite os dados da pessoa. ");
        for (int i = 0; i < quantity.length; i++){
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            alturaSoma += altura;

            System.out.println("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            People addPeaple = new People(nome, idade, altura);

            people.add(addPeaple);
        }

        System.out.println("Lista de Pessoas cadastradas: ");
        for (People peoples: people){
            System.out.println();
            System.out.println("\n" + peoples);
        }
        System.out.println("\nAltura média: " + (alturaSoma / n));







    }
}
