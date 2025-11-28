 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: Factorial
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:12/11/2025
 */
package Tema3EstructurasNoLineales;

/**
 *
 * @author josue
 */
public class FactorialRecursivo {
    public static int n =0;
    public static void main(String[] args) {
        System.out.println("n! : " + factn(10));
    }
    public static int  factn (int n){
        if(n==0) return 1;
        return n*factn(n-1);
        }
    } 

