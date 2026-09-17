package Roadpmap.Generics;

public class Program {

    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        bolsaNinja.adicionarFerramenta(new Kunai("Shō-kunai"));
        bolsaNinja.adicionarFerramenta(new Shuriken(16));
        bolsaNinja.adicionarFerramenta(new Pergaminho("七転び八起き"));

        bolsaNinja.mostrarFerramenta();
    }
}
