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
public class burbujaTest {

    public static void main(String[] args) {

        int cantidadDatos = 1000000;
        int[] datos = new int[cantidadDatos];

        burbuja algoritmo = new burbuja();

        System.out.println("Generando " + cantidadDatos + " números aleatorios...");
        generarDatosAleatorios(datos);

        System.out.println("Iniciando ordenamiento Burbuja (Esto puede tardar un poco)...");
        long inicio = System.currentTimeMillis();

        algoritmo.ordenarBurbuja(datos);

        long fin = System.currentTimeMillis();

        System.out.println("¡Ordenamiento finalizado!");
        System.out.println("Tiempo total: " + (fin - inicio) / 1000.0 + " segundos.");     
    }

    private static void generarDatosAleatorios(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000000);
            arr[200]=53;
        }
    }
}