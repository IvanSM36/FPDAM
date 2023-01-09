/**
 * 
 */
package Tema8.Herencia.Prueba;

/**
 * @author IvanSM
 *
 */
public class VehiculoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vehiculo2 miVehiculo = new Vehiculo2(4, 80, "ssss");
		Coche2 miCoche = new Coche2(4, 90, "sesa", 5);
		Moto miMoto = new Moto(2, 80, "asdf", "KTM");
		
		System.out.println("Mis Vehiculos");
		System.out.println("----------");
		System.out.println(miVehiculo);
		System.out.println();
		System.out.println("Mis coches");
		System.out.println("----------");
		System.out.println(miCoche);
		System.out.println();
		System.out.println("Mis motos");
		System.out.println("----------");
		System.out.println(miMoto);
		
		Vehiculo2 miKtm = (Vehiculo2)miMoto;
		System.out.println();
		System.out.println("Cambio miMoto a miKtm");
		System.out.println("Matricula: "+ miMoto.getMatricula());
		
		
		/*Vehiculo miVehiculo = new Vehiculo(120000, 5935);
		Coche miCoche = new Coche(140000, 5687);
		Taxi miTaxi = new Taxi(130000, 5624, "123654");
		
		System.out.println("Datos del coche ");
		System.out.println("----------------");
		miCoche.mostrarDatos();
		System.out.println();
		System.out.println("Voy a arrancar el coche.");
		miCoche.arrancar();
		System.out.println();
		
		System.out.println("Vehiculo");
		System.out.println("--------");
		miVehiculo.arrancar();
		
		System.out.println();
		System.out.println("Taxis");
		System.out.println("-----");
		miTaxi.imprimirDatos();*/
		
	}	

}
