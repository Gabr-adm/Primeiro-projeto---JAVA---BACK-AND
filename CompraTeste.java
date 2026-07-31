package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "Neymar";

        c1.adionarItem(new Item("Bola", 10, 220));
        c1.adionarItem(new Item("Chuteira", 7, 800));
        c1.adionarItem(new Item("Caneleira", 8, 200));

        System.out.println(c1.itens.size());
        System.out.println("R$" + c1.obterValorTotal());
    }
}
