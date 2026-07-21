package poo;

import java.util.Scanner;

public class CurrencyConverterTesting {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        CurrencyConverter s1 = new CurrencyConverter();
        System.out.println("Digite seu nome: ");
        s1.nome = entrada.nextLine();
        System.out.println("Digite seu saldo real: ");
        s1.saldoReal = entrada.nextDouble();
        System.out.printf("\n O seu depósito de R$" + s1.saldoReal + ", foi convertido em: U$" + s1.total());

    }
}
