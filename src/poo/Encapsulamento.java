package poo;

import java.util.Random;

public class Encapsulamento {

    public String nome;
    private int conta = 0;
    private double saldo;
    public double taxa = 5;

    static final int VALOR_MINIMO = 10000;
    static final int VALOR_MAXIMO = 90000;

    public int getConta(){
        if (this.conta == 0){
            System.out.println(" Gerando número de conta: ");

            Random random = new Random();

            this.conta = random.nextInt(VALOR_MAXIMO) + VALOR_MINIMO;
        }
        return conta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor){
        valor += taxa;
        saldo -= valor;
    }

}
