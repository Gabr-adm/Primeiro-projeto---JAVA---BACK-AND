package Roadpmap.ExerciciosNv1.Exe9Array.Exe10Array;

import java.util.Scanner;

public class ArrayControle2 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        System.out.println("Defina um tamanho para o Array: ");
        int numero = sc.nextInt();

        Array2 array2 = new Array2(numero);


        for (int i = 0; i<numero; i++){

            System.out.println("Adicione um número: ");
            int n = sc.nextInt();
            array2.adicionar(n);
            if (n < 0){
                System.out.println("Você saiu do programa!");
                break;
            }

        }

        System.out.println("Quantidade de números armazenados: " + array2.getQuantidadeAtual());
        System.out.println("Quantidade máxima de armazenamento: " + array2.getQuantidadeMaxima());
        System.out.println("Média dos números: " + array2.media());

    }
    }
