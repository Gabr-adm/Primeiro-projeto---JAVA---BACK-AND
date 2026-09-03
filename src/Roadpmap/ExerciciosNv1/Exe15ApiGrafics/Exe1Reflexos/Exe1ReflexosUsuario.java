package Roadpmap.ExerciciosNv1.Exe15ApiGrafics.Exe1Reflexos;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Exe1ReflexosUsuario {

    public static void main(String[] args) throws Exception {

        Random random = new Random();
        int tempo = random.nextInt(5) + 1;


        JFrame campo = new JFrame("Círculo");
        campo.setSize(500, 400);
        campo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campo.setLocationRelativeTo(null);

        Circle circulo = new Circle();
        // Thread.sleep(tempo * 1000);
        campo.setVisible(true);
        campo.add(circulo);
        circulo.alterarCor(Color.black);


    }
}
