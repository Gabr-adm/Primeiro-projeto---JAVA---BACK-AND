package oo.composicao.desafio;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Product product = new Product();



        Product p1 = new Product("Notebook", 2500, 2);
        System.out.println("Insira os dados do produto abaixo. ");
        System.out.print("Nome: ");
        p1.setNome(  entrada.nextLine());
        System.out.println("Adicione um saldo: ");
        p1.saldo = entrada.nextInt();
        System.out.println("Quantidade: ");
        p1.quantidade = entrada.nextInt();

        while (p1.precoTotal() > p1.saldo){
            System.out.println("Saldo insuficiente.");
            System.out.println("Falta R$" + (p1.precoTotal() - p1.saldo) + " para finalizar sua compra. ");
            System.out.println("Adicionar saldo: ");
            p1.faltante = entrada.nextInt();
            p1.saldo += p1.faltante;

        }
        if (p1.saldo >= p1.faltante){
            System.out.println(" Você comprou um " + p1.getNome());
        }

        var p2 = new Product("Monitor", 1000, 3);
    entrada.close();
    }
}
