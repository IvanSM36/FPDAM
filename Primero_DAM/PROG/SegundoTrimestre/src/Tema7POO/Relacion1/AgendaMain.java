/**
 * 
 */
package Tema7POO.Relacion1;
import java.util.Scanner;
/**
 * @author IvanSM
 *
 */
public class AgendaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("¿Que tamaño quieres que tenga la agenda?: ");
		int tamaño = scan.nextInt();		
		Agenda misContactos = new Agenda(tamaño); 
		Contactos c;
		String nombre = " ";
		int opcion = 0; // para salir del bucle
		
		do {
			System.out.println();
			System.out.println("Agenda de contactos.");
			System.out.println("┌───────────────────────────────────────┐");
			System.out.println("│ 1. Añadir Contacto.                   │");
			System.out.println("│ 2. Listar Contactos.                  │");
			System.out.println("│ 3. Buscar contacto.                   │");
			System.out.println("│ 4. Comprobar contacto existente.      │");
			System.out.println("│ 5. Eliminar contacto.                 │");
			System.out.println("│ 6. Contactos disponibles.             │");
			System.out.println("│ 7. Agenda llena.                      │");
			System.out.println("│ 0. Salir del programa.                │");
			System.out.println("└───────────────────────────────────────┘");
			System.out.println();
			
			System.out.print("Introduzca una opcion: ");
			opcion = scan.nextInt();
			switch (opcion) {
			case 1:
				System.out.print("Introduzca nombre: ");
				nombre = scan.next();
				System.out.print("Introduzca numero de telefono: ");
				int telefono = scan.nextInt();
				c  = new Contactos(nombre, telefono);
				misContactos.añadirContacto(c);
				break;
			case 2:		
				 misContactos.listarContactos();		
				break;
			case 3:			 
				//pido el nombre
                System.out.println("Escribe un nombre");
                nombre = scan.next();
                misContactos.buscarPorNombre(nombre);
				break;
			case 4:
				//pido el nombre
				System.out.println("Comprobar contacto existente.");
				System.out.print("Introduzca nombre: ");
				nombre = scan.next();
				//creo contacto auxiliar
				c = new Contactos(nombre);
				
				if(misContactos.existeContacto(c)) {
					System.out.println("Este contacto ya existe");
				}else {
					System.out.println("Este contacto no existe");
				}
				break;
			case 5:
				 //pido el nombre
                System.out.println("Escribe un nombre");
                nombre = scan.next();

                //Creo el contacto auxiliar
                c = new Contactos(nombre, 0);

                misContactos.eliminarContacto(c);
				break;
			case 6:
				 System.out.println("Hay " + misContactos.huecosLibre() + " contactos libre");
				break;
			case 7:
				 //como devuelve un booleano, lo meto en un if
                if (misContactos.agendaLlena()) {
                    System.out.println("La agenda esta llena");
                } else {
                    System.out.println("Aun puedes meter contactoss");
                }
				break;
		
			default:
				if (opcion == 0) {
					System.out.println("Fin del programa");
				}else {
					System.out.println("Error, introduce una opcion entre el 0-7");
				}
				break;
			}
		} while (opcion != 0);
	}

}
