package Tema10Ficheros.Practica01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParteB {

	public static void main(String[] args) {

		try {
			// Declaro la clase DocumentBuilderFactory para
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// Declaro un documentBuilder que nos permite tomar el xml y convertirlo a un objeto Document para  luego realizar las consultas
			DocumentBuilder builder = factory.newDocumentBuilder();
			//Creamos Documents y cargamos el fichero XML con la clase File
			Document documento = builder.parse(new File("xml/Arboles.xml"));
			//LLamamos al metodo loopNodexml para que recorra el fichero .xml y nos muestre y nos genere un .txt con los valores del xml
			loopNodeXml(documento.getDocumentElement());
			
		} catch (ParserConfigurationException pce) {
			Logger.getLogger(ParteB.class.getName()).log(Level.SEVERE, null, pce);
		} catch (SAXException saxe) {
			Logger.getLogger(ParteB.class.getName()).log(Level.SEVERE, null, saxe);
		} catch (IOException ioe) {
			Logger.getLogger(ParteB.class.getName()).log(Level.SEVERE, null, ioe);
		}
	}

	public static void loopNodeXml(Node n) {

		try {
			//Instanciamos un BufferedWriter y crearemos un fichero .txt con FileWriter indicando la ruta y lo ponemos en true.
			//Indicamos a true para que vaya añadiendo linea a linear en el documento.txt ya que
			BufferedWriter bw = new BufferedWriter(new FileWriter("src/Tema11Ficheros/Ficheros/nodos.txt",true));
			
			//Para añadir tambien los nodos lo escribimos con n.getNodeName()
			//Lo comento para que solo añada los valores del fichero.txt
			//bw.write(n.getNodeName() + "\n");
			
			// Cojo todas las etiquetas del fichero.txt
			NodeList hijos = n.getChildNodes();
			//Recorro las etiquetas
			for (int i = 0; i < hijos.getLength(); i++) {
				// Obtenemos el nodo actual
				Node hijo = hijos.item(i);
				// Compruebo si el nodo es un elemento
				if (hijo.getNodeType() == Node.ELEMENT_NODE) {
					// Recorremos el hijo recursivamente
					loopNodeXml(hijo);
					// Atributos
					if (hijo.getAttributes() != null && hijo.getAttributes().getLength() > 0) {
						NamedNodeMap atributos = hijo.getAttributes();
						for (int j = 0; j < atributos.getLength(); j++) {
							Node attr = atributos.item(j);
							// Recorremos el atributo recursivamente
							loopNodeXml(attr);
						}
					}
					// si el nodo es un texto y no esta vacio
				} else if (hijo.getNodeType() == Node.TEXT_NODE && !hijo.getTextContent().trim().isEmpty()) {
					// Mostramos el contenido y añadimos linea a linea al fichero .txt 
					bw.write("Valor: " + hijo.getTextContent() + "\n");
					System.out.println("Valor: " + hijo.getTextContent());
				}
			}
			bw.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
			System.out.println("No se puede leer el fichero.");
		}
	}
}
