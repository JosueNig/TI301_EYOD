package Tema3EstructurasNoLineales.recursividad;
/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: Sumar todos los elementos de un arreglo de forma 
binaria.Donde se parta ala mitad y se sumen los elementos de cada lado
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:27/11/2025
 */
public class binarySum {
    
    public static int BinarySum (int [] data, int low , int high ){
      if (low > high)
          return 0;
      else if (low == high)
          return data[low];
      else {
          int mid = (low + high) / 2;
          return BinarySum(data,low,mid) +  BinarySum(data , mid + 1,high);
      }
    }
}
