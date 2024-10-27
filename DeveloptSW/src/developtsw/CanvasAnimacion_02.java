/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package developtsw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author LCE3-ALUMNO 14
 */
public class CanvasAnimacion_02 extends JPanel implements KeyListener {

    private Timer t;//Crear variable timer
    private String cad;
    private int col[];
    private AffineTransform at;
    private Shape eli;//obligatorio usar Shape como clase papá
    private Color c;

    public CanvasAnimacion_02() {

        cad = "5IM6";

        this.addKeyListener(this);
        this.setFocusable(true);

        col = new int[3];

        //color
        for (int i = 0; i < col.length; i++) {

            col[i] = (int) (Math.random() * 255);

        }

        c = new Color(col[0], col[1], col[2]);

        at = new AffineTransform();
        at.setToTranslation(5, 0);
        eli = new Ellipse2D.Double(250, 250, 20, 20);

        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.white);
        this.setLayout(null);

        //Iniciarlizar t (milisegundos,new ActionListener(){}
        t = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(eli.getBounds().getX());

                eli = at.createTransformedShape(eli);

                for (int i = 0; i < col.length; i++) {

                    col[i] = (int) (Math.random() * 255);

                }
                //getBounds LIMITES "MEDIDAS"
                if (eli.getBounds().getX() > 480) {
                    at.setToTranslation(-5, 0);
                    c = new Color(col[0], col[1], col[2]);

                }

                if (eli.getBounds().getX() <= 0) {
                    at.setToTranslation(5, 0);
                    c = new Color(col[0], col[1], col[2]);
                }

                if (eli.getBounds().getY() > 480) {
                    at.setToTranslation(0, -5);
                    c = new Color(col[0], col[1], col[2]);
                }

                if (eli.getBounds().getY() <= 0) {
                    at.setToTranslation(0, 5);
                    c = new Color(col[0], col[1], col[2]);
                }

                repaint();//Lo que quieres modificar

            }
        });
        t.start();

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g1 = (Graphics2D) g;
        Font f = new Font("Arial", Font.BOLD, 20);
        g1.setFont(f);
        g1.drawString(cad, 20, 50);
        g1.setColor(c);
        g1.fill(eli);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_A) {
            at.setToTranslation(-5, 0);
        }

        if (e.getKeyCode() == KeyEvent.VK_D) {
            at.setToTranslation(5, 0);
        }

        if (e.getKeyCode() == KeyEvent.VK_W) {
            at.setToTranslation(0, -5);
        }

        if (e.getKeyCode() == KeyEvent.VK_S) {
            at.setToTranslation(0, 5);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
