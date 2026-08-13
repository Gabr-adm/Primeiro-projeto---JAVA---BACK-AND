package EnumEcomposicao;

import java.util.Date;

public class Programm {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1080, new Date(), PedidoStatus.PEDING_PAYMENT);

        System.out.println(pedido);

        PedidoStatus os1 = PedidoStatus.ENTREGUE;
        PedidoStatus os2 = PedidoStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);

    }
}
