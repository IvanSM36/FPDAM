package Tema12IntGrafico.Pruebas;

import javax.swing.*;

public class CrearMarco {

	public static void main(String[] args) {
		MiMarco marco1 = new MiMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se cierra a la X acaba el programa,
		// Si no lo  pongo se queda en segundo plano.
	}

}
