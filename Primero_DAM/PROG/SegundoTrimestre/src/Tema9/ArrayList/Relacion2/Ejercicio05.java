package Tema9.ArrayList.Relacion2;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio05 {

	public static void main(String[] args) {
	ArrayList listDias = new ArrayList();
	
	listDias.add("Lunes");
	listDias.add("Martes");
	listDias.add("Miercoles");
	listDias.add("Jueves");
	listDias.add("Viernes");
	listDias.add("Sabado");
	listDias.add("Domingo");

	listDias.add(4,"Juernes");

	ArrayList listaDos = new ArrayList(listDias);

	listDias.addAll(listaDos);
	System.out.println(listDias.get(3)+", "+listDias.get(4));
	System.out.println(listDias.get(0)+", "+listDias.get(listDias.size()-1));

	System.out.println(listDias);
	listDias.remove("Juernes");

	if(listDias.remove("Juernes")){
	System.out.println("Borrado");
	}else{
	System.out.println("No existe");
	}

	Iterator it = listDias.iterator();
	while(it.hasNext()){
	System.out.println(it.next());
	}

	if (listDias.contains("Lunes")){
	System.out.println("Si existe Lunes");
	}

	Iterator it2 = listDias.iterator();
	while(it2.hasNext()){
	if(((String) it2.next()).toUpperCase()=="LUNES"){
	System.out.println("Si existe");
	}
	}

	Collections.sort(listDias);
	System.out.println(listDias);

	listDias.clear();
	System.out.println(listDias);

	}

}
