package Tema12IntGrafico.Pruebas;

import java.awt.Frame;

import javax.swing.*;

public class MiMarco extends JFrame {

	public MiMarco() {
		setTitle("Mi ventana");
		setSize(900, 600); // Ancho y alto de la ventana
		setLocation(500, 300); //Localizacion de la ventana
		setResizable(true); // no redimensiona
		//setBounds(50, 50, 1000, 500); // Pones el tamaño y localizacion en el mismo metodo
		//setExtendedState(Frame.MAXIMIZED_BOTH); // Maximizar a todo el espacio.
	}

}
