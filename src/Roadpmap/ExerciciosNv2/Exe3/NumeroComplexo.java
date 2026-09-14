package Roadpmap.ExerciciosNv2.Exe3;

import java.util.Objects;

public class NumeroComplexo {

    // Em a + bi, numeroReal representa a e numeroImaginario representa b.
    private double numeroReal;
    private double numeroImaginario;

    public NumeroComplexo(double numeroReal, double numeroImaginario) {
        this.numeroReal = numeroReal;
        this.numeroImaginario = numeroImaginario;
    }

    public double getNumeroReal() {
        return numeroReal;
    }

    public void setNumeroReal(double numeroReal) {
        this.numeroReal = numeroReal;
    }

    public double getNumeroImaginario() {
        return numeroImaginario;
    }

    public void setNumeroImaginario(double numeroImaginario) {
        this.numeroImaginario = numeroImaginario;
    }

    public void somar(NumeroComplexo outroNumero) {
        numeroReal += outroNumero.numeroReal;
        numeroImaginario += outroNumero.numeroImaginario;
    }

    public void subtrair(NumeroComplexo outroNumero) {
        numeroReal -= outroNumero.numeroReal;
        numeroImaginario -= outroNumero.numeroImaginario;
    }

    public void multiplicar(NumeroComplexo outroNumero) {
        // Guardamos os valores originais antes de atualizar o resultado.
        double a = numeroReal;
        double b = numeroImaginario;
        double c = outroNumero.numeroReal;
        double d = outroNumero.numeroImaginario;

        numeroReal = a * c - b * d;
        numeroImaginario = a * d + b * c;
    }

    public void dividir(NumeroComplexo outroNumero) {
        double a = numeroReal;
        double b = numeroImaginario;
        double c = outroNumero.numeroReal;
        double d = outroNumero.numeroImaginario;

        if (c == 0 && d == 0) {
            throw new ArithmeticException("Não é possível dividir por um número complexo igual a zero.");
        }

        double denominador = c * c + d * d;
        numeroReal = (a * c + b * d) / denominador;
        numeroImaginario = (b * c - a * d) / denominador;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        NumeroComplexo outroNumero = (NumeroComplexo) obj;
        return Double.compare(numeroReal, outroNumero.numeroReal) == 0
                && Double.compare(numeroImaginario, outroNumero.numeroImaginario) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroReal, numeroImaginario);
    }

    @Override
    public String toString() {
        String sinal = numeroImaginario < 0 ? " - " : " + ";
        return numeroReal + sinal + Math.abs(numeroImaginario) + "i";
    }
}
