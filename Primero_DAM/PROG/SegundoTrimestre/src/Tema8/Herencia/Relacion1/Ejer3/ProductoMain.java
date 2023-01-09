/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer3;

/**
 * @author IvanSM
 *
 */
public class ProductoMain {

	/**
	 * Metodos @param args
	 */
	public static void main(String[] args) {
		//Creo los objetos
	//	Productos produc = new Productos("20-06-2021", 65874, "informacion especial");
		ProductoFresco pescado = new ProductoFresco("20-05-2021", "España", "20-06-2021","56846" );
		ProductoRefrigerado carne = new ProductoRefrigerado( "B58745", "20-05-2022",  "56985");
		ProductoCongelado gambas = new ProductoCongelado(-10, "20-05-22", "8562");
		
		System.out.println(pescado);
		System.out.println();
		System.out.println(carne);
		System.out.println();
		System.out.println(gambas);
	}

}
