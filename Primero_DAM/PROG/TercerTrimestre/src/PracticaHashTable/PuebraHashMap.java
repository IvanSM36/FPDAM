package PracticaHashTable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PuebraHashMap {

	public final static int THREAD_POOL_SIZE = 5;

	// Declaracion para HashTable
	public static Map<String, Integer> pruebaHashtable = null;
	// Declaracion para SynchronizedMap
	public static Map<String, Integer> pruebaSynchronizedMap = null;
	// Declaracion para ConcurrentHashMap
	public static Map<String, Integer> pruebaConcurrentHashMap = null;

	public static void main(String[] args) throws InterruptedException {

		// Prueba con objeto Hashtable
		pruebaHashtable = new Hashtable<String, Integer>();
		realizarTest(pruebaHashtable);

		// Prueba con objeto SynchronizedMap
		pruebaSynchronizedMap = Collections.synchronizedMap(new HashMap<String, Integer>());
		realizarTest(pruebaSynchronizedMap);

		// Prueba con ConcurrentHashMap 
		pruebaConcurrentHashMap = new ConcurrentHashMap<String, Integer>();
		realizarTest(pruebaConcurrentHashMap);

	}
	
	
	public static void realizarTest(final Map<String, Integer> hilos) throws InterruptedException {

		System.out.println("Inicio del test para: " + hilos.getClass());
		long averageTime = 0;
		for (int i = 0; i < 5; i++) {

			long startTime = System.nanoTime();
			ExecutorService ejecutar = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

			for (int j = 0; j < THREAD_POOL_SIZE; j++) {
				ejecutar.execute(new Runnable() {
					@SuppressWarnings("No utilizado")
					@Override
					public void run() {

						for (int i = 0; i < 500000; i++) {
							Integer randomNumber = (int) Math.ceil(Math.random() * 550000);

							// Recuperar valor. No lo estamos usando en ningún lado.
							Integer valor = hilos.get(String.valueOf(randomNumber));

							// Agrega el valor
							hilos.put(String.valueOf(randomNumber), randomNumber);
						}
					}
				});
			}

			// Hace que el ejecutor se detenga
			ejecutar.shutdown();

			//  Bloquea hasta que todas las tareas hayan completado la ejecución después de una solicitud de apagado
			ejecutar.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);

			long entTime = System.nanoTime();
			long totalTime = (entTime - startTime) / 1000000L;
			averageTime += totalTime;
			System.out.println("500K ingresada agregada/recuperada en " + totalTime + " ms");
		}
		System.out.println("Para " + hilos.getClass() + " el tiempo medio es: " + averageTime / 5 + " ms\n");
	}

}
