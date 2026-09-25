package Roadpmap.Network.Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Program {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(3322);
        System.out.println("Servidor iniciado na porta 3322");

        Socket client = server.accept();

        //OUTRAS LÓGICAS AQUI
    }
}
