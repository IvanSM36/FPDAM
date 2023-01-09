package Tema9.ArrayList.Relacion1Ejer09;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Edificio> lista = new ArrayList<Edificio>();
		
        Oficinas of1 = new Oficinas(4,500);
        Oficinas of2 = new Oficinas(2,300);
        Oficinas of3 = new Oficinas(6,1000);
        
        Polideportivo pd1 = new Polideportivo(1,1000,"Polideportivo BCN");
        Polideportivo pd2 = new Polideportivo(1,2000,"Polideportivo MAD");
        
        lista.add(of1);
        lista.add(of2);
        lista.add(of3);
        lista.add(pd1);
        lista.add(pd2);
        
        Iterator<Edificio> it = lista.iterator();
        while(it.hasNext()){
        System.out.println(it.next().toString());
        }
	}

}
