package poo;

import java.util.Scanner;

public class VetoresDesafio2 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int total = 0;


        System.out.println("Digite um número para definir o tamanho da sua lista: ");
        int n = 0;
        n = entrada.nextInt();
        int[] vetor = new int[n];


        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número: ");
            vetor[i] = entrada.nextInt();
            soma += vetor[i];

        }
        System.out.println("Lista de números informados: ");
        for (int i = 0; i < n; i++){
            System.out.println(vetor[i]);
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma / n));


    }
}
