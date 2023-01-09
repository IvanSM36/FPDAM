package Tema8.Herencia.Relacion2.Ejer01;

public class CuentaCorriente extends Cuenta{
	
	//Atributos
	protected float sobregiro;
	
	//Constructores
	public CuentaCorriente() {

	}

	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		this.sobregiro = 0;
	}

	//Getters and Setters
	public float getSobregiro() {
		return sobregiro;
	}

	public void setSobregiro(float sobregiro) {
		this.sobregiro = sobregiro;
	}

	//Metodos
	public void retirar(float cantidad) {
		if(cantidad > saldo) {
			sobregiro = cantidad - saldo;
			saldo = 0;
		} else {
			super.retirar(cantidad);
		}
	}

	public void consignar(float consignar) {
		float residuo = sobregiro - consignar;
		// Si existe sobregiro la cantidad consignada se resta al sobregiro
		if(sobregiro > 0) { //Si el residuo es mayor que cero, se libera el sobregiro
			if (residuo > 0) {
				sobregiro = 0;
				saldo = residuo;
			}else { //Si el residuo es menor que cero, el saldo es cero y surge un sobregiro 
				sobregiro = -residuo;
				saldo = 0;
			}
		}else {
			super.consignar(consignar); //Si no hay sobregiro, se realiza una consignación normal
		}
	}

	public void extractoMensual() {
		super.extractoMensual(); //Invoca al metodo de la clase padre
	}
	
	public void imprimir() {
		System.out.println("Cuenta corriente");
		System.out.println("----------------");
		System.out.println("Saldo: " + saldo);
		System.out.println("Cargo mensual: " + comisionMensual);
		System.out.println("Numero de transacciones: " + (numeroConsignaciones+ numeroRetiros));
		System.out.println("Valor de sobregiro: " + sobregiro );
		System.out.println();
	}
	
}
