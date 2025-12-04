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
public class Test {
    public static void main(String[] args) {

        // CONFIGURACIÓN:
        // 100,000 datos tardarán unos 15 a 30 segundos.
        // NO pongas 1,000,000 o tu PC se congelará por horas.
        int cantidadDatos = 1;
        String a="Nigoa Nieto Josue Trinidad";
        System.out.println(a.hashCode());
        
        int[] datos = new int[cantidadDatos];

        // Instanciamos la propia clase para usar su método no estático
        burbuja algoritmo = new burbuja();
        quickSort algoritmo2 = new quickSort();
        
        // Generar datos
        System.out.println("Generando " + cantidadDatos + " números aleatorios...");
        generarDatosAleatorios(datos);
/*
        // Ejecutar y medir
        System.out.println("Iniciando ordenamiento Burbuja (Esto puede tardar un poco)...");
        long inicio = System.currentTimeMillis();

        algoritmo.ordenarBurbuja(datos); // Llamada al método del algoritmo

        long fin = System.currentTimeMillis();

        System.out.println("¡Ordenamiento finalizado!");
        System.out.println("Tiempo total: " + (fin - inicio) / 1000.0 + " segundos.");
    */
        System.out.println("quicksort");
    System.out.println("Iniciando ordenamiento Burbuja (Esto puede tardar un poco)...");
        long inicio2 = System.currentTimeMillis();

        algoritmo2.ordenarQuickSort(datos); // Llamada al método del algoritmo

        long fin2 = System.currentTimeMillis();

        System.out.println("¡Ordenamiento finalizado!");
        System.out.println("Tiempo total: " + (fin2 - inicio2) / 1000.0 + " segundos.");
    }

    // --- 3. MÉTODO AUXILIAR (STATIC) ---
    private static void generarDatosAleatorios(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            // Genera números entre 0 y 999,999 (para que sean positivos)
            arr[i] = rand.nextInt(100000000); 
        }
    }
}

