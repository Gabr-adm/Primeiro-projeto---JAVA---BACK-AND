package poo;

public class Funcionarios {

    private int id;
    private String nome;
    private double salario;


    public Funcionarios(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public void aumentarSalario(double aumento){
        salario = salario + (salario *aumento / 100.0);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNome: " + nome + "\nSalário: " + salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
