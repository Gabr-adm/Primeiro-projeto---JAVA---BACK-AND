package Heranca.Animal;

public class Pombo extends Ave{

    private int cartasEntregue = 10;

    public Pombo(String nome) {
        super(nome);
    }


    public void fazerPru(){
        System.out.printf("%s Fez PRUUUUHHH\n", getNome());
    }
    public void entregarCartas(){
        cartasEntregue++;
    }

    public int getCartasEntregue() {
        return cartasEntregue;
    }
}
