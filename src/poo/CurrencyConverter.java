package poo;

public class CurrencyConverter {

    public static double valorDolar = 5.10;
    public static double iof = valorDolar * 0.06 / 100;
    double saldoReal;
    double comprar;
    String nome;


    public double total(){
        return Math.round(saldoReal / valorDolar);
    }

}
