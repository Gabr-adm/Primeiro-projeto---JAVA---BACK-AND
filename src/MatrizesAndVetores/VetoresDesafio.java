package poo;
import java.util.Scanner;

public class VetoresDesafio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n = 0;
        System.out.println("Digite a quantidade de número que você deseja: ");
        n = entrada.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i<vetor.length; i++){
            System.out.println("Digite um número: ");
             vetor[i] = entrada.nextInt();
        }
        System.out.println("Números da lista: ");
        for (int i = 0; i < n; i++){
            if (vetor[i] < 0){
                System.out.printf("%d\n", vetor[i]);
            }
        }
        }
    }
