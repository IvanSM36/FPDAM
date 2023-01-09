package Tema12IntGrafico.Pruebas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MarcoCentrado {

	public static void main(String[] args) {
		DosMarcoCentrado marco1 = new DosMarcoCentrado();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se cierra a la X acaba el programa,
		// Si no lo pongo se queda en segundo plano.
	}
}

class DosMarcoCentrado extends JFrame {
	
	public DosMarcoCentrado() {
		// Detectamos la resolucion de pantalla que se utiliza
		Toolkit mipantalla = Toolkit.getDefaultToolkit(); // Recogemos nuestro sistema nativo de ventana
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		int alturaPantalla = tamanoPantalla.height;
		int anchuraPantalla = tamanoPantalla.width;
		setSize(anchuraPantalla / 2, alturaPantalla / 2);
		setLocation(100, 100);
		setTitle("Dimension");
		Image mIcono = mipantalla.getImage("images/gamba.png");
		setIconImage(mIcono);
	}

}
