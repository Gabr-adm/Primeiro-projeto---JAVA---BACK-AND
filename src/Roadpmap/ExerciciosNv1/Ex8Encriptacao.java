package Roadpmap.ExerciciosNv1;

import java.util.Scanner;

public class Ex8Encriptacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma mensagem para visualizar ela criptografada: ");
        String mensagem = sc.nextLine();
        char ultimo = mensagem.charAt(mensagem.length() -1);

        if (ultimo == 'j') {
            for (int i = 0; i < mensagem.length(); i++) {
                char letra = mensagem.charAt(i);
                letra = (char) (letra + 1);

                System.out.print(letra);

            }
        } else {
            while (ultimo != 'j')
            System.out.println(" Tentativa de ataque!!!");
        }
    }
}
