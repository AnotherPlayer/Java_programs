package developtsw.BaseProyect;

import javax.swing.JFrame;

/**
 *
 * @author LCE3-ALUMNO 14
 */
public class BaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CanvasBase p = new CanvasBase();
        f.add(p);
        f.pack();
        f.setVisible(true);
        
    }
    
}
