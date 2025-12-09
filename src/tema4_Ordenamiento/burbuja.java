
package tema4_Ordenamiento;

import java.util.Random;

 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 4 Ordenamiento 
*objetivo: Implementar el algoritmo burbuja para ordenar n datos
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:09/12/2025
 */
public class burbuja {

    public void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;
                }
            }

            if (!intercambiado) {
                break;
            }
        }
    }
}