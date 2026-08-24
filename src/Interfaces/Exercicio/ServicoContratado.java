package Interfaces.Exercicio;

import java.time.LocalDate;

public class ServicoContratado {


    private ServicoDePagamento servicoDePagamento;


    public ServicoContratado(ServicoDePagamento servicoDePagamento) {
        this.servicoDePagamento = servicoDePagamento;
    }



    public void processamentoContrato(Contrato contrato, int meses){

        double cotaBasica = contrato.getValorTotal() / meses;

        for (int i = 1; i <= meses; i++){
            LocalDate dataVencimento = contrato.getData().plusMonths(i);

            double juros = servicoDePagamento.jurosSimples(cotaBasica, i);
            double taxaPagamento = servicoDePagamento.taxaDePagamento(cotaBasica + juros);

            double cota = cotaBasica + juros + taxaPagamento;

            contrato.getParcelas().add(new Parcela(dataVencimento, cota));

        }

    }



}
