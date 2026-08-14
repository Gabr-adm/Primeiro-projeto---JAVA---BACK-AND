package Abstracao;

import Abstracao.Enum.Circulo;
import Abstracao.Enum.Cor;
import Abstracao.Enum.Retangulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Forma> list = new ArrayList<>();



        System.out.print("Digite o número de formas: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Forma #" + i);

            System.out.println("Retângulo ou círculo (r/c)? ");
            sc.nextLine();
            String entrada = sc.nextLine();

            System.out.println("Digite a cor: ");
            Cor cor = Cor.valueOf(sc.nextLine());

            if (entrada.equalsIgnoreCase("r")){
                System.out.println("Digite a altura: ");
                double altura = sc.nextDouble();
                System.out.println("Digite a largura: ");
                double largura = sc.nextDouble();
                list.add(new Retangulo(cor, altura, largura ));
            } else if (entrada.equalsIgnoreCase("c")){
                System.out.println("Digite o raio: ");
                double raios = sc.nextDouble();
                list.add(new Circulo(cor, raios));
            }else {
                System.out.println("Forma inexistente!");
                break;
            }


        }
        for (Forma forma: list){
            System.out.println(forma.area());
        }
    }
}
