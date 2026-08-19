package Exececoes.Desafio;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);


        System.out.println("Digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Titular: ");
        String titular = sc.nextLine();

        Account account = new Account(numero, titular);

            System.out.println("DEPOSITAR: ");
        account.depositar(sc.nextDouble());

        try {
        System.out.println("SACAR: ");
            account.sacar(sc.nextDouble());
        } catch (BusinessException e){
            System.out.println(e.getMessage());
        }


        System.out.println(account);

    }
}
