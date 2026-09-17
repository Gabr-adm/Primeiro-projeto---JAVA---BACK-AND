package Roadpmap.Set;

import java.util.HashSet;
import java.util.Set;

public class Cadastro {

    Set<Pessoa> pessoas = new HashSet<>();

    public Cadastro(){}

    public void adicionarPessoas(Pessoa pessoa){
        pessoas.add(pessoa);
    }
}
