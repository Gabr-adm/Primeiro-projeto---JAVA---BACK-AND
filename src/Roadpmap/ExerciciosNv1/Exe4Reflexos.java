package Roadpmap.ExerciciosNv1;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Exe4Reflexos {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(10);

        int espera = random.nextInt(5) + 1;

        System.out.println("Prepare-se...");

        Thread.sleep(espera * 1000);

        System.out.println("Agora! Digite o número:" + numero);

        Calendar inicio = Calendar.getInstance();
        long tempoInicial = inicio.getTimeInMillis();

        int resposta = sc.nextInt();

        while (resposta != numero){
            System.out.println("Número errado! Tente novamente:");
            resposta = sc.nextInt();
        }

        Calendar fim = Calendar.getInstance();
        long tempoFinal = fim.getTimeInMillis();

        long tempoDecorrido = tempoFinal - tempoInicial;

        System.out.println("O seu tempo decorrido foi: " + tempoDecorrido + "ms");
    }
}
