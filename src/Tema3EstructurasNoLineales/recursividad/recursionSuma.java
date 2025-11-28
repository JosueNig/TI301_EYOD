package Tema3EstructurasNoLineales.recursividad;

 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: Sumar usando la recursividad
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:27/11/2025
 */
public class recursionSuma {
    private int [] data;
    private int n;

    public recursionSuma( int n, int[] data) {
        this.n = n;
        this.data = data;

    }

    public static int lineaSuma(int [] data , int n){
        if (n == 0)
                return 0;
        else 
            return lineaSuma(data, n-1) + data[n-1];
    }
    
}
