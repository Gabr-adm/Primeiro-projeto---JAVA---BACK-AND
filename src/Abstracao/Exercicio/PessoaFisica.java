package Abstracao.Exercicio;

public class PessoaFisica extends Contribuintes{

    private Double gastoSaude;

    public PessoaFisica(String nome, Double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude =gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double imposto() {
        double imposto;
        double menor20 = getRendaAnual() * 0.15;
        double maior20 = getRendaAnual() * 0.25;;
        if (getRendaAnual() < 20000) {
            imposto = menor20;

        }else {
            imposto = maior20;
        }
        return imposto -= gastoSaude * 0.50;
    }
    @Override
    public String identificacao(){
        return getNome() + " pagará R$" + imposto() + " de imposto.";
    }
}
