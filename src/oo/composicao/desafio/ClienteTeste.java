package oo.composicao.desafio;

import java.util.ArrayList;

public class ClienteTeste {

    public static void main(String[] args) {



        Compra compra1 = new Compra();
        compra1.adicionarItem("Notebook", 2500, 1);
        compra1.adicionarItem("Monitor", 1000, 1);

        var compra2 = new Compra();
        compra2.adicionarItem("PS5", 2800, 1);
        compra2.adicionarItem("GTA6", 550, 1);

        Cliente cliente = new Cliente("Gabriel");
        cliente.compras.add(compra1);
        cliente.compras.add(compra2);


    }
}
