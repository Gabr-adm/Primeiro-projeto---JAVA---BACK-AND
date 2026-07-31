package testing;

public class Computador {
    Processador processador = new Processador();
    Memoria memoria = new Memoria();

    public static void main(String[] args) {

        Computador pc1 = new Computador();
        pc1.processador.modelo = "Intel I7 ";
        pc1.memoria.gb = 32;
        String config = "Processador: " + pc1.processador.modelo + "\nMemória: " +  pc1.memoria.gb + "GB";

        System.out.println(config);



    }

}
