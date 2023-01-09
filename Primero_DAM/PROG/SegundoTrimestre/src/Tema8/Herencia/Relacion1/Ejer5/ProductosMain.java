/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer5;

/**
 * @author IvanSM
 *
 */
public class ProductosMain {

	/**
	 * Metodos @param args
	 */
	public static void main(String[] args) {
		Productos[] productos = new Productos[6];
        productos[0] = new Perecedero("Capsu", 20, 3);
        productos[1] = new NoPerecedero("Paleta", 12, "Dulce rojo");
        productos[2] = new Perecedero("Dulce 2", 28, 2);
        productos[3] = new NoPerecedero("Churrumais", 12, "Palitos de maiz");
        productos[4] = new Perecedero("Galletitas", 29, 1);
        productos[5] = new NoPerecedero("Marias", 36, "Galletas marias");
        
        //Recorro el array para calcular precio
        double total = 0;
        for(int i = 0; i < productos.length; i++){
            total += productos[i].calcular(3);
        }
        
        System.out.println(total);
	}

}
