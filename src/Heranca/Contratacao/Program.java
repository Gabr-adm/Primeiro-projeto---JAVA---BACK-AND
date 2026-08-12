package Heranca.Contratacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        List<Empregado> list = new ArrayList<>();

        System.out.println("Quantos Funcionários serão contratados?: ");
        int n = sc.nextInt();


        for (int i = 1; i <=n; i++){
            System.out.println("Funcionário #" + i);
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Horas: ");
            int horas = sc.nextInt();
            System.out.println("Valor por horas: ");
            double valorPorHoras = sc.nextDouble();
            System.out.println("Teceirizado (SIM/NAO)?: ");
            sc.nextLine();
            String sn = sc.nextLine();
            if (sn.equalsIgnoreCase("SIM")){
                System.out.println("Quantos porcento será o adicional?: ");
                double taxaAdcional = sc.nextDouble();
                list.add(new Terceirizado(nome, horas, valorPorHoras, taxaAdcional));
            } else {
                list.add(new Empregado(nome, horas, valorPorHoras));
            }

        }
        for (Empregado empregado: list){
            System.out.println();
            System.out.println(empregado.getNome() + " | Recebeu: " + empregado.pagamento());

        }
    }
}
