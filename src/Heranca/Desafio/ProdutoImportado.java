package Heranca.Desafio;

public class ProdutoImportado extends Produto {

    private Double taxaAlfandega;

    ProdutoImportado(String nome, double preco, double taxaAlfandega){
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    public double precoTotal(){
        return getPreco() * taxaAlfandega;
    }
    @Override
    public String etiqueta(){
        return "Nome: " + getNome() +
                "\n" +
                "Preço: " + getPreco() +
                "\n" +
                "Taxa da Alfândega: " + taxaAlfandega
                + "\n" +
                "Preço total: " + precoTotal();
    }
}
