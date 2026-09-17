package Roadpmap.Set;

public class Program {

    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();

        cadastro.adicionarPessoas(new Pessoa("Gabriel", 01));
        cadastro.adicionarPessoas(new Pessoa("Gabriel", 01));
        cadastro.adicionarPessoas(new Pessoa("Gabriel", 01));
        cadastro.adicionarPessoas(new Pessoa("Roberto", 03));

        for (Pessoa pessoa: cadastro.pessoas){
            System.out.println(pessoa);
        }
    }
}
