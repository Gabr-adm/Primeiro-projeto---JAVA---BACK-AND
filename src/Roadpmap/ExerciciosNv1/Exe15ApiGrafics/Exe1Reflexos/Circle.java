package Roadpmap.ExerciciosNv1.Exe15ApiGrafics.Exe1Reflexos;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Circle extends JPanel {

    private int tentativas = 3;
    private Color cor = Color.BLUE;
    private int x;
    private int y;
    private int tamanho = 100;
    private boolean aparecer = true;
    private long tempoInicial;

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public void alterarCor(Color novaCor){
        cor = novaCor;
        repaint();
    }

    public void mostrarCirculo(){

        Random random = new Random();

        x = random.nextInt(getWidth() - tamanho);
        y = random.nextInt(getHeight()- tamanho);

        aparecer = true;

        tempoInicial = System.nanoTime();

        repaint();

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if (aparecer) {
            g.setColor(cor);
            g.fillOval(x, y, tamanho, tamanho);
        }
    }

    public Circle(){

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (!aparecer){
                    return;
                }
                int mouseX = e.getX();
                int mouseY = e.getY();

                int centroX = x + tamanho / 2;
                int centroY = y + tamanho / 2;

                int dx = mouseX - centroX;
                int dy = mouseY - centroY;

                int raio = tamanho / 2;

                if (dx * dx + dy * dy <= raio * raio){

                    long tempoFinal = System.nanoTime();

                    long tempo = (tempoFinal - tempoInicial) / 1_000_000;

                    JOptionPane.showMessageDialog(Circle.this, "Acertou! \n Tempo: " + tempo + "ms");

                } else {
                    JOptionPane.showMessageDialog(Circle.this, "Você errou o alvo!");
                }
                aparecer = false;
                repaint();
            }
        });
    }

}
