package tema4_Ordenamiento;

 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 4 Ordenamiento 
*objetivo: Implementar el algoritmo BinarySearch encontrar un target en n datos 
en un arreglo
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:09/12/2025
 */
public class binarySearch {
    public static int binaryS(int []datos , int target){
int inicio = 0;
int fin = datos.length - 1;
    while (inicio <= fin){
        int medio = inicio + (fin - inicio) / 2;

            if (datos[medio] == target) {
                return medio; 
            }

            if (datos[medio] < target) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1; 
    }
}
    
        
    

