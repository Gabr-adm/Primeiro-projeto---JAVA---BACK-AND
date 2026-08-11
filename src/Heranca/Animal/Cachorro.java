package Heranca.Animal;

public class Cachorro extends Animal {

    private int ossosComidos;



    public Cachorro(String nome){
        super(nome);
        this.ossosComidos = 10;
    }
    public void comerOssos(){
        ossosComidos++;

    }


    public void latir(){
        System.out.printf("%s Latiu\n", getNome());

    }
    public void lamber(){
        System.out.printf("%s Lambeu\n", getNome());

    }

    public int getOssosComidos() {
        return ossosComidos;
    }
}
