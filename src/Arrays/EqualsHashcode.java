package Arrays;

public class EqualsHashcode {

    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Fábio";
        u1.email = "fabin047@gmail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Fábio";
        u2.email = "fabin047@gmail.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

    }

}
