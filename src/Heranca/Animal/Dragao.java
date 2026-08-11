package Heranca.Animal;

public class Dragao extends Ave{

    public Dragao(String nome){
        super(nome);
    }


    public void cuspirFogo(){
        System.out.printf("%s Cuspiu Fogo\n", getNome());

    }
}
