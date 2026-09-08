package Roadpmap.ExerciciosNv2;

import java.util.Scanner;

public class Exe1Contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite: ");
        int repeticao = sc.nextInt();
        sc.nextLine();
        int saldo = 0;


        for (int i = 0; i < repeticao; i++){
            System.out.println("Digite 'Z' para zerar, 'I' para incrementar e 'R' para retornar a contagem. ");
            String resposta = sc.nextLine();

            if (resposta.equalsIgnoreCase("I")){
                int add = saldo++;
                System.out.println("Novo saldo: " + saldo);
            } else if (resposta.equalsIgnoreCase("Z")) {
                saldo = 0;
                System.out.println("Saldo zerado: " + saldo);
            } else if (resposta.equalsIgnoreCase("R")) {
                i = 0;
                System.out.println("Repetições: " + i);
            }
            else {
                System.out.println("Resposta inválida, tente novamente.");
                i++;
            }
        }
    }
}
