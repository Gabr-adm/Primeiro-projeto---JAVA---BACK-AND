package Roadpmap.ExerciciosNv1.Exe14Notas;

public class Aluno {

    private String nome;
    private int totalCaracteres;
    private Integer matricula;
    private Double nota1;
    private Double nota2;

    public Aluno(){
    }

    public Aluno(String nome, int totalCaracteres, Integer matricula, Double nota1, Double nota2) {
        this.nome = nome;
        this.totalCaracteres = totalCaracteres;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public int getTotalCaracteres() {
        return totalCaracteres;
    }

    public void setTotalCaracteres(int totalCaracteres) {
        this.totalCaracteres = totalCaracteres;
    }

    @Override
    public String toString() {
        return "---Aluno--- " + "\n" +
                "Nome: " + nome + "\n" +
                "Total de Caracteres: " + totalCaracteres + "\n" +
                "Matricula: " + matricula + "\n" +
                "Primeira nota: " + nota1 + "\n" +
                "Segunda nota: " + nota2 + "\n";
    }
}
