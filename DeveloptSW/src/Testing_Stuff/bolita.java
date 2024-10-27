/**
 *	Programador: Josu� Patricio Tamayo S�nchez.
 *
 *	Fecha: 14 de Agosto de 2007
 *
 *	Descripcion: Este programa utiliza lo que es el
 *				canvas, frame, threads; gracias a esto
 *				podemos realizar que una pelotita rebote
 *				en las paredes del canvas el cual esta
 *				contenida en el frame...
 *				 Tiene un error que todavia noce como
 *				corregirlo... el que lo corriga que me
 *				diga como o si alguien lo mejora,
 *				estos son mis correos:
 *					kushiahu@hotmail.com
 *					kushyahu@gmail.com
 *
 *	Nota: Por si alguien no entiende algo,
 *			favor de preguntarme, arriba tan mis correos
 *			tratare de ayudarlos, soy nuevo en esto
 *			asi que en lo que pueda ayudar, les ayudo
 *			si estan interesados en JAVA y espero que este
 *			programa sea de ayuda!!!!
 *
 *			JAVA es la TOLA!!!!!
 *
 *			YO SOY EL PROGRAMADOR
 *			PERO SOLO HAY UN ARQUITECTO....
 *
 *					JAVA!!!!!
 */

/* package bola; //crea lor archivos class en una carpeta llamada bola */

import java.awt.*;
import javax.swing.*;

/*
 *	Programador: Josu� Tamayo.
 */

public class bolita extends JFrame{
	
	/*	Constructor de bolita	*/
	bolita(){
		super("Rebota Bolita U_U");	
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rect = getBounds();	// Para obtener las medidas del JFrame
		pantalla p = new pantalla((int)rect.width,(int)rect.height);
		getContentPane().add(p);
		pack();
		setVisible(true);
		p.start();
	}
	
	/*	Metodo inicial MAIN	*/
	public static void main(String args[]){
		new bolita();
	}
	
	/*	Deaclaracion de las Variables locales de esta clase	*/
	private Rectangle rect;
	
}

class pantalla extends Canvas implements Runnable{
	
	/*	Constructor de pantalla	*/
	pantalla(int x, int y){
		setSize(x,y);
		setBackground(Color.yellow);
		rect = getBounds();
	}
	
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.fillOval(x,y,12,12);		
	}
	
	public void run(){
		try{
			while(running){
				if (dir == 1){
					x--;
					y--;
					if (x == 0)
						dir = 2;
					if (y == 0)
						dir = 4;
				}
				if (dir == 2){
					x++;
					y--;
					if (x == (rect.width - 12))	// Es menos 12 por el diametro de la pelotita
						dir = 1;
					if (y == 0)
						dir = 3;
				}
				if (dir == 3){
					x++;
					y++;
					if (x == (rect.width - 12))
						dir = 4;
					if (y == (rect.height - 12))
						dir = 2;
				}
				if (dir == 4){
					x--;
					y++;	
					if (x == 0)
						dir = 3;
					if (y == (rect.height - 12))
						dir = 1;				
				}
				System.out.println(" -> " + x + " " + y + " " + dir);
				repaint();
				Thread.sleep(5);
			}
		}catch(InterruptedException e){
			running = false;
		}
	}
	
	public void start(){
		if (t == null){
			x = getPointsX();
			y = getPointsY();
			/*
			 *	Con el metodo "dir()" obtengo la direccion inicial de la pelota
			 *	Lo maneje como un plano cartesiano en forma de X...
			 *	A ver si me explico jejejeje!!!!!
			 */
			dir = dir();
			running = true;
			t = new Thread(this);
			t.start();
		}
	}
	
	public void update(Graphics g){
		/*
		 *	Esto lo obtuve de un ejemplo:
		 *		Segun yo... esto me limpia la pantalla para
		 *		asi poder dibujar en el canvas el objeto
		 *		en su nueva posicion.
		 *		Si esto no se hace... el objeto dibujado 
		 *		con anterioridad aparecera y sera sobre-dibujado
		 *	Pero si alguien sabe exactamente que rollo con esto
		 *	que me lo explique; arriba tengo mis correos
		 *	U_U
		 */
		rect = getBounds();
		Image image = createImage(rect.width,rect.height);
		Graphics gi = image.getGraphics();
		gi.clearRect(0,0,rect.width,rect.height);
		paint(gi);
		g.drawImage(image,0,0,null);
	}
	
	/*	Metodo que da la coordenada X inicial	*/
	private int getPointsX(){
		int num;
		do{
			num = (int)Math.round(Math.random() * 10000);
		}while(num>=rect.width-12);
		return num;
	}
	
	/*	Metodo que da la coordenada Y inicial	*/
	private int getPointsY(){
		int num;
		do{
			num = (int)Math.round(Math.random() * 10000);
		}while(num>=rect.height-12);
		return num;
	}
	
	/*	Metodo que da la direccion inicial de la bolita	*/
	private int dir(){
		int num;
		do{
			num = (int)Math.round(Math.random()*10);
		}while((num>4) || (num == 0));
		return num;
	}	
	
	/*	Deaclaracion de las Variables locales de esta clase	*/
	private Rectangle rect;
	private int x;
	private int y;
	private int dir; 
	private Thread t;
	private boolean running;
	
}