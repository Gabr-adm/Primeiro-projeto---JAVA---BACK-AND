package Roadpmap.Map.Exercicio;

import java.util.Objects;

public class Urna {

    private String nome;
    private Integer votos;

    public Urna(String nome, Integer votos) {
        this.nome = nome;
        this.votos = votos;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    public void votar(int votos){
        this.votos += votos;

    }

    @Override
    public String toString(){
        return "\nNome: " + nome +
                "\nVotos: " + votos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Urna urna = (Urna) o;
        return Objects.equals(nome, urna.nome) && Objects.equals(votos, urna.votos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, votos);
    }
}
