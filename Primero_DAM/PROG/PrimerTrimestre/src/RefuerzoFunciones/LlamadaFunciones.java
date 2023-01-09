/**
 * 
 */
package RefuerzoFunciones;

/**
 * @author IvanSM
 *
 */
public class LlamadaFunciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean salir = false;
		do {
			switch (Funciones.menu()) {
			case 1:
				Funciones.rellenarArray();
				break;
			case 2:
				Funciones.rellenarArrayRandom();
				break;
			case 3:
				Funciones.borrarArray();
				break;
			case 4:
				switch (Funciones.introduceBorrar()) {
				case 1:
					Funciones.borrarElemento();
					break;
				case 2:
					Funciones.introducirElemento();
					break;
				default:
					break;
				}
				break;
			case 5:
				Funciones.listarContenido();
				break;
			case 6:
				Funciones.listarPrimos();
				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;
			default:
				salir = true;
				System.out.println("Fin del programa");
				break;
			}
		} while (!salir);

	}
}
