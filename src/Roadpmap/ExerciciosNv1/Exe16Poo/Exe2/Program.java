package Roadpmap.ExerciciosNv1.Exe16Poo.Exe2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Quantos alunos: ");
        int quantidadeDeAlunos = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i<quantidadeDeAlunos; i++){
            System.out.print("Nome do aluno: ");
            String nomeAluno = sc.nextLine();

            System.out.print("Nome da Universidade: ");
            String nomeUniversidade = sc.nextLine();

            list.add(new Pessoa(nomeAluno, new Universidade(nomeUniversidade)));
        }

        for (Pessoa pessoa: list){
            System.out.println(pessoa);
        }
    }
}
