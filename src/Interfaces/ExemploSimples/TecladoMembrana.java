package Interfaces.ExemploSimples;

public class TecladoMembrana implements Teclado {

    private String marca;

    public TecladoMembrana(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void teclar(String tecla) {
        System.out.println("Você apertou a tecla: " + tecla + " e não fez barulho.");
    }

    @Override
    public String toString() {
        return "Teclado de membrana - Marca: " + marca;
    }
}
