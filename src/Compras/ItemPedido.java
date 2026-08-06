package Compras;

public class ItemPedido {

    private Integer quantidade;
    private Double vlrTotalItem;
    private Produto produto;

    ItemPedido(){
    }

    public ItemPedido(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.vlrTotalItem = preco;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getVlrTotalItem() {
        return vlrTotalItem;
    }

    public void setVlrTotalItem(Double vlrTotalItem) {
        this.vlrTotalItem = vlrTotalItem;
    }

    public double subTotal(){
      return vlrTotalItem * quantidade;
    }

    @Override
    public String toString() {
        return getProduto().getNome() + ", $" + String.format("%.2f", vlrTotalItem) + ", Quantidade: " + quantidade + ", Subtotal: $" + subTotal();
    }
}
