package Abstracao.Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Contribuintes> list = new ArrayList<>();

        System.out.println("Digite o número de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Contribuinte #" + i);

            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.println("Renda anual: ");
            double rendaAnual = sc.nextDouble();


            System.out.println("CPF OU CNPPJ?");
            sc.nextLine();
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("CPF")){
                System.out.println("Digite seu gasto com saúde: ");
                double gastoSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
            } else if (entrada.equalsIgnoreCase("CNPJ")){
                System.out.println("Digite o número de funcionários: ");
                int numeroDeFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
            }
        }
        for (Contribuintes c: list){
            System.out.println();
            System.out.printf(c.identificacao());
        }

    }
}
