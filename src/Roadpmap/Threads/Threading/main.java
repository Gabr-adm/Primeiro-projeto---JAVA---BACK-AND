package Roadpmap.Threads.Threading;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.print("You have 5 seconds to enter your name!");
        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();
        System.out.print("\nHello " + name);
        System.out.println();

        sc.close();

    }


}
