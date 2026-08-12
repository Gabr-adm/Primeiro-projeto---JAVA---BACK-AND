package Heranca.Desafio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();
        SimpleDateFormat fmt = new  SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite a quantidade de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++){
            System.out.println("Produto #" + i);
            sc.nextLine();

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Preço: ");
            double preco = sc.nextDouble();

            sc.nextLine();

            System.out.println("Esse produto é importado? (SIM/NAO): ");
            String rp1 = sc.nextLine();
            sc.nextLine();
            System.out.println("Esse produto é usado? (SIM/NAO): ");
            String rp2 = sc.nextLine();
            if (rp1.equalsIgnoreCase("SIM")){
                System.out.println("Digite quantos porcento será a taxa de importação: ");
                double taxaDaAlfandega = sc.nextDouble();
                sc.nextLine();
                list.add(new ProdutoImportado(nome, preco, taxaDaAlfandega));
            } else if (rp2.equalsIgnoreCase("SIM")){
                System.out.println("Digite a data de fabricação (dd/MM/yyyy): ");
                String entrada = sc.nextLine();
                Date dataDeFabricacao = fmt.parse(entrada);
                fmt.format(dataDeFabricacao);
                list.add(new ProdutoUsado(nome, preco, dataDeFabricacao));
            } else {
                list.add(new Produto(nome, preco));
            }
        }
        for (Produto produto: list){
            System.out.println("\n");
            System.out.println(produto.etiqueta());
        }
    }

}
