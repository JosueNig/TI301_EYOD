
package Tema3EstructurasNoLineales.recursividad;

/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: Ejecutar la serie fibonacci
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:27/11/2025
 */
public class fibonacci {
    
    public static long fibonacciBad(int n){
        if (n<=1)
            return n;
        else 
            return fibonacciBad(n-2)+ fibonacciBad(n-1);
    }
    public static long [] fibonacciGood(int n){
        if (n<=1){
            long [] answer = {n, 0};
            return answer;
        } else {
            long []  temp = fibonacciGood(n-1);
            long [] answer = {temp[0] + temp[1],  temp[0]};
            return answer;
        }
    }
 
}

