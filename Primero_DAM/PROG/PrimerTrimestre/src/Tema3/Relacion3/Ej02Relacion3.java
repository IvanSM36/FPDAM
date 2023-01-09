/**
 * 
 */
package Tema3.Relacion3;

/**
 * @author IvanSM
 *
 */
public class Ej02Relacion3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int hombres = 22;
		int mujeres = 3;
		int grupo = hombres + mujeres;
		int grupoH = ((hombres *100) / grupo) ;
		int grupoM = (mujeres *100) / grupo;
		System.out.println(grupoH + "% son hombres.");
		System.out.println(grupoM + "% son mujeres.");
	}

}
