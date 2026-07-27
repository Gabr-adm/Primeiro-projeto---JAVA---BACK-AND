package poo;

import java.util.Scanner;

public class EncapsulamentoTeste {

    public static void main(String[] args) {


        Encapsulamento e1 = new Encapsulamento();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        e1.nome = entrada.nextLine();
        System.out.println("\nOlá, " + e1.nome + "!");
        System.out.println("\nO número da sua conta é: " + e1.getConta());
        System.out.println("\nVocê deseja depositar algum valor agora? ");
        String resposta = entrada.nextLine();
        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite quanto você quer depositar: ");
            e1.depositar(entrada.nextDouble());
        } while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não") ) {
            System.out.println("Insira sim ou não. ");
            resposta = entrada.nextLine();
            
        }
        System.out.println("\nDados da conta:");
        System.out.println("Nome: " + e1.nome + "\nNúmero da conta: " + e1.getConta() + "\nSaldo: " + e1.getSaldo());


        System.out.println("\nDigite quanto você quer depositar: ");
        e1.depositar(entrada.nextDouble());
        System.out.println("\nDados da conta:");
        System.out.println("Nome: " + e1.nome + "\nNúmero da conta: " + e1.getConta() + "\nSaldo: " + e1.getSaldo());
        System.out.println("\nDigite quanto você quer sacar: ");
        e1.sacar(entrada.nextDouble());

        System.out.println("\nDados da conta:");
        System.out.println("Nome: " + e1.nome + "\nNúmero da conta: " + e1.getConta() + "\nSaldo: " + e1.getSaldo());

        entrada.close();

    }
}