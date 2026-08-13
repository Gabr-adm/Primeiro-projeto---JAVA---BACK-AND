package poo;

import java.util.Scanner;

public class matrizes2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas: ");
        int x = sc.nextInt();

        System.out.println("Digite a quantidade de colunas: ");
        int y = sc.nextInt();

        int[][] mat = new int [x][y];


        for (int i = 0; i<x; i++){
            for (int j = 0; j<y; j++){
                System.out.println("Digite um número para adcionar na linha e coluna: ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite o número 8: ");
        int n = sc.nextInt();

        for (int i = 0; i<mat.length; i++){
            for (int j = 0; j<mat.length; j++){
                if (mat[i][j] == n){
                    System.out.println("Position: " + i + "," + j + ": ");
                    if (j > 0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (i < mat.length-1){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }


        for (int i = 0; i < x; i++) {
            for (int j = 0; j <y; j++) {
                boolean ultimo = j+1 == y;
                if(ultimo) {
                    System.out.println(mat[i][j] + ". ");
                } else {
                    System.out.print(mat[i][j] + " , ");
                }
            }
        }

        System.out.println("Elemento da linha 0 coluna 1 é: " + mat[0][1]);
        System.out.println("Elemento que está na esquerda é: " + mat[0][0]);
        System.out.println("Elemento que está na direita é: " + mat[0][2]);
        System.out.println("Elemento que está abaixo é: " + mat[1][1]);
        System.out.println("Elemento da linha 0 coluna 1 é: " + mat[1][3]);
        System.out.println("Elemento que está na esquerda é: " + mat[1][2]);
        System.out.println("Elemento que está acima é: " + mat[0][3]);
        System.out.println("Elemento que está abaixo é: " + mat[2][3]);

        sc.close();
    }
}
