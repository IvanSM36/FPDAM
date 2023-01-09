/**
 * 
 */
package Tema3.Relacion3;

/**
 * @author IvanSM
 *
 */
public class Ej03Relacion3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int ginecologia = 40;
		int traumatologia = 30;
		int pediatria = 30;
		int presupuesto = 120000;
		
		int presuGine = (ginecologia * presupuesto)/100;
		int presuTrauma = (traumatologia * presupuesto)/100;
		int presuPedia = (pediatria * presupuesto) /100;
		
		System.out.println("El area de Ginecología recibe: " + presuGine + "€");
		System.out.println("El area de Pedratría recibe: " + presuPedia + "€");
		System.out.println("El area de Traumatología recibe: " + presuTrauma + "€");
	}

}
