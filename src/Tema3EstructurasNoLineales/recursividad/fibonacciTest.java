package Tema3EstructurasNoLineales.recursividad;

/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: clase de testeo para la serie de fibonacci
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:27/11/2025
 */

public class fibonacciTest {
    public static void main(String[] args) {

        System.out.println(fibonacci.fibonacciBad(3));
        System.out.println( fibonacci.fibonacciGood(3)[0] ); 
        System.out.println(fibonacci.fibonacciBad(5));
        System.out.println( fibonacci.fibonacciGood(5)[0] );
        System.out.println(fibonacci.fibonacciBad(10));
        System.out.println( fibonacci.fibonacciGood(10)[0] );
    }
    
}
