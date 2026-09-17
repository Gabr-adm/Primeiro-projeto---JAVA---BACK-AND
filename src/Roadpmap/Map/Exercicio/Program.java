package Roadpmap.Map.Exercicio;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String path = "/home/gabriel.jose/Documentos";
        boolean sucesso = new File(path + "//Eleições").mkdir();

        Map<Integer, Urna> urnas = new HashMap<>();

        Urna c1 = new Urna("Alex", 15);
        c1.votar(30);
        c1.votar(31);

        Urna c2 = new Urna("Maria", 22);
        c2.votar(27);
        c2.votar(22);

        Urna c3 = new Urna("Bob", 21);
        c3.votar(15);
        c3.votar(25);

        urnas.put(1, c1);
        urnas.put(2, c2);
        urnas.put(3, c3);


        String caminho = "/home/gabriel.jose/Documentos/Eleições/urna.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
            for (Urna urna: urnas.values()){
                bw.write(urna.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
