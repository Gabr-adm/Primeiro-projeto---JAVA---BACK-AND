package Exececoes.Desafio;

public class Account {

    private Integer numero;
    private String titular;
    private Double saldo = 0.0;
    private Double limiteDeSaque = 300.0;

    public Account(){
    }

    public Account(Integer numero, String titular) {
        this.numero = numero;
        this.titular = titular;

    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }
    public void depositar(double quantia){
            saldo += quantia;
    }
    public void sacar(double quantia){
        if (quantia > saldo){
            throw new BusinessException("Saldo insuficiente");
        } else if (quantia > limiteDeSaque) {
            throw new BusinessException("Saque indisponível (limite de saque excedido).");
        }else {
            saldo -= quantia;
            System.out.println("Saldo atual: " + saldo);
        }
    }

    @Override
    public String toString() {
        return "---Dados da conta---" +
                "\nNúmero: " + numero +
                "\nTitular: " + titular +
                "\nSaldo: " + saldo +
                "\nLimiteDeSaque: " + limiteDeSaque;
    }
}
