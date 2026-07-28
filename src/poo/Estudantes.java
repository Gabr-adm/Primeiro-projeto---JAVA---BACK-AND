package poo;

import java.util.Scanner;

public class Estudantes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Quarto[] vetor = new Quarto[10];

        System.out.println("Digite quantas reservas serão feitas: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println("Aluguel #" + (i+1) + ":");

            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            System.out.println("Número do quarto: ");
            int numeroDoQuarto = sc.nextInt();

            vetor[numeroDoQuarto] = new Quarto(nome, email);
        }

        System.out.println("Reservas: ");
        for (int i = 1; i<10; i++){
            if (vetor[i] != null){
                System.out.println(i + ": " + vetor[i]);
            } else {
                System.out.println(i + ": " + "vazio. ");
            }
        }
    }
}
