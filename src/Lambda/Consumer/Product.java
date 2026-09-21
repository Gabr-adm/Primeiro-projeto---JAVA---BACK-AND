package Lambda.Consumer;

public class Product {

    private String nome;
    private double preco;

    public Product(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
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
        return "[" + "Nome: " + nome + " | " + "Preço: " + String.format("%.2f", preco )+ "]";
    }

    public static void staticPricceUpdate(Product p){
        p.setPreco(p.getPreco() * 1.1);
    }


}
