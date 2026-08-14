package Abstracao.Exercicio;

public class PessoaJuridica extends Contribuintes {

    private Integer numeroDeFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, int numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double imposto() {
        double imposto;
        if (numeroDeFuncionarios >= 10) {
            imposto = getRendaAnual() * 0.14;
        } else {
            imposto = getRendaAnual() * 0.16;
        }
        return imposto;
    }
    @Override
    public String identificacao(){
        return getNome() + " pagará R$"  + imposto() + " de imposto";
    }



}
