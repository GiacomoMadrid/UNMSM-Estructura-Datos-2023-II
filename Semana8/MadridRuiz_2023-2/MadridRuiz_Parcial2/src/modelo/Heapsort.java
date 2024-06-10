
package modelo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author usuario
 */
public class Heapsort {
    private int indice;
    private int[] arreglo;
    
    public Heapsort(int indice){
        this.indice = indice;
        this.arreglo = new int[indice];
    }
    
    public void sortRandom(JTextArea salida, JTextArea entrada){
        try{
            setRandoms(arreglo);
            salida.setText("");
            entrada.setText("");

            for (int i : arreglo) {
                entrada.append(i + " ");
            }            

            heapSort(arreglo);
            for (int i : arreglo) {
                salida.append(i + " ");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ingrese Datos válidos en cada apartado.");
        }
    }
    
    public void heapsort(JTextArea salida, JTextArea entrada){
        try{
            salida.setText("");
            entrada.setText("");

            for(int i=1; i<indice+1; i++){
                String dato = JOptionPane.showInputDialog("Dato #"+i);
                arreglo[i-1] = Integer.parseInt(dato);
            }

            for (int i : arreglo) {
                entrada.append(i + " ");
            }            

            heapSort(arreglo);
            for (int i : arreglo) {
                salida.append(i + " ");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Ingrese Datos válidos en cada apartado.");
        }
    }
    
    public void setRandoms(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
    }
    public void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2*i + 1; 
        int right = 2*i + 2; 

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest); 
        }

    }
}
