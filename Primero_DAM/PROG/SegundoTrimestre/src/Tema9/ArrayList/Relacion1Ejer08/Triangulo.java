package Tema9.ArrayList.Relacion1Ejer08;

public class Triangulo extends Figura implements Lados {
    
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return (base*altura)/2;
    }

    @Override
    public int numLados() {
        return 3;
    }

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
    
       
}
