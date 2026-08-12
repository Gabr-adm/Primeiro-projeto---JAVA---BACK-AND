package Heranca.Contratacao;

public class Terceirizado extends Empregado {

    private Double taxaAdicional;

    public Terceirizado(){
        super();
    }

    public Terceirizado(String nome, int horas, double valorPorHora, double taxaAdicional){
        super(nome, horas, valorPorHora);
        this.taxaAdicional =taxaAdicional;
    }

    public Double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(Double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }
    @Override
    public double pagamento(){
        return super.pagamento() + taxaAdicional * 1.10;
    }
}
