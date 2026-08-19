package Exececoes.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite nome para atribuir no vetor: ");
            String[] vect = sc.nextLine().split(" ");
            int positon = sc.nextInt();
            System.out.println(vect[positon]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("---Invalid position!---");
        } catch (InputMismatchException e) {
            System.out.println("imput error");
        }
        System.out.println("End of program");
        sc.close();
    }
}
