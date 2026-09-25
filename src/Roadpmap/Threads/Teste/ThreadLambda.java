package Roadpmap.Threads.Teste;

public class ThreadLambda {

    public static void main(String[] args) {

        Runnable tarefa = () -> {
            System.out.println("Executando...");
        };

        Thread thread = new Thread(tarefa);
        thread.start();

    }
}
