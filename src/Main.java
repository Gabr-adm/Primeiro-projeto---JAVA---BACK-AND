import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x = 3;
        int y = 0;

        for (int i = 0; i < x; i++){
            System.out.print(i + ",");
            y = y + 5;
        }
        System.out.println(y);

    }
}