package Tema3EstructurasNoLineales.recursividad;
 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: Clase de testeo que revierte el orden de un arreglo
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:27/11/2025
 */
public class reverseArrayTest {
    public static void main(String[] args) {
        System.out.println("Nigoa Nieto Josue Trinidad");
    int [] array1 = {21,3,4,5,3};
    int [] array2 = {2,5,6};
    int [] array3 = {1,2,3,4,5,6};

        
        reverseArray.reverseArray(array1, 0, 4);
        reverseArray.reverseArray(array2, 0, 2);
        reverseArray.reverseArray(array3, 0, 5);
        reverseArray.print(array1);
        reverseArray.print(array2);
        reverseArray.print(array3);

    }
}
