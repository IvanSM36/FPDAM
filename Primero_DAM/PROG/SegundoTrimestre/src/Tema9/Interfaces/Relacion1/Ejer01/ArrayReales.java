package Tema9.Interfaces.Relacion1.Ejer01;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayReales implements Estadisticas {

	// Atributos
	double[] array;

	// Constructores
	public ArrayReales() {
		this.array = new double[5];
	}

	public ArrayReales(int tamanio) {
		this.array = new double[tamanio];
	}

	// Getters and Setters
	public double[] getArray() {
		return array;
	}

	public void setArray(double[] array) {
		this.array = array;
	}

	
	//Metodo que rellena el array con numeros aleatorios
	public void numRandom() {
		for (int i = 0; i < array.length; i++) {
			array[i] = (double)(Math.random() * 10 + 1);
		}
	}

	@Override
	public double minimo() {
		double minimo = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}

	@Override
	public double maximo() {
		double maximo = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximo) {
				maximo = array[i];
			}
		}
		return maximo;
	}

	@Override
	public double sumatorio() {
		double sumatorio = 0;
		for (int i = 0; i < array.length; i++) {
			sumatorio += array[i];
		}
		return sumatorio;
	}

	@Override
	public String toString() {
		return "ArrayReales [array=" + Arrays.toString(array) + "]";
	}

}
