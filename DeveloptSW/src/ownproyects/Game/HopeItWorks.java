package ownproyects.Game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("unused")

public class HopeItWorks extends JFrame {

    private static Rectangle rect;

    public static void main(String[] args) {

        JFrame frm = new JFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Test1 backgr = new Test1();

        rect = backgr.getBounds();
        pantalla screen = new pantalla((int) rect.width, (int) rect.height, backgr);

        frm.add(screen);
        frm.add(backgr);
        frm.pack();
        frm.setVisible(true);

    }

}

@SuppressWarnings("unused")

class pantalla extends Canvas implements Runnable {

    private Rectangle rect;
    private int x, y, dir;
    private Thread t;
    private boolean running;
    private Test1 backgr;

    public pantalla(int x, int y, Test1 backgr) {
        setSize(x, y);
        rect = getBounds();
        this.backgr = backgr;
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(x, y, 12, 12);
    }
    

    private int getPointsX() {
        int num;
        do {
            num = (int) Math.round(Math.random() * 10000);
        } while (num >= rect.width - 12);
        return num;
    }

    /*	Metodo que da la coordenada Y inicial	*/
    private int getPointsY() {
        int num;
        do {
            num = (int) Math.round(Math.random() * 10000);
        } while (num >= rect.height - 12);
        return num;
    }

    /*	Metodo que da la direccion inicial de la bolita	*/
    private int dir() {
        int num;
        do {
            num = (int) Math.round(Math.random() * 10);
        } while ((num > 4) || (num == 0));
        return num;
    }

    @Override
    public void run() {

        try {
            while (running) {
                if (dir == 1) {
                    x--;
                    y--;
                    if (x == 0) {
                        dir = 2;
                    }
                    if (y == 0) {
                        dir = 4;
                    }
                }
                if (dir == 2) {
                    x++;
                    y--;
                    if (x == (rect.width - 12)) // Es menos 12 por el diametro de la pelotita
                    {
                        dir = 1;
                    }
                    if (y == 0) {
                        dir = 3;
                    }
                }
                if (dir == 3) {
                    x++;
                    y++;
                    if (x == (rect.width - 12)) {
                        dir = 4;
                    }
                    if (y == (rect.height - 12)) {
                        dir = 2;
                    }
                }
                if (dir == 4) {
                    x--;
                    y++;
                    if (x == 0) {
                        dir = 3;
                    }
                    if (y == (rect.height - 12)) {
                        dir = 1;
                    }
                }
                System.out.println(" -> " + x + " " + y + " " + dir);
                repaint();
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            running = false;
        }

    }

}
