package Heranca.Desafio;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{

    private Date dataDeFabricacao;

    SimpleDateFormat fmt = new  SimpleDateFormat("dd/MM/yyyy");

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao){
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String etiqueta() {
        return "Produto usado: " + getNome() +
                "\n" +
                "Preço: " + getPreco() +
                "\n" +
                "Data de fabricação: " + fmt.format(dataDeFabricacao);
    }
}
