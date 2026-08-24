package Interfaces.ExemploSimples;

public class MouseComRgb implements Mouse {

    private String marca;

    public MouseComRgb(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void clicar(String lado) {
        System.out.println("Você clicou com o lado: " + lado + " (luz RGB)");
    }

    @Override
    public void rolar(String direcao) {
        System.out.println("Você rolou para: " + direcao + " (luz RGB)");
    }
    @Override
    public String toString() {
        return "Mouse com RGB - Marca: " + marca;
    }
}
