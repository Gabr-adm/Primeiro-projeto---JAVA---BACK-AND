package Interfaces.Exercicio;

public class PaypalSerice implements ServicoDePagamento{


    @Override
    public double taxaDePagamento(double quantidadeParcelas) {
        return quantidadeParcelas * 0.02;
    }

    @Override
    public double jurosSimples(double quantidadeDeParcelas, Integer meses) {
        return quantidadeDeParcelas * 0.01* meses;
    }
}
