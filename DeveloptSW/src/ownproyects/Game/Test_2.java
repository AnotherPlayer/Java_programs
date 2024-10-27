package ownproyects.Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("unused")

class Test_2 extends JPanel implements KeyListener {

    private Timer t;
    private int sp1, sp2, b;
    private Rectangle2D p1, p2;
    private int spot1, spot2, ballmove_x, ballmove_y;
    private String scorep1, scorep2;
    private Shape ball;
    private AffineTransform atball;

    //Constructor
    public Test_2() {

        this.addKeyListener(this);
        this.setFocusable(true);

        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.BLACK);

        sp1 = 0;
        sp2 = 0;
        scorep1 = "Player 1:";
        scorep2 = "Player 2:";
        spot1 = 400;
        spot2 = 400;
        ballmove_x = 5;
        ballmove_y = 5;
        b = (int) (Math.random() * 2) + 1;

        atball = new AffineTransform();

        ball = new Ellipse2D.Double(250, 250, 20, 20);

        this.setLayout(null);

        //Timer
        t = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                p1 = new Rectangle2D.Double(50, spot1, 10, 50);
                p2 = new Rectangle2D.Double(450, spot2, 10, 50);

                ball = atball.createTransformedShape(ball);

                if (b == 1) {
                    atball.setToTranslation(ballmove_x, ballmove_y);
                } else if (b == 2) {
                    atball.setToTranslation((ballmove_x * (-1)), ballmove_y * (-1));
                }

                if (ball.intersects(p1)) {
                    ballmove_x = -5;
                }

                if (ball.intersects(p2)) {
                    ballmove_x = 5;
                }
                
                if(ball.getBounds().getY() == 40 || ball.getBounds().getY() == 460){
                    
                    if(ball.getBounds().getY() == 40){
                        ballmove_y = 5;                       
                    }
                    
                    if(ball.getBounds().getY() == 460){                        
                        ballmove_y = -5;                        
                    }
                    
                }

                if (ball.getBounds().getX() == 40 || ball.getBounds().getX() == 460) {
                    if (ball.getBounds().getX() == 40) {
                        sp2++;
                    }
                    if (ball.getBounds().getX() == 460) {
                        sp1++;
                    }

                    b = (int) (Math.random() * 2) + 1;
                    ball = new Ellipse2D.Double(250, 250, 20, 20);

                }
                
                

                repaint();

            }
        });

        t.start();

    }

    //Paint
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(new Color(254, 254, 254));

        Font f = new Font("Arial", Font.BOLD, 20);
        g2.setFont(f);

        g2.drawString(scorep1+sp1, 10, 20);
        g2.drawString(scorep2+sp2, 400, 20);
        g2.fill(p1);
        g2.fill(p2);
        g2.fill(ball);

    }

    //Keyboard
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        //p1
        if (e.getKeyCode() == KeyEvent.VK_S) {
            spot1 += 5;
        }

        if (e.getKeyCode() == KeyEvent.VK_W) {
            spot1 -= 5;
        }

        //p2
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            spot2 += 5;
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            spot2 -= 5;
        }

    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
