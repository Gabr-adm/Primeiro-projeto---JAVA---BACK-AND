package poo;

import java.util.ArrayList;

public class Desafio03Test {

    public static void main(String[] args) {

        Desafio03 a1 = new Desafio03("Gabriel");
        a1.nota1 = 27;
        a1.nota2 = 31;
        a1.nota3 = 32;

        var a2 = new Desafio03("Felipe");
        a2.nota1 = 2;
        a2.nota2 = 5;
        a2.nota3 = 23;

        var a3 = new Desafio03("Matheus");
        a3.nota1 = 7;
        a3.nota2 = 40;
        a3.nota3 = 23;


        ArrayList<Desafio03> alunos = new ArrayList<>();

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        for (Desafio03 desafio03: alunos){
            if (desafio03.mediaFinal() <= 60){
                System.out.println("\n" + desafio03.aluno + " reprovou. ");
                System.out.println("Faltou: " + (desafio03.diferencaNota()) + " pontos para passar.");
            } else {
                System.out.println("\n" + desafio03.aluno + " aprovado.");
            }


        }


    }
}
