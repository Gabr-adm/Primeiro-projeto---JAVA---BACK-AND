package poo;

import java.util.Scanner;

public class Desafio02Test {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Desafio02 f1 = new Desafio02();
        System.out.println("Digite seu nome: ");
        f1.nome = entrada.nextLine();
        System.out.println("Digite seu salário base: ");
        f1.salarioBruto = entrada.nextDouble();
        System.out.println("Digite seus descontos: ");
        f1.imposto = entrada.nextDouble();
        System.out.println("Digite seu aumento: ");
        f1.aumento = entrada.nextDouble();

        System.out.println("Nome: " + f1.nome);
        System.out.println("Salário:  " + f1.salarioBruto);
        System.out.println("Descontos: " + f1.imposto);
        System.out.println("\nAumento: " + f1.aumento);

        f1.aumentoSalarial();
        f1.salarioLiquido();

        System.out.println("Salário atual: " + f1.salarioBruto);

        entrada.close();
    }


}
