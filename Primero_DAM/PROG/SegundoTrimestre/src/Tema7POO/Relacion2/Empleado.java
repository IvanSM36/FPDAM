/**
 * 
 */
package Tema7POO.Relacion2;

/**
 * @author IvanSM
 *
 */
public class Empleado {

	/**
	 * 
	 */
	private String dni;
	private double sueldoBase;
	private double pagoHorasEx;
	private int horasExtras;
	private double irpf;
	private boolean casado;
	private int numHijos;
	
	//Constructores
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(String dni, double sueldoBase, double pagoHorasEx, int horasExtras, double irpf, boolean casado,
			int numHijos) {
		super();
		this.dni = dni;
		this.sueldoBase = sueldoBase;
		this.pagoHorasEx = pagoHorasEx;
		this.horasExtras = horasExtras;
		this.irpf = irpf;
		this.casado = casado;
		this.numHijos = numHijos;
	}
	
	//Getter and Setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public double getPagoHorasEx() {
		return pagoHorasEx;
	}

	public void setPagoHorasEx(double pagoHorasEx) {
		this.pagoHorasEx = pagoHorasEx;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public boolean getCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	//Metodos 

	public double calculoHorasEx (Empleado e) {
		double horasEx = e.getHorasExtras() * e.getPagoHorasEx();
		return horasEx;
	}
	
	public double calculoSueldoBruto(Empleado e) {
		double sb = e.getSueldoBase() + e.calculoHorasEx(e);
		return sb;
	}
	
	public double calculoDevIrpf(Empleado e) {
		double irpfFinal = 0;
		double tieneHijo = 0;
		double sueldoBrutoFin;
		
		if(e.getCasado() == true) {
			irpfFinal = e.getIrpf() - 2 - e.getNumHijos();
		} else {
			irpfFinal = e.getIrpf() - e.getNumHijos();
		}
		
	
		
		sueldoBrutoFin = calculoSueldoBruto(e) * (irpfFinal / 100);
		return sueldoBrutoFin;
	}
	
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", sueldoBase=" + sueldoBase + ", pagoHorasEx=" + pagoHorasEx + ", horasExtras="
				+ horasExtras + ", irpf=" + irpf + ", casado=" + casado + ", numHijos=" + numHijos + "]";
	}

	
	
}
