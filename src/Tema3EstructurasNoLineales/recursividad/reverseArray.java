package Tema3EstructurasNoLineales.recursividad;

 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: cambiar el orden de un arreglo usando la recursividad
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:27/11/2025
 */
public class reverseArray {


public static void reverseArray (int [] data , int low , int high){
    if (low < high){
        int temp = data[low];
        data[low] = data[high];
        data[high] = temp;
        reverseArray(data , low + 1, high -1);
        
    }
}
 public static void  print(int [] data){
    for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }   
     System.out.println(" ");
    }   
}
