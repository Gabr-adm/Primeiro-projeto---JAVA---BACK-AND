package Roadpmap.ExerciciosNv2.Exe2PlanoCartesiano;

import java.util.Objects;

public class Ponto2d {

    private String nome;
    private double x;
    private double y;
    private double diferenca = 0;

    public Ponto2d(){}

     public Ponto2d(String nome){
        this.nome = nome;
    }

    public Ponto2d(String nome, double x, double y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
    }

    public Ponto2d(String nome, Ponto2d outroPonto){
        this.nome = nome;
        this.x = outroPonto.getX();
        this.y = outroPonto.getY();
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void mover(double x, double y){
        this.x = x;
        this.y = y;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
            return false;
        Ponto2d ponto2d = (Ponto2d) obj;
        return Double.compare(x, ponto2d.x) == 0 && Double.compare(y, ponto2d.y) == 0;

    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public double calcularDistancia(Ponto2d outroPonto){
        double diferencaX = outroPonto.getX() - this.x;
        double diferencaY = outroPonto.getY() - this.y;

        diferenca = Math.sqrt(
                Math.pow(diferencaX, 2) + Math.pow(diferencaY, 2)
        );
        return diferenca;
    }

    @Override
    public String toString(){
        return
                "\nNome do ponto: " + nome +
                        "\nEixo 'x': " + getX() + "\n" +
                        "Eixo 'y': " + getY() + "\n" +
                     String.format("Distância: %.2f", diferenca);
    }

    @Override
    public Ponto2d clone(){
        return new Ponto2d("Cópia", this);
    }


}


