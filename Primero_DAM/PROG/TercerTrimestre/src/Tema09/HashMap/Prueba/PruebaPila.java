package Tema09.HashMap.Prueba;

import java.util.Stack;

public class PruebaPila {

	public static void main(String[] args) {

		Stack<String>pila = new Stack<String>();
		pila.push("Elemento1");
		pila.push("Elemento2");
		pila.push("Elemento3");
		pila.push("Elemento4");
		
		
		for(int i = 0; i < pila.size(); i++) {
			System.out.println(pila.get(i));
		}
		System.out.println();

		pila.push("Elemento5");
		
		for(int i = 0; i < pila.size(); i++) {
			System.out.println(pila.get(i));
		}
		
		System.out.println();
		System.out.println(pila.peek());
		
		pila.pop();
		
		System.out.println();
		System.out.println(pila.peek());
		
		System.out.println();
		System.out.println(pila.search("Elemento2"));
		System.out.println(pila.search("Elemento100"));
		
		
	}

}
