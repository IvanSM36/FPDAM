package Tema10Ficheros.Practica01;

import java.io.File;
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

public class ParteA {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();

			Document documento = builder.parse(new File("xml/Concesionario.xml"));

			loopNodeXml(documento.getDocumentElement());

		} catch (ParserConfigurationException pcex) {
			Logger.getLogger(ParteA.class.getName()).log(Level.SEVERE, null, pcex);
		} catch (SAXException saxex) {
			Logger.getLogger(ParteA.class.getName()).log(Level.SEVERE, null, saxex);
		} catch (IOException ioex) {
			Logger.getLogger(ParteA.class.getName()).log(Level.SEVERE, null, ioex);
		}

	}

	public static void loopNodeXml(Node n) {

		// Mostramos el nombre del nodo
		System.out.println(n.getNodeName());

		// Obtenemos sus hijos
		NodeList hijos = n.getChildNodes();
		for (int i = 0; i < hijos.getLength(); i++) {
			// Obtenemos el hijo i
			Node hijo = hijos.item(i);

			// Si es un nodo
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
				// Mostramos el contenido
				System.out.println("Valor: " + hijo.getTextContent());
			}

		}
	}

}
