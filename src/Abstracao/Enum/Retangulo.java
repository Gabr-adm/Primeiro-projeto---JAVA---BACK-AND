package Abstracao.Enum;

import Abstracao.Forma;

public class Retangulo extends Forma {

    private Double largura;
    private Double altura;

    public Retangulo(){
    }
    public Retangulo(Cor cor, Double altura, Double largura) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return  largura * altura;
    }
}
