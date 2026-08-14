package Abstracao.Enum;

import Abstracao.Forma;

public class Circulo extends Forma {

    private Double raios;

    public Circulo(){
    }

    public Circulo(Cor cor, Double raios) {
        super(cor);
        this.raios = raios;
    }

    @Override
    public double area() {
        return Math.PI * raios * raios;
    }
}
