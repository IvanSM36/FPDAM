package Tema8.Herencia.Relacion2.Ejer01;

public class CuentaAhorros extends Cuenta {

	// Atributos
	protected boolean activa ;

	// Constructores
	public CuentaAhorros() {

	}

	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		if(saldo < 10000) { //Si el saldo es menor de 10000, la cuenta no se activa
			activa = false;
		} else {
			activa = true;
		}
	}

	// Getters and Setters
	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	// Metodos

	public void retirar(float cantidad) {
		if(activa) { //Si la cuenta esta activa, puede retirar dinero
			super.retirar(cantidad); // invoca el metodo de la clase padre.
		}
	}

	public void consignar(float consignar) {
		if(activa) { //Si la cuenta esta activa, puede retirar dinero
			super.consignar(consignar); // invoca el metodo de la clase padre.
		}
	}

	public void extractoMensual() {
		if(numeroRetiros > 4) {
			comisionMensual += (numeroRetiros - 4) * 1000;
		}
		super.extractoMensual();
		
		if(saldo < 10000) {
			activa = false;
		}
	}
	
	public void imprimir() {
		System.out.println("Cuenta de Ahorros)");
		System.out.println("------------------");
		System.out.println("Saldo disponible: " + saldo);
		System.out.println("Comision mensual: " + comisionMensual);
		System.out.println("Numero de transacciones: " + (numeroConsignaciones + numeroRetiros));
		System.out.println();
	}
}
