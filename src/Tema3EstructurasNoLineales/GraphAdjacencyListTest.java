package Tema3EstructurasNoLineales;

 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: Imprimir un grafo
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:26/11/2025
 */
public class GraphAdjacencyListTest {
    public static void main(String[] args) {
        GraphAdjacencyList tree =  new GraphAdjacencyList(7);
        tree.addEdge(0, 1);
        tree.addEdge(0, 2);
        tree.addEdge(1, 3);
        tree.addEdge(1, 4);
        tree.addEdge(2, 5);
        tree.addEdge(2, 6);
        
        tree.print();
        System.out.println (tree.depth(5));
    }
}
