package Tema3EstructurasNoLineales;

import java.util.ArrayList;
import java.util.List;

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
public class GraphAdjacencyList {

    private List<List<Integer>> graph; // Lista de adyacencia
    private int n; //numeros de vertices 

    public GraphAdjacencyList(int n) {
        this.n = n;
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public void print() {
        int node = 0;
        for (var al : graph) {
            System.out.print(node + ":");
            for (var i : al) {
                System.out.print(i + ",");
            }
            node++;
            System.out.println(" ");
        }

    }

    public int depth(int p) {
        // is root
        if (p == 0) {
            return 0;
        }
        return 1 + depth(graph.get(p).get(0));

    } }
/*
    public int preorder(int p) {
        return p;
        if ( graph.get(p).size() <=  1)
           
        graph.size()
        for   
            return proerder(p);
    }
}
*/