package array;

import javax.swing.JOptionPane;

/**
 *
 * @author OxOrboy!
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese por favor el numero de valores que desea insertar en la tabla"));
        double [] numeros;
        numeros = new double[n];
        int suma=0;
        for (int i = 0; i < n; i++) {
            numeros[i] =Integer.parseInt(JOptionPane.showInputDialog("Ingrese los datos de la tabla: "));                      
            System.out.println("VALOR INGRESADO: "+numeros[i]);   
        suma += numeros[i];
        }
        JOptionPane.showMessageDialog(null, "La suma de los valores ingresados da un total de: " +suma);
    }
}
