package poo;

public class Quarto {

    private static String nome;
    private static String email;


    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Quarto.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Quarto.email = email;
    }

    Quarto(){
    }

    public Quarto(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + ", " + email;
    }
}
