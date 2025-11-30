package Tema3EstructurasNoLineales;

 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: Medir el tiempo de ejecucion
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:26/11/2025
 */
public class timeEjecution {
    public static void main(String[] args) {
        System.out.println("Nigoa  Nieto Josue Trinidad");
        long inicio =  System.nanoTime();
      int  suma = 0;
        for (int i = 0; i < 10000000; i++) {
             suma =+ i;
        }
        long fin = System.nanoTime();
        long duracionN = fin - inicio;
        double duracionS = duracionN / 1000000000.0;
        System.out.println("Duracion en nanosegundos : " + duracionN);
        System.out.println("Duracion en segundos : " + duracionS);

    }
}
