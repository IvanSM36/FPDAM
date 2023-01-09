package Tema9.ArrayList.Relacion1Ejer08;

public class Cuadrado extends Figura implements Lados{

    private double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public int numLados() {
        return 4;
    }

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
    
    
}
