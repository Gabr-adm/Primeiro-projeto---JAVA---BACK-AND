package testing;

import java.util.Scanner;

public class CarroTeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Carro c1 = new Carro();
        c1.marca = "Toyota";
        c1.cor = "Grafite";
        c1.modelo = "Corolla";
        c1.ano = 2020;
        c1.valor = 120.000;
        c1.quantidade = 10;

        Carro c2 = new Carro();
        c2.marca = "Volkswagen";
        c2.cor = "Branco";
        c2.modelo = "Saveiro";
        c2.ano = 2012;
        c2.valor = 54.000;
        c2.quantidade = 5;

        Carro c3 = new Carro();
        c3.marca = "Honda";
        c3.cor = "Grafite";
        c3.modelo =  "City";
        c3.ano = 2015;
        c3.valor = 64.500;
        c3.quantidade = 7;

        System.out.println("Escolha uma marca de carro: ");
        String escolherMarca = entrada.nextLine();


    }
}
