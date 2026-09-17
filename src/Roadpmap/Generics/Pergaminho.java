package Roadpmap.Generics;

public class Pergaminho {

    private String mensagem;

    public Pergaminho(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString(){
        return "Mensagem: " + mensagem;
    }
}
