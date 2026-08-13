package testing;

import java.util.Scanner;


public class VetoresTestes1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Vetores1 vetores;

        System.out.println("Digite: ");
        int x = entrada.nextInt();


        Vetores1[] vetor = new Vetores1[x];


        for (int i = 0; i<x; i++){
            entrada.nextLine();
            System.out.println("\nDigite um nome: ");
            String nome = entrada.nextLine();
            System.out.println("Digite um preço: ");
            double preco = entrada.nextDouble();
            vetor[i] = new Vetores1(nome, preco);
        }
        double sum = 0.0;
        for (int i = 0; i<x; i++) {
            sum += vetor[i].getPreco();
        }
        System.out.println("Total: " + x);
        double avg = sum / x ;

        System.out.println("A média dos números digitados é: " + avg);
    }

}
