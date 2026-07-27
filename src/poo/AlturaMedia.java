package poo;

import java.util.Scanner;

public class AlturaMedia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite quantas pessoas será informado: ");
        int n = 0;
        n = entrada.nextInt();


        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++){
            entrada.nextLine();
            System.out.println("Dados da " + i + " pessoa da pessoa");
            System.out.println("Nome: ");
            nomes[i] = entrada.nextLine();

            System.out.println("Idade: ");
            idades[i] = entrada.nextInt();

            System.out.println("Altura: ");
            alturas[i] = entrada.nextDouble();

        }
        double alturaTotal = 0;
        for (int i = 0; i < n; i++){
            alturaTotal = alturaTotal + alturas[i];
        }
        System.out.printf("Altura média: %.2f%n", (alturaTotal / n));

        int totalMenores = 0;
        for (int i = 0; i<n; i++){
            if (idades[i] < 16){
                totalMenores = totalMenores +1;
            }
        }
        double porcentagem = totalMenores *100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        entrada.close();
    }

}
