package Heranca.Animal;

public class App {

    public static void main(String[] args) throws Exception {

        Cachorro cachorro = new Cachorro("Zépovinho");
        cachorro.comer();
        cachorro.beber();
        cachorro.lamber();
        cachorro.latir();
        cachorro.comerOssos();
        System.out.println(cachorro.getNome() + " comeu " +  cachorro.getOssosComidos() + " ossos.");


        Dragao dragao = new Dragao("Fúria da noite");
        dragao.comer();
        dragao.beber();
        dragao.voar();
        dragao.cuspirFogo();

        Pombo pombo = new Pombo("PomboBolt");
        pombo.comer();
        pombo.beber();
        pombo.fazerPru();
        pombo.entregarCartas();
        pombo.getCartasEntregue();
        pombo.entregarCartas();


    }
}
