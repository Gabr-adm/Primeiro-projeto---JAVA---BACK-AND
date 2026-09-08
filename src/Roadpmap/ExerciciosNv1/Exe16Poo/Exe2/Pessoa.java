package Roadpmap.ExerciciosNv1.Exe16Poo.Exe2;

public class Pessoa {

    private String nome;

    Universidade uni;

    public Pessoa(String nome, Universidade uni){
        this.nome = nome;
        this.uni = uni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + '\n' +
                uni;
    }
}
