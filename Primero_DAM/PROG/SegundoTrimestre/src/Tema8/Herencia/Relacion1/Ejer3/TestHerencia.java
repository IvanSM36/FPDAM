/**
 * 
 */
package Tema8.Herencia.Relacion1.Ejer3;

/**
 * @author IvanSM
 *
 */
public class TestHerencia {

	/**
	 * Metodos @param args
	 */
	public static void main(String[] args) {
		ProductoCongelado nuggets = new ProductoCongelado("16-10-2016","L1603004");
        ProductoFresco lechuga = new ProductoFresco("20-10-2016","L1610005");
        ProductoRefrigerado jugo = new ProductoRefrigerado("25-10-2016","L1609006");
        System.out.println("Sin datos. \nProducto Congelado: ");
        System.out.println("Fecha de caducidad: " + nuggets.getFechaCaducidad() + "\nNumero de Lote: " + nuggets.getNumeroLote()
                           + "\nTemperatura Recomendada: " + nuggets.getTemperaturaRecomendada() + "C°");
        System.out.println();
        System.out.println("Producto Fresco: ");
        System.out.println("Fecha de caducidad: " + lechuga.getFechaCaducidad() + "\nNumero de Lote: " + lechuga.getNumeroLote()
                           + "\nFecha de envasado: " + lechuga.getFechaEnvasado() + "\nPais de Origen: " + lechuga.getPaisDeOrigen());
        System.out.println();
        System.out.println("Producto Refrigerado: ");
        System.out.println("Fecha de caducidad: " + jugo.getFechaCaducidad() + "\nNumero de Lote: " + jugo.getNumeroLote()
                           + "\nCodigo de supervision alimentaria: " + jugo.getCodigoSupervisionAlimentaria());
        nuggets.setTemperaturaRecomendada(-18);
        lechuga.setFechaEnvasado("03-10-2015");
        lechuga.setPaisDeOrigen("Panamá");
        jugo.setCodigoSupervisionAlimentaria("B#6745");
        System.out.println();
        System.out.println("Con datos. \nProducto Congelado: ");
        System.out.println("Fecha de caducidad: " + nuggets.getFechaCaducidad() + "\nNumero de Lote: " + nuggets.getNumeroLote()
                           + "\nTemperatura Recomendada: " + nuggets.getTemperaturaRecomendada() + "C°");
        System.out.println();
        System.out.println("Producto Fresco: ");
        System.out.println("Fecha de caducidad: " + lechuga.getFechaCaducidad() + "\nNumero de Lote: " + lechuga.getNumeroLote()
                           + "\nFecha de envasado: " + lechuga.getFechaEnvasado() + "\nPais de Origen: " + lechuga.getPaisDeOrigen());
        System.out.println();
        System.out.println("Producto Refrigerado: ");
        System.out.println("Fecha de caducidad: " + jugo.getFechaCaducidad() + "\nNumero de Lote: " + jugo.getNumeroLote()
                           + "\nCodigo de supervision alimentaria: " + jugo.getCodigoSupervisionAlimentaria());
	}

}
