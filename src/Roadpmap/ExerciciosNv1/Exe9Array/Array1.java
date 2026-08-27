package Roadpmap.ExerciciosNv1.Exe9Array;

public class Array1 {

    private int[] numeros;
    private int quantidadeAtual;
    private int quantidadeMaxima;

    public Array1(int quantidadeMaxima){
        if (quantidadeMaxima < 0) {
            throw new IllegalArgumentException("A quantidade máxima não pode ser negativa.");
        }

        this.quantidadeMaxima = quantidadeMaxima;
        this.numeros = new int[quantidadeMaxima];
        this.quantidadeAtual = 0;
    }
    public int[] getNumeros() {
        return numeros;
    }
    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public boolean adicionar(int n){
        if (n >= 0 && quantidadeAtual < quantidadeMaxima){
            numeros[quantidadeAtual] = n;
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
