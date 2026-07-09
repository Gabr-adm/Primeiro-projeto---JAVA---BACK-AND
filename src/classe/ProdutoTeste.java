package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Picanha", 81.50, 0.1);
        p1.nome = "Picanha";
        p1.preco = 81.50;
        p1.desconto = 0.1;

        var p2 = new Produto("Filé de costela", 48.50, 0.1);
        p2.nome = "Filé de costela";
        p2.preco = 48.50;
        p2.desconto = 0.1;

        double valorMediaL1 = p1.precoComDesconto();
        double valorMediaL2 = p2.precoComDesconto();
        double totalDoCarrinho = (valorMediaL1 + valorMediaL2);

        System.out.printf(" Total no carrinho = R$" + totalDoCarrinho);

    }
}
