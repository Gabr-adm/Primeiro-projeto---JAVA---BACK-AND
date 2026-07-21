package oo.composicao.desafio;

import java.lang.System;

public class Product {


    private String nome;
    private double preco;
    int quantidade;
    double saldo;
    double faltante;

    Product(){
    }

    Product (String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public double precoTotal (){

        return preco * quantidade;
    }

    public void adicionarProduto (int quantidade){

        this.quantidade += quantidade;
    }
    public void removeProduto (int quantidade){
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }



    public void adicionarSaldo(double preco){

        saldo += preco;
    }
    public String toString() {
        return nome + ", $ " +
                String.format("%.2f", preco) + ", "
                + quantidade + "Total: $ "
                + String.format("%.2f", precoTotal());
    }

}
