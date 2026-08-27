package Roadpmap.ExerciciosNv1.Exe9Array;

import java.util.Scanner;

public class ArrayControle1 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        System.out.println("Defina um tamanho para o Array: ");
        int numero = sc.nextInt();

        Array1 array1 = new Array1(numero);


        for (int i = 0; i<numero; i++){

            System.out.println("Adicione um número: ");
            int n = sc.nextInt();
            array1.adicionar(n);
            if (n < 0){
                System.out.println("Você saiu do programa!");
                break;
            }

        }

        System.out.println("Quantidade de números armazenados: " + array1.getQuantidadeAtual());
        System.out.println("Quantidade máxima de armazenamento: " + array1.getQuantidadeMaxima());
        System.out.println("Média dos números: " + array1.media());

    }
}
