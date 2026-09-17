package Roadpmap.Generics;

public class Shuriken {

    private int tamanho;

    public Shuriken(int nome) {
        this.tamanho = nome;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString(){
        return "Tamanho da SHURIKEN: " + tamanho;
    }
}
