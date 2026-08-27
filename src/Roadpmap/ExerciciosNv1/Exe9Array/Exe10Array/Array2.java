package Roadpmap.ExerciciosNv1.Exe9Array.Exe10Array;

import java.util.ArrayList;
import java.util.List;

public class Array2 {
    private List<Integer> numeros = new ArrayList<>();
    private int quantidadeMaxima;
    private int quantidadeAtual;

    public Array2(int quantidadeMaxima){
        this.quantidadeMaxima = quantidadeMaxima;
        this.quantidadeAtual = 0;
    }
    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public boolean adicionar(int n){
        if (n >= 0 && quantidadeAtual < quantidadeMaxima){
            numeros.add(n);
            quantidadeAtual++;
            return true;
        }

        return false;
    }
    public int media(){
        int soma = 0;
        for (int numero: numeros){
            soma += numero;
        }
        int total = soma / quantidadeAtual;
        return total;

    }
}
