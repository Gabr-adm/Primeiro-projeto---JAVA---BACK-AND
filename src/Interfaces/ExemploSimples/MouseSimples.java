package Interfaces.ExemploSimples;

public class MouseSimples implements Mouse {

    private String marca;

    public MouseSimples(String marca) {
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
        System.out.println("Você clicou com o lado: " + lado);
    }

    @Override
    public void rolar(String direcao) {
        System.out.println("Você rolou para: " + direcao);
    }
    @Override
    public String toString() {
        return "Mouse simples - Marca: " + marca;
    }
}
