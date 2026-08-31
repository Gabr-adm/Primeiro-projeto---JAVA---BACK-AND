package Roadpmap.ExerciciosNv1.Exe13Exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exe13Excecoes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int resposta = random.nextInt(10);
        int n = 0;
        int contador = 0;


            while (true) {
                try {

                    System.out.println("Adivinhe qual número está armazenado: ");
                    n = sc.nextInt();
                    contador++;

                    System.out.println("Número incorreto, tente novamente! ");
                    n = sc.nextInt();
                    contador++;

                    if (n > resposta) {
                        throw new MaiorQueException("O número digitado é maior do que está armazenado.");

                    } else if (n < resposta) {
                        throw new MenorQueException("O número digitado é menor do que está armazenado.");
                    } else {
                        System.out.println("\nVocê tentou " + contador + " vezes até acertar.");
                        break;
                    }
                }
                catch (MaiorQueException | MenorQueException e){
                    System.out.print(e.getMessage());

                } catch (InputMismatchException e){
                    System.out.println("Entrada inválida, digite um número inteiro:");
                }
            }

    }

    }
