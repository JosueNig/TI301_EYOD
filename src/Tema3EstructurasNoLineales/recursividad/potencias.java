package Tema3EstructurasNoLineales.recursividad;
 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: Calcula el tiempo segun la potencia con 2 algoritmos
uno mas eficiente que el otro
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:27/11/2025
 */
public class potencias {

    public static double powerB (double x , int n){
     if(n==0)
         return 1;
     else 
         return x * powerB(x,n-1);
    }
    public static double powerG (double x , int n){
     if(n==0)
         return 1;
     else {
         double partial = powerG (x,n/2);
         double result = partial * partial;
         if (n % 2 == 1)
             result*=x;
         return result;
     }       
    }
}
