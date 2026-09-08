package Roadpmap.ExerciciosNv2.Exe2PlanoCartesiano;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

       List<Ponto2d> pontos = new ArrayList<>();

        Ponto2d p1 = new Ponto2d("p1");


        Ponto2d p2 = new Ponto2d("p2", 3.0, 2.0);



        p2.mover(5.0, 3.0);

        Ponto2d p3 = new Ponto2d("p3", p2);
        p3.mover(8.0, 5.0);


        Ponto2d p4 = new Ponto2d("p4", 5.0, 5.0);
        p4 = p3.clone();

        Ponto2d p5 = new Ponto2d("p5", 5.0, 5.0);

        p1.calcularDistancia(p2);
        p2.calcularDistancia(p3);
        p3.calcularDistancia(p4);
        p4.calcularDistancia(p5);

        pontos.add(p1);
        pontos.add(p2);
        pontos.add(p3);
        pontos.add(p4);
        pontos.add(p5);

        for (int i = 0; i < pontos.size(); i++){
            for (int j = i + 1; j < pontos.size(); j++){

                if (pontos.get(i).equals(pontos.get(j))) {
                    System.out.print("Pontos iguais encontrados: ");
                        System.out.print(pontos.get(i).getNome());
                        System.out.println(" e " + pontos.get(j).getNome());
                }
            }
        }

        System.out.println("\n---Lista dos pontos---");
        for (Ponto2d ponto2d: pontos){
            System.out.println(ponto2d);
        }

    }
}
