package classe;

import static classe.Margem.loja;

public class MargemTeste {

    public static void main(String[] args) {

        Margem m1 = new Margem();
        m1.roupa = "Camisa";
        m1.preco = 150;


        var m2 = new Margem();
        m2.roupa = "Calça";
        m2.preco = 300;

        double carrinho = (m1.comDesconto() + m2.comDesconto());
        System.out.println("Seja bem vindo a " + loja + "!");
        System.out.println("Carrinho: R$" + carrinho);



    }

}
