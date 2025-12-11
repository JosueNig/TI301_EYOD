package Examen;

import java.util.Iterator;
import java.util.List;
/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 4 Ordenamiento 
*objetivo: Usar Iterator
*Programador: 
Nigoa Nieto Josué Trinidad
Leyva Paniagua Diego
*Fecha:10/12/2025
 */
public class Iterators {

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3);
        Iterator<Integer> it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
