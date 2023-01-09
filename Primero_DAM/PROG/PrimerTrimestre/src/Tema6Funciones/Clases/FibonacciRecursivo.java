/**
 * 
 */
package Tema6Funciones.Clases;

/**
 * @author IvanSM
 *
 */
public class FibonacciRecursivo {
	
	/**
     * Devuelve el numero fibonacci dado su posicion
     *
     * @param n Posicion del numero fibonacci
     * @return Numero de la lista de fibonacci
     */
    public static int fibonacciRecursivo(int n) {
 
        //CASO BASE, si es cero devuelve un cero
        //Puedes poner n<=0 tamvien para incluir negativos
        if (n == 0) {
            return 0;
            //CASO BASE, si es 1 devuelve un 1    
        } else if (n == 1) {
            return 1;
        } else {
            //Hago la suma
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
        }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int serie = 10, num1 = 0, num2 = 1, suma = 1;		 
        // Muestro el valor inicial
        System.out.print(num1 + " ");
         
        for (int i = 1; i < serie; i++) {
             
            // muestro la suma
            System.out.print(suma + " ");
             
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;           
        }
        System.out.println();
        System.out.println(fibonacciRecursivo(serie) + " ");
		
	}

}
