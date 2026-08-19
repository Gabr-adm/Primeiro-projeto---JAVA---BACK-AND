package Arquivos.Exercicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String caminho = "/home/gabriel.jose/Documentos";
        boolean sucess = new File(caminho + "//Product").mkdir();

        Produto p1 = new Produto("Notebook", 2500.0, 2);
        p1.total();
        Produto p2 = new Produto("TV", 3500.0, 2);
        p2.total();

        List<Produto> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);

        String path = "/home/gabriel.jose/Documentos/Product/summary.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (Produto produto: list){
                bw.write(produto.etiqueta());
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
