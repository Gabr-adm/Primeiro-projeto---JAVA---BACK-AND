package Heranca.SerHumano;

public class Delegado extends Pessoa{

    private String nome;
    private int incomodando = 0;

    public Delegado(String nome, int idade){
        super(nome, idade);
        this.nome = nome;
    }
    public void delegar(){
            System.out.printf("%s  ordenou o policial prender o bandido!\n", nome);

    }
    public void atirar(){
        System.out.printf("%s sacou a arma e atirou!\n", nome);
    }
}
