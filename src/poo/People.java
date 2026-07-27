package poo;

public class People {

  public String nome;
  public int idade;
  public double altura;

    People(){
    }
    People(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    @Override
    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade + " Altura: " + altura;
    }
}
