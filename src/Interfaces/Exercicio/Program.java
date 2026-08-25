package Interfaces.Exercicio;

import java.text.ParseException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Entre com os dados do contrato: ");
        System.out.println("Número: ");
        sc.nextLine();
        int numeroContrato = sc.nextInt();
        System.out.println("Data: (dd/MM/yyyy)");
        sc.nextLine();
        LocalDate data = LocalDate.parse(sc.nextLine(), fmt);
        System.out.println("Valor do contrato: ");
        double valorTotal = sc.nextInt();
        Contrato obj = new Contrato(numeroContrato, data, valorTotal);

        System.out.println("Quantas vezes?: ");
        int n = sc.nextInt();

        ServicoContratado servicoContratado = new ServicoContratado(new PaypalService() );

        servicoContratado.processamentoContrato(obj, n);

        System.out.println("Parcelas: ");
        for (Parcela parcelas: obj.getParcelas()){
            System.out.println(parcelas);
        }
    }
}
