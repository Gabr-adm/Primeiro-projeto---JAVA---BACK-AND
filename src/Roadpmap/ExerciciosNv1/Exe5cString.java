package Roadpmap.ExerciciosNv1;

import java.util.Scanner;

public class Exe5cString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String primeiraPalavra = sc.nextLine().toLowerCase();

        System.out.println("Digite a segunda palavra: ");
        String segundaPalavra = sc.nextLine().toLowerCase();

        String caracteresVerificados = "";
        int total = 0;

        for (int i = 0; i < segundaPalavra.length(); i++) {
            char caractere = segundaPalavra.charAt(i);

            if (caractere == ' ' || caracteresVerificados.indexOf(caractere) != -1) {
                continue;
            }

            int quantidade = 0;

            for (int j = 0; j < primeiraPalavra.length(); j++) {
                if (primeiraPalavra.charAt(j) == caractere) {
                    quantidade++;
                }
            }

            System.out.println("O caractere '" + caractere + "' aparece "
                    + quantidade + " vez(es) na primeira palavra.");

            total += quantidade;
            caracteresVerificados += caractere;
        }

        System.out.println("Total de caracteres iguais: " + total);

        sc.close();
    }
}
