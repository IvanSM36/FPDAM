package Tema12IntGrafico.Pruebas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CajaTextoEtiquetaDesplegable {

	public static void main(String[] args) {
		MarcoPrueba01 marco1 = new MarcoPrueba01();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se cierra a la X acaba el programa,
		// Si no lo pongo se queda en segundo plano.
	}

}

class MarcoPrueba01 extends JFrame {
	public MarcoPrueba01() {
		setVisible(true);
		setSize(600, 400);
		setLocation(400, 200);
		setTitle("Prueba01");
		LaminaPrueba01 miLamina = new LaminaPrueba01();
		add(miLamina);
	}
}

class LaminaPrueba01 extends JPanel {
	public LaminaPrueba01() {
		// Etiqueta
		JLabel texto1 = new JLabel("Email: ");
		add(texto1);

		// CampodeTexto
		JTextField campo1 = new JTextField(20);
		add(campo1);
		
		//Lista jComboBox
		JComboBox desplegable = new JComboBox();
		//Añadimos los items
		desplegable.addItem("Lunes");
		desplegable.addItem("Martes");
		desplegable.addItem("Miercoles");
		desplegable.addItem("Jueves");
		desplegable.addItem("Viernes");
		desplegable.addItem("Sabado");
		desplegable.addItem("Domingo");
		add(desplegable);
	}

}