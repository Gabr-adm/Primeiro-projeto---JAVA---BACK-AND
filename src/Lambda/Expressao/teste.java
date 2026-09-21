package Lambda.Expressao;

import java.util.Arrays;
import java.util.List;

public class teste {

    public static void main(String[] args) {

      /*  Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread com classer interna!");
            }
        };
       new Thread(r).start();
    }*/


       /* Runnable r = () -> System.out.println("Thread com função lambda!");
        new Thread(r).start();*/

       /* System.out.println("--IMPRIMIR--");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.forEach(n -> System.out.println(n));
*/
        System.out.println("--IMPRIMIR--");
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.forEach(n -> {
            if (n % 2 == 0){
                System.out.println(n);
            }
        });
    }
}