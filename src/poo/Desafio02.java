package poo;

public class Desafio02 {

    String nome;
    double salarioBruto;
    double imposto;
    double aumento;

    double aumentoSalarial(){
        return salarioBruto += salarioBruto * aumento / 100;
    }
    double salarioLiquido(){
        return (salarioBruto - imposto);
    }


}
