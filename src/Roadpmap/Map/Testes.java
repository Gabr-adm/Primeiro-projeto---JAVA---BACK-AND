package Roadpmap.Map;

import java.util.HashMap;
import java.util.Map;

public class Testes {

    public static void main(String[] args) {

        Map<String, String> usuario = new HashMap<>();
        usuario.put("ID", "23");
        usuario.put("Nome", "Gabriel");
        usuario.put("Email", "gabriel@gmail.com");
        usuario.put("Cpf", "012.345.678-90");

        //usuario.remove("Email");
      //  usuario.remove("Nome");
        usuario.put("Nome", "Rafael");

        System.out.println("A lista possui idade (true || false)? " + usuario.containsKey("Idade"));
        System.out.println("A lista possui email (true || false)? " + usuario.containsKey("Email"));

        System.out.println("Formulário:");

        for (String chave: usuario.keySet()){
            System.out.println(chave + ":" + usuario.get(chave));
        }
    }
}
