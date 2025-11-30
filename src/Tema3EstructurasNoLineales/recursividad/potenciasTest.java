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
        
        System.out.println("Nigoa Nieto Josue Trinidad");
        long inicioB1 = System.nanoTime();
        System.out.println("RESULTADO METODO BAD : " + potencias.powerB(200.0, 10));
        long finB1 = System.nanoTime();
        System.out.println("Tiempo en milisegundos = " + (finB1 - inicioB1) / 1000000.0);

        long inicioG1 = System.nanoTime();
        System.out.println("RESULTADO METODO GOOD : " + potencias.powerG(200.0, 10));
        long finG1 = System.nanoTime();
        System.out.println("Tiempo en milisegundos = " + (finG1 - inicioG1) / 1000000.0);

        long inicioB2 = System.nanoTime();
        System.out.println("RESULTADO METODO BAD : " + potencias.powerB(200.0, 50));
        long finB2 = System.nanoTime();
        System.out.println("Tiempo  en milisegundos = " + (finB2 - inicioB2) / 1000000.0);

        long inicioG2 = System.nanoTime();
        System.out.println("RESULTADO METODO GOOD : " + potencias.powerG(200.0, 50));
        long finG2 = System.nanoTime();
        System.out.println("Tiempo  en milisegundos = " + (finG2 - inicioG2) / 1000000.0);

        long inicioB3 = System.nanoTime();
        System.out.println("RESULTADO METODO BAD : " + potencias.powerB(200.0, 100));
        long finB3 = System.nanoTime();
        System.out.println("Tiempo  en milisegundos = " + (finB3 - inicioB3) / 1000000.0);

        long inicioG3 = System.nanoTime();
        System.out.println("RESULTADO METODO GOOD : " + potencias.powerG(200.0, 100));
        long finG3 = System.nanoTime();
        System.out.println("Tiempo  en milisegundos = " + (finG3 - inicioG3) / 1000000.0);

        long inicioB4 = System.nanoTime();
        System.out.println("RESULTADO METODO BAD : " + potencias.powerB(200.0, 1000));
        long finB4 = System.nanoTime();
        System.out.println("Tiempo  en milisegundos = " + (finB4 - inicioB4) / 1000000.0);

        long inicioG4 = System.nanoTime();
        System.out.println("RESULTADO METODO GOOD : " + potencias.powerG(200.0, 1000));
        long finG4 = System.nanoTime();
        System.out.println("Tiempo  en milisegundos = " + (finG4 - inicioG4) / 1000000.0);

        long inicioB5 = System.nanoTime();
        System.out.println("RESULTADO METODO BAD : " + potencias.powerB(200.0, 10000));
        long finB5 = System.nanoTime();
        System.out.println("Tiempo en milisegundos = " + (finB5 - inicioB5) / 1000000.0);

        long inicioG5 = System.nanoTime();
        System.out.println("RESULTADO METODO GOOD : " + potencias.powerG(200.0, 10000));
        long finG5 = System.nanoTime();
        System.out.println("Tiempo  en milisegundos = " + (finG5 - inicioG5) / 1000000.0);
    }
} 
