package Roadpmap.ExerciciosNv1.Exe16Poo.Exe2;

public class Universidade {

    private String nome;

    public Universidade(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Universidade: " + nome + "\n";
    }
}
