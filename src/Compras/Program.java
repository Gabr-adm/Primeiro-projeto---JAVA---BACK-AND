package Compras;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Cliente cliente = new Cliente();

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date dataNascimento = sdf.parse(sc.next());


        System.out.println("Digite os dados:");
        System.out.println("Status: ");
        PedidoStatus status = PedidoStatus.valueOf(sc.next());

        Pedido pedido = new Pedido(status, new Date(), cliente);

        System.out.println("Quantos itens o pedido irá possuir? ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println("Digite o #" + i + " item ");
            System.out.println("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();

            System.out.println("Digite o preço: ");
            double precoProduto = sc.nextDouble();

            System.out.println("Quantidade: ");
            int quantidadeProduto = sc.nextInt();

            Produto produto = new Produto(nomeProduto, precoProduto);

            ItemPedido it = new ItemPedido(quantidadeProduto, precoProduto, produto);

            pedido.adicionarItem(it);
        }
        System.out.println();
        System.out.println(pedido);
    }
}
