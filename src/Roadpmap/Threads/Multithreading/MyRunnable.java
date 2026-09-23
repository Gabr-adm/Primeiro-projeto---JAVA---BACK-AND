package Roadpmap.Threads.Multithreading;

public class MyRunnable implements Runnable {

    private String text;

    public MyRunnable(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void run(){

        try {
            for (int i = 1; i<=5; i++){

                Thread.sleep(1000);
                System.out.println(text);
            }
        } catch (InterruptedException e){
            System.out.println("Thread was interrupted!");
        }
    }
}
