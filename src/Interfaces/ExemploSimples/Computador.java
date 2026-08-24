package Interfaces.ExemploSimples;

public class Computador {

    private Teclado teclado;
    private Mouse mouse;

    public Computador(Teclado teclado, Mouse mouse) {
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public void teclar(String tecla) {
        teclado.teclar(tecla);
    }

    public void clicar(String lado) {
        mouse.clicar(lado);
    }

    public void rolar(String direcao) {
        mouse.rolar(direcao);
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "=== Computador ===\n"
                + teclado + "\n"
                + mouse;
    }
}
