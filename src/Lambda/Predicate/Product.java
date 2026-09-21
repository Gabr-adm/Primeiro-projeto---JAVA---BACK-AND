package Lambda.Predicate;

public class Product {

    private String nome;
    private int preco;

    public Product(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "[" + "Nome: " + nome + " | " + "Preço: " + preco + "]";
    }

    public static boolean staticProductPredicate(Product p){
        return p.getPreco() >=100;
    }
}
