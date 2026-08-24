package Interfaces.Exercicio;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Parcela {

    private LocalDate dataVencimento;
    private Double quantia;

    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    Contrato contrato;

    public Parcela(LocalDate dataVencimento, Double quantia) {
        this.dataVencimento = dataVencimento;
        this.quantia = quantia;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }
    @Override
    public String toString(){
        return dataVencimento.format(fmt) + " - " + String.format("%.2f", quantia);
    }

}
