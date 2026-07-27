package testing;

import java.util.ArrayList;
import java.util.Scanner;

public class Para {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 números: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int maior = max(a, b, c);

        showResult(maior);
        entrada.close();


    }
    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }
        else if (y > x && y > z){
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int velho){
        System.out.println("Maior = " + velho);
    }
}
