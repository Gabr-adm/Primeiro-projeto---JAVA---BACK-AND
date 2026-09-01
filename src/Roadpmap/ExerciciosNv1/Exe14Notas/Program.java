package Roadpmap.ExerciciosNv1.Exe14Notas;

import Arquivos.Exercicio.Produto;

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
        List<Aluno> list = new ArrayList<>();

        String caminho = "/home/gabriel.jose/Documentos";
        boolean sucess = new File(caminho + "//Notas").mkdir();




        String abreviacao = "";
        int quantidadeAlunos = 3;


        for (int i = 0; i < quantidadeAlunos; i++){

            System.out.println("Nome: ");
            String nome = sc.nextLine();
            int totalCaracter = nome.length();
            System.out.println("Matrícula: ");
            int matricula = sc.nextInt();
            System.out.println("Primeira nota: ");
            double nota1 = sc.nextDouble();
            System.out.println("Segunda nota: ");
            double nota2 = sc.nextDouble();
            sc.nextLine(); // Consome a quebra de linha deixada pelo nextDouble().

            Aluno aluno = new Aluno(nome, totalCaracter, matricula, nota1, nota2);
            list.add(aluno);

        }
        String path = "/home/gabriel.jose/Documentos/Notas/Alunos.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (Aluno alunos: list){
                bw.write(alunos.toString());
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }




    }
}
