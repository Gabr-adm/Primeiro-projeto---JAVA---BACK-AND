package poo;

public class Desafio03 {

    String aluno;
    double nota1;
    double nota2;
    double nota3;

    Desafio03(String aluno){
        this.aluno = aluno;
    }

     public double mediaFinal(){
        return nota1 + nota2 + nota3;
    }
    double diferencaNota(){
        return 100 - mediaFinal();
    }
}
