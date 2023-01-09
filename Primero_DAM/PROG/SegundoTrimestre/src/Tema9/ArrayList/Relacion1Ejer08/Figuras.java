package Tema9.ArrayList.Relacion1Ejer08;
import java.util.LinkedList;

public class Figuras {

    // No hay restricción si utilizamos colecciones (ver unidad 9)
    private LinkedList<Figura> lista = new LinkedList<>();
    
    public void annade(Figura f) {
        lista.add(f);
    }
    
    public void borra() {
        lista.removeLast();
    }
    
    public boolean annade(Figura f, int pos) {
        try {
            lista.add(pos, f);
        }
        catch(Exception e) {
            return false;
        }
        return true;
    }
    
    public void borra(int pos) {
        // Si se intenta borrar una que no existe que no haga nada
        try {
            lista.remove(pos);
        } catch(Exception e) {}
    }
    
    public void lista() {
        for(Figura f: lista) {
            System.out.println("Figura: "+f);
            if(f instanceof Lados) {
                Lados l = (Lados)f;
                System.out.println("\tNum lados: "+l.numLados());
            }
        }
    }

	@Override
	public String toString() {
		return "Figuras [lista=" + lista + "]";
	}
    
    
}