
package tema4_Ordenamiento;

import java.util.Random;

 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 4 Ordenamiento 
*objetivo: Implementar el algoritmo QuickSort para ordenar n datos
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:09/12/2025
 */
public class quickSort {

    
    public void ordenarQuickSort(int[] arreglo) {
        quickSortRecursivo(arreglo, 0, arreglo.length - 1);
    }

    private void quickSortRecursivo(int[] arr, int bajo, int alto) {
        if (bajo < alto) {
            int pi = particion(arr, bajo, alto);

            quickSortRecursivo(arr, bajo, pi - 1);
            quickSortRecursivo(arr, pi + 1, alto);
        }
    }

    private int particion(int[] arr, int bajo, int alto) {
        int pivote = arr[alto]; 
        int i = (bajo - 1); 

        for (int j = bajo; j < alto; j++) {
            if (arr[j] < pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1;
    }
}
