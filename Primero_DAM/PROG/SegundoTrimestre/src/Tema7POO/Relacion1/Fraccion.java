/**
 * 
 */
package Tema7POO.Relacion1;

/**
 * @author IvanSM
 *
 */
public class Fraccion {

	/**
	 * atributos
	 */
	private int signo;
	private int numerador;
	private int denominador;

	// Constructor
	public Fraccion(int n, int d) {
		if (d == 0) {
			System.out.println("El denominador no puede ser 0");
		} else {
			if (n * d < 0) {
				this.signo = -1;
			} else {
				this.signo = 1;
			}
			this.numerador = Math.abs(n);
			this.denominador = Math.abs(d);
		}
	}

	// Getters and Setters
	public int getSigno() {
		return signo;
	}

	public void setSigno(int signo) {
		this.signo = signo;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	// Metodos
	public String toString() {
		if (signo == -1) {
			return "-" + this.numerador + "/" + this.denominador;
		} else {
			return this.numerador + "/" + this.denominador;
		}

	}

	public Fraccion invierte() {
		Fraccion nueva = new Fraccion (this.signo * this.denominador, this.numerador);
		return nueva;
		// o tambien sirve -> return new Fraccion (this.signo * this.denominador, this.numerador);
		
	}

	public Fraccion multiplica(int n) {
		return new Fraccion (this.signo * this.numerador * n, this.denominador);
	}

	public Fraccion multiplicaFrac(Fraccion f) {
		return new Fraccion (this.signo * this.numerador * f.getNumerador(), f.getSigno()* this.denominador * f.getNumerador());
	}
	
	public Fraccion divide(int n) {
		return new Fraccion (this.signo * this.numerador , this.denominador * n);
	}

	public Fraccion divideFrac(Fraccion f) {
		return new Fraccion (this.signo * this.numerador * f.getDenominador(), f.getSigno() * denominador * f.getDenominador() );
	}
	
	public Fraccion simplifica(Fraccion f) {
		
		int s = this.signo;
		int n = this.numerador;
		int d = this.denominador;
		
		for(int i = 2; i < Math.min(n , d); i++ ) {
			while(((n % i) == 0) && ((d % i) == 0)){
				n /= i;
				d /= i;
			}
		}	
		// Fraccion resultado = new Fraccion (s *n ,d);
		// return resultado;
		return new Fraccion (s * n, d);
	}

}
