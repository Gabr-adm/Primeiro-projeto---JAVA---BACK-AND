package Heranca.UpAndDownCastings;

public class Policial extends Pessoa {

    private String nome;
    private int idade;

    public Policial(String nome, int idade){
        super(nome, idade);
        this.nome = nome;
        this.idade = idade;
    }
    public void atirar(){
        System.out.printf("%s sacou a arma e atirou!\n", nome);
    }
    public void prender(){
        System.out.printf("%s prendeu o bandido!\n", nome);
    }
}
