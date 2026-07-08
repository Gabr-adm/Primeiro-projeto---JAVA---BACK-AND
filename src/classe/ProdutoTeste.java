package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Picanha";
        p1.preco = 81.50;
        p1.desconto = 0.1;

        var p2 = new Produto();
        p2.nome = "Filé de costela";
        p2.preco = 48.50;
        p2.desconto = 0.1;

        double precoFinall1 = p1.precoComDesconto();
        double precoFinall2 = p2.precoComDesconto();
        double mediaDoCarrinho = (precoFinall1 + precoFinall2) / 2;

        System.out.printf(" Média do carrinho = R$%.2f.", mediaDoCarrinho);

    }
}
