package Tema12IntGrafico.Pruebas;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PintarString {

	public static void main(String[] args) {
		MarcoConTexto marco1 = new MarcoConTexto();	
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se cierra a la X acaba el programa,
		// Si no lo pongo se queda en segundo plano.
	}

}

class MarcoConTexto extends JFrame{
	public MarcoConTexto () {
		setVisible(true);
		setSize(600,400);
		setLocation(400,200);
		setTitle("Mi primer texto");
		Lamina miLamina = new Lamina();
		add(miLamina);
	}
}

class Lamina extends JPanel{
	public void paintComponent (Graphics g) {
		super.paintComponent(g); // Llamo a paintComponent del padre, Lo necesitamos para trabajar con colores de fondo, tipos y tamaños de letras..., botones, menus
		//g.drawString("Estamos aprendiendo Swing", 10,20);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(10,20,220,150);
		g2.draw(rectangulo);
		g2.setPaint(new Color(38,43,68));
		g2.fill(rectangulo);
		
		//Dibujar una elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		g2.setPaint(new Color(205,213,247));
		g2.fill(elipse);
		
		//Color de texto		
		Font mifuente = new Font("Courier", Font.BOLD, 26);
		g2.setFont(mifuente);
		g2.setColor(Color.BLUE);
		g2.drawString("Probando color 1", 10, 200);
		g2.setFont(new Font("Arial", Font.ITALIC, 14));
		g2.drawString("Curso de Java", 10, 220);
		
		//Introducimos un boton
		JButton miBoton = new JButton("Boton1");
		add(miBoton);
		
	}
	
}