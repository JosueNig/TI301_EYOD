package Tema3EstructurasNoLineales.recursividad;

/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: Clase de testeo que calcula el tiempo de las potencias por
2 algoritmos.
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:27/11/2025
 */

public class potenciasTest {
    public static void main(String[] args) {
        System.out.println(potencias.powerB(200.0,10 ));
        System.out.println(potencias.powerG(200.0, 10));
        System.out.println(potencias.powerB(200.0,50 ));
        System.out.println(potencias.powerG(200.0, 50));
        System.out.println(potencias.powerB(200.0,100 ));
        System.out.println(potencias.powerG(200.0, 100));
        System.out.println(potencias.powerB(200.0,1000 ));
        System.out.println(potencias.powerG(200.0, 1000));
        System.out.println(potencias.powerB(200.0,10000 ));
        System.out.println(potencias.powerG(200.0, 10000));

    }
}
