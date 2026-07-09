package classe;

public class Margem {

    static String loja = "Loja 25% de Desconto";
    String roupa;
    double preco;
    static double desconto = 0.25;

    Margem(){
    }
    Margem( String roupaInicial, double precoInicial){
        roupa = roupaInicial;
        preco = precoInicial;

    }

    double comDesconto() {
        return preco *(1 - desconto);
    }

}
