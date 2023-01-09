package Tema10Ficheros.Practica01;

import java.io.BufferedWriter;
import java.io.File;
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


public class prueba {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document documento = builder.parse(new File("C:\\Users\\Ban\\Documents\\notepad++\\prog2.xml"));
			buclexml(documento.getDocumentElement());
		}catch (ParserConfigurationException ex) {
	        Logger.getLogger(prueba.class.getName()).log(Level.SEVERE, null, ex);
	    } catch (SAXException ex) {
	        Logger.getLogger(prueba.class.getName()).log(Level.SEVERE, null, ex);
	    } catch (IOException ex) {
	        Logger.getLogger(prueba.class.getName()).log(Level.SEVERE, null, ex);
	    }
	}


	public static void buclexml(Node n) {
		try{
		BufferedWriter bw=new BufferedWriter(new FileWriter ("C:\\Users\\Ban\\Documents\\notepad++\\pegarxml.xml",true));
		bw.write(""+n.getNodeName()+"\n");
		System.out.println(n.getNodeName());
		
		
		NodeList hijos = n.getChildNodes();
		for (int i=0;i<hijos.getLength();i++) {
			Node hijo = hijos.item(i);
			
			if(hijo.getNodeType() == Node.ELEMENT_NODE) {
				
				buclexml(hijo);
				
			if(hijo.getAttributes() != null && hijo.getAttributes().getLength() > 0) {
				NamedNodeMap atributos = hijo.getAttributes();
				for(int j =0;j<atributos.getLength();j++) {
					Node attr = atributos.item(j);
					buclexml(attr);
				}
			}
				
			} else if(hijo.getNodeType()==Node.TEXT_NODE && !hijo.getTextContent().trim().isEmpty()) {
				bw.write(""+"Valor: "+hijo.getTextContent()+"\n");
				System.out.println("Valor: "+hijo.getTextContent());
				
			}
				
			}
			bw.close();
		}catch(IOException e) {
			System.out.println("no se puede llegar al fichero");
		}

	}

}
