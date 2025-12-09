/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4_Ordenamiento;

 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 4 Ordenamiento 
*objetivo: Implementar un algoritmo para buscar un target en n datos de un arreglo
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:09/12/2025
 */
public class busquedaLineal {

    public static int busquedaLineal(int[] datos, int target) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
