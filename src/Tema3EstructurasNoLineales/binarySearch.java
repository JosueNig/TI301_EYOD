/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3EstructurasNoLineales;

 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 
*objetivo:  Busqueda binaria con recursividad
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:19/11/2025
 */
public class binarySearch {
  
    /**
 * Returns true if the target value is found in the indicated portion of the data array.
 * This search only considers the array portion from data[low] to data[high] inclusive.
 */
    
public static boolean binarySearch(int[] data, int target, int low, int high) {
    if (low > high)
        return false;                       // interval empty; no match
    else {
        int mid = (low + high) / 2;
        if (target == data[mid])
            return true;                    // found a match
        else if (target < data[mid])
            return binarySearch(data, target, low, mid - 1);    // recur left of the middle
        else
            return binarySearch(data, target, mid + 1, high);   // recur right of the middle
    }
}
    public static void main(String[] args) {
        int[] data = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        boolean found1 = binarySearch(data, target, 0, 9);
        System.out.println("Buscando " + target + ": ¿Encontrado? " + found1 );
    }  
}

