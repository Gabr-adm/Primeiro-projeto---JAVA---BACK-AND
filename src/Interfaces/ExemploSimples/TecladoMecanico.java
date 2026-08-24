package Interfaces.ExemploSimples;

public class TecladoMecanico implements Teclado {

    private String marca;

    public TecladoMecanico(String marca) {
        this.marca = marca;
    }

    @Override
    public void teclar(String tecla) {
        System.out.println("Você apertou a tecla: " + tecla + " TEC");
    }

    @Override
    public String toString() {
        return "Teclado mecânico - Marca: " + marca;
    }
}
