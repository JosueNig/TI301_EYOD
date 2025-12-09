package tema4_Ordenamiento;

import java.util.Random;

/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 4 Ordenamiento 
*objetivo: Clase de testeo
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:09/12/2025
 */
public class quickSortTest {

    public static void main(String[] args) {
        int cantidadDatos = 1000000;
        int[] datos = new int[cantidadDatos];
        System.out.println("Generando " + cantidadDatos + " números aleatorios...");
        generarDatosAleatorios(datos);
        quickSort algoritmo2 = new quickSort();
        System.out.println("quicksort");
        System.out.println("Iniciando ordenamiento QuickSort...");
        long inicio2 = System.currentTimeMillis();
        algoritmo2.ordenarQuickSort(datos);
        long fin2 = System.currentTimeMillis();
        System.out.println("Tiempo : " + (fin2 - inicio2) / 1000.0 + " segundos.");
    }

    private static void generarDatosAleatorios(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000000);
            arr[200] = 53;
        }
    }
}
