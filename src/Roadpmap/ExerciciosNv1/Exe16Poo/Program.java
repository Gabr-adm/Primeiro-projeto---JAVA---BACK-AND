package Roadpmap.ExerciciosNv1.Exe16Poo;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Pessoa p1 = new Pessoa("Albert Einstein", LocalDate.parse("14/03/1879", fmt));
        p1.calcularIdade();
        System.out.println();
       // p1.ajustarDataDeNascimento(LocalDate.parse("11/04/2003", fmt));
        p1.calcularIdade();
        System.out.print(p1);



        Pessoa p2 = new Pessoa("Issac Newton", LocalDate.parse("04/01/1643", fmt));
        p2.calcularIdade();
        System.out.println();
      //  p2.ajustarDataDeNascimento(LocalDate.parse("11/04/2003", fmt));
        p2.calcularIdade();
        System.out.print(p2);




    }
}
