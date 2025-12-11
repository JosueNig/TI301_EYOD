package Examen;

import java.util.List;
import java.util.HashMap;
public class clasehashes {
/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 4 Ordenamiento 
*objetivo: Usar Iterator
*Programador: 
Nigoa NietoJosué Trinidad
Leyva Paniagua Diego
*Fecha:10/12/2025
 */
    public static void main(String[] args) {

        HashMap<Integer, List<Integer>> arbol = new HashMap<>();

        arbol.put(4, List.of(3, 8));   
        arbol.put(3, List.of(1, 6));
        arbol.put(8, List.of(7, 13));
        arbol.put(1, List.of());       
        arbol.put(6, List.of());       
        arbol.put(7, List.of());       
        arbol.put(13, List.of());      

        // Mostrar el árbol
        for (Integer nodo : arbol.keySet()) {
            System.out.println("Nodo " + nodo + " -> Hijos: " + arbol.get(nodo));
        }
    }
}
