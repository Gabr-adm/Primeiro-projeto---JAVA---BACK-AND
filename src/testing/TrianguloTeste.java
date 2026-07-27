package testing;

import java.util.Scanner;

public class TrianguloTeste {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo();

        y = new Triangulo();

        System.out.println("Digite os valores do triângulo X: ");
        x.a = entrada.nextDouble();
        x.b = entrada.nextDouble();
        x.c = entrada.nextDouble();

        System.out.println("Digite os valores do triângulo Y: ");
        y.a = entrada.nextDouble();
        y.b = entrada.nextDouble();
        y.c = entrada.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p -x.a) * (p -x.b) * (p - x.c));

        p = (x.a + x.b + x.c) / 2.0;
        double areaY = Math.sqrt(p * (p -y.a) * (p -y.b) * (p - y.c));

        System.out.printf("Triângulo area X: %.f%n", areaX );
        System.out.printf("Triângulo area Y: %.f%n", areaY );

        if (areaX > areaY){
            System.out.println("Area X é maior. ");
        } else {
            System.out.println("Area Y é maior. ");
        }
        entrada.close();
    }
}
