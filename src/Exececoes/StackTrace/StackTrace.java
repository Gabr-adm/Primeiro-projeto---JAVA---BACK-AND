package Exececoes.StackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {

    public static void main(String[] args) {

        metodo1();
        metodo2();



    }
    public static void metodo1(){
        System.out.println("--START MTD1--");
        metodo2();
        System.out.println("--END MTD1--");
    }


    public static void metodo2(){
        System.out.println("--START MTD2--");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nomes: ");
            String[] vect = sc.nextLine().split(" ");
            System.out.println("Posição do vetor: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("---Invalid position!---");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e){
            System.out.println("---Input Error!---");
        }
        System.out.println("--END MTD2--");

        System.out.println("Programa Finalizado.");
    }
}
