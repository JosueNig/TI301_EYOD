package Tema3EstructurasNoLineales.recursividad;

/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: Sumar todos los elementos de un arreglo de forma 
binaria.
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:27/11/2025
 */
public class binarySumTest {
    public static void main(String[] args) {
        int [] array1 = {12 ,25,23,33,55,78};
        int [] array2 = {1,2,3,4,5};
        int [] array3 = {6,7,8,9,3,2};
        
        System.out.println( binarySum.BinarySum(array1, 0, 5));
        System.out.println( binarySum.BinarySum(array2, 0, 4));
        System.out.println( binarySum.BinarySum(array3, 0, 5));

    }
}
