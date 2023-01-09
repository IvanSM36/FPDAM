/**
 * 
 */
package Tema7POO.Relacion2;

/**
 * @author IvanSM
 *
 */
public class MisCafeteras {

	/**
	 * 
	 */
	private MisCafeteras[] cafetera;
	
	///// Constructores /////
	public MisCafeteras() {
		this.cafetera = new MisCafeteras[5];
	}

	///// Getters and Setters /////
	public MisCafeteras[] getCafetera() {
		return cafetera;
	}

	public void setCafetera(MisCafeteras[] cafetera) {
		this.cafetera = cafetera;
	}

	///// Metodos /////	
	public void llenarMisCafeteras() {
		for(int i = 0; i < cafetera.length; i++) {
			cafetera[i].llenarMisCafeteras();
		}
	}
}
