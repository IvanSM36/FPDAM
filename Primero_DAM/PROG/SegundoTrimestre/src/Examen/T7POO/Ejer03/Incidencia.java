package Examen.T7POO.Ejer03;

public class Incidencia {

// ATRIBUTOS
	// Atributos de la propia clase
	private static int codigo = 1;
	private static int pendientes = 0;
	// Atributos de cada objeto
	private int codigoBase;
	private int puesto;
	private String problema;
	private String estado;
	private String resolucion;

// CONSTRUCTORES

	public Incidencia(int puesto, String problema) {
		this.codigoBase = codigo;
		codigo++;
		this.puesto = puesto;
		this.problema = problema;
		this.estado = "Pendiente";
		pendientes++;
	}

// GETTERS Y SETTERS

	public static int getCodigo() {
		return codigo;
	}

	public static void setCodigo(int codigo) {
		Incidencia.codigo = codigo;
	}

	public static int getPendientes() {
		return pendientes;
	}

	public static void setPendientes(int pendientes) {
		Incidencia.pendientes = pendientes;
	}

	public int getCodigoBase() {
		return codigoBase;
	}

	public void setCodigoBase(int codigoBase) {
		this.codigoBase = codigoBase;
	}

	public int getPuesto() {
		return puesto;
	}

	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

// METODOS
	/**
	 * Metodo que cambia el estado de la clase y su resolución. Además reduce el num
	 * de tareas pendientes
	 * 
	 * @param resolucion
	 */
	public void resuelve(String resolucion) {
		setEstado("Resuelta");
		setResolucion(resolucion);
		setPendientes(getPendientes() - 1);
	}

	/**
	 * Metodo toString
	 */
	public String toString() {
		if (estado.equals("Pendiente")) {
			return "Incidencia " + codigoBase + " - Puesto: " + puesto + " - " + problema + " - " + estado;
		} else {
			return "Incidencia " + codigoBase + " - Puesto: " + puesto + " - " + problema + " - " + estado + " - "
					+ resolucion;
		}
	}

}
