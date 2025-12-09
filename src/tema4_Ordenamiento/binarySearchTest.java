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
public class binarySearchTest {

    public static void main(String[] args) {

        int cantidadDatos = 1000000;
        int[] datos = new int[cantidadDatos];
        System.out.println("Generando " + cantidadDatos + " números aleatorios...");
        generarDatosAleatorios(datos);
        quickSort algoritmo2 = new quickSort();
        algoritmo2.ordenarQuickSort(datos);

        long inicio4 = System.currentTimeMillis();

        int resultado2 = binarySearch.binaryS(datos, 53);

        long fin4 = System.currentTimeMillis();

        System.out.println("Tiempo total: " + (fin4 - inicio4) / 1000.0 + " segundos.");
        System.out.println("posicion del target (53) " + resultado2);
    }

    private static void generarDatosAleatorios(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000000);
            arr[200] = 53;
        }
    }
}
