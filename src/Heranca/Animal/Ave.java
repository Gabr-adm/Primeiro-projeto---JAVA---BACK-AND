package Heranca.Animal;

public class Ave extends Animal{

    public Ave(String nome) {
        super(nome);
    }
    public void voar(){
        System.out.printf("%s Voou\n", getNome());
    }
}
