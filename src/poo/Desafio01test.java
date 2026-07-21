package poo;

public class Desafio01test {

    public static void main(String[] args) {

        Desafio01 r1 = new Desafio01();
        r1.altura = 3;
        r1.largura = 4;

        System.out.println("Area: " + r1.area());
        System.out.println("Perimetro: " + r1.perimetro());
        System.out.println("Diagonal: " + r1.diagonal());
    }
}
