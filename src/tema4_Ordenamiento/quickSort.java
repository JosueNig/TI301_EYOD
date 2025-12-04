/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4_Ordenamiento;

import java.util.Random;

/**
 *
 * @author josue
 */
public class quickSort {

    // --- 1. MÉTODOS DEL ALGORITMO QUICKSORT ---
    
    // Método público que llama el usuario (Solo recibe el arreglo)
    public void ordenarQuickSort(int[] arreglo) {
        // Llamamos al método recursivo con los límites iniciales
        quickSortRecursivo(arreglo, 0, arreglo.length - 1);
    }

    // Método recursivo (Divide y vencerás)
    private void quickSortRecursivo(int[] arr, int bajo, int alto) {
        if (bajo < alto) {
            // Encontrar el índice de partición
            int pi = particion(arr, bajo, alto);

            // Ordenar recursivamente los elementos antes y después de la partición
            quickSortRecursivo(arr, bajo, pi - 1);
            quickSortRecursivo(arr, pi + 1, alto);
        }
    }

    // Método para encontrar la posición del pivote
    private int particion(int[] arr, int bajo, int alto) {
        int pivote = arr[alto]; // Tomamos el último elemento como pivote
        int i = (bajo - 1); // Índice del elemento más pequeño

        for (int j = bajo; j < alto; j++) {
            // Si el elemento actual es menor que el pivote
            if (arr[j] < pivote) {
                i++;
                // Intercambio (Swap)
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambiar el pivote a su posición correcta
        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1;
    }
}
