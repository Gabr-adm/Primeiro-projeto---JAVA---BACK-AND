package Compras;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static Compras.Cliente.sdf;

public class Pedido {

    private PedidoStatus status;
    private Date dataPedido;
    private Cliente cliente;

    private List<ItemPedido> itens = new ArrayList<ItemPedido>();

    Pedido(){
    }

    public Pedido(PedidoStatus status, Date moments, Cliente cliente) {
        this.status = status;
        this.dataPedido = moments;
        this.cliente = cliente;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }

    public Date getMoments() {
        return dataPedido;
    }

    public void setMoments(Date moments) {
        this.dataPedido = moments;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }
    public double total(){
        double sum = 0.0;
        for (ItemPedido it: itens){
            sum += it.subTotal();
        }
        return sum;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(dataPedido) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(cliente + "\n");
        sb.append("Order items:\n");
        for (ItemPedido item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
