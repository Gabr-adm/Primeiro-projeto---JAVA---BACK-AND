package testing;

public class BibliotecaTeste {

    Biblioteca biblioteca;


    public static void main(String[] args) {

        Livro l1 = new Livro("Os topers", 3);
        Livro l2 = new Livro("Mar vermelho", 5);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivros();




    }
}
