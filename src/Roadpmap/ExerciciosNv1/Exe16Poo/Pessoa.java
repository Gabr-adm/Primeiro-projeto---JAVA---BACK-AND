package Roadpmap.ExerciciosNv1.Exe16Poo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Pessoa {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate hoje = LocalDate.now();

    private String nome;
    private LocalDate dataNascimento;
    private Integer idade = 0;
    private LocalDate ajustarData;

    Pessoa(LocalDate ajustarData){
        this.dataNascimento = ajustarData;
    }

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void ajustarDataDeNascimento(LocalDate novaData){
        dataNascimento = novaData;
    }

    public void calcularIdade(){
        dataNascimento.format(fmt);
        Period periodo = Period.between(getDataNascimento(), hoje);
        idade = periodo.getYears();
    }

    @Override
    public String toString(){
        return
                "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n";
    }
}
