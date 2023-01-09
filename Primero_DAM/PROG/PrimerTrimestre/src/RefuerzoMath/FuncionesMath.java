package RefuerzoMath;

public class FuncionesMath {
	
	/* Recoge el resultado de un numero random entre 1 y 6
	 * @param
	 * @return
	 */
	public static int aleatorio (int x) {
		int tirada = (int)(Math.random()*((1-x)+1)+x);		
		return tirada;
	}
	
	/* Recoge un numero random entre 1 y 4
	 * @param
	 * @return
	 */
	public static String recogePalo() {
		int random = aleatorio(5); 
		String palo = ""; 
		 switch (random) {
			case 1:
				palo = "Picas";
				break;
			case 2:
				palo = "Corazones";
				break;
			case 3:
				palo = "Diamantes";
				break;
			case 4:
				palo = "Tréboles";
				break;
			
			}		
		return palo;
	}
	/* Recoge un numero random entre 1 y 10
	 * @param
	 * @return
	 */
	public static int recogeNumero() {
		 int random = aleatorio(13);
		 String numeroCarta = "";
		 if(random < 1 && random < 11) {
			 
		 }
		 
		return random;
	}
	/*  
	 * @param
	 * @return
	 */
	public static String dameCarta() {	
		String carta = String.valueOf(recogeNumero()); 
		carta += " de ";
		carta += recogePalo();
		return carta;
	}
	
}
