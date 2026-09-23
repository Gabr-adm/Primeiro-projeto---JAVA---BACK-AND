package Roadpmap.Threads.Multithreading;

public class Program {

    public static void main(String[] args) {

        Thread ping = new Thread(new MyRunnable("Ping"));
        Thread pong = new Thread(new MyRunnable("Pong"));
        ping.start();
        pong.start();


    }
}
