package Tema3EstructurasNoLineales;
 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 
*objetivo:  Usar recurisividad para imprimir un patron
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:19/11/2025
 */
public class drawing {

    public static void main(String[] args) {
drawRuler(1,5);
    }
public static void drawRuler(int nInches, int majorLength) {
    drawLine(majorLength, 0);                 // draw inch 0 line and label
    for (int j = 1; j <= nInches; j++) {        
        drawInterval(majorLength - 1);        // draw interior ticks for inch
        drawLine(majorLength, j);             // draw inch j line and label
    }
}

private static void drawInterval(int centralLength) {
    if (centralLength >= 1) {                 // otherwise, do nothing
        drawInterval(centralLength - 1);      // recursively draw top interval
        drawLine(centralLength);              // draw center tick line (without label)
        drawInterval(centralLength - 1);      // recursively draw bottom interval
    }
}

private static void drawLine(int tickLength, int tickLabel) {
    for (int j = 0; j < tickLength; j++) {
        System.out.print("-");
    }
    if (tickLabel >= 0) {
        System.out.print(" " + tickLabel);
    }
    System.out.println("");
}

/** Draws a line with the given tick length (but no label). */
private static void drawLine(int tickLength) {
    drawLine(tickLength, -1);
}
}
