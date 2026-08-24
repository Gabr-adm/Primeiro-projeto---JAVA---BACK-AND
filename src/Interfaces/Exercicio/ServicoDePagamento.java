package Interfaces.Exercicio;

public interface ServicoDePagamento {

    double taxaDePagamento(double quantidadeParcelas);
    double jurosSimples (double quantidadeDeParcelas, Integer meses);
}
