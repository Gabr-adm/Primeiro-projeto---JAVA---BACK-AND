package Interfaces.ExemploSimples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Marca do teclado mecânico: ");
            Teclado teclado = new TecladoMecanico(sc.nextLine());

            System.out.print("Marca do mouse com RGB: ");
            Mouse mouse = new MouseComRgb(sc.nextLine());

            Computador computador = new Computador(teclado, mouse);

            System.out.print("Digite uma tecla: ");
            computador.teclar(sc.nextLine());
            computador.clicar("esquerdo");
            computador.rolar("cima");

            System.out.println(computador);
        }
    }
}
