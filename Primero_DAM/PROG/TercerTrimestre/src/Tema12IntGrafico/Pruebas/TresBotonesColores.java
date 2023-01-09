package Tema12IntGrafico.Pruebas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TresBotonesColores {

	public static void main(String[] args) {
		MarcoTresBotones marco1 = new MarcoTresBotones();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando se cierra a la X acaba el programa,
		// Si no lo pongo se queda en segundo plano.
	}

}

class MarcoTresBotones extends JFrame {
	public MarcoTresBotones() {
		setVisible(true);
		setSize(600, 400);
		setLocation(400, 200);
		setTitle("Prueba01");
		LaminaTresBotones miLamina = new LaminaTresBotones();
		
		//añadimos al contenedor marco el layout
		FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
		miLamina.setLayout(disposicion);
		add(miLamina);
		
		
	}
}

class LaminaTresBotones extends JPanel implements ActionListener {
	
	// Creamos los botones en la lamina

	JButton boton1 = new JButton("Azul");
	JButton boton2 = new JButton("Rojo");
	JButton boton3 = new JButton("Verde");
	
	// Agregamos los botones
	public LaminaTresBotones() {
		
		add(boton1);
		add(boton2);
		add(boton3);
		boton1.addActionListener(this); // le aplico la accion del evento
		boton2.addActionListener(this);
		boton3.addActionListener(this);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object botonPulsado = e.getSource(); //Para coger el boton que lanza el evento -Boton fuente
		
		if(botonPulsado == boton1) {
			setBackground(Color.BLUE);
		}
		else if(botonPulsado == boton2) {
			setBackground(Color.RED);
		}
		else if (botonPulsado == boton3) {
			setBackground(Color.GREEN);
		}
	
	}

}