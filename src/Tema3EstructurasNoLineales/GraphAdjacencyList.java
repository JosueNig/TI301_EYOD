package Tema3EstructurasNoLineales;

import Algoritmos.Nodo;
import java.util.ArrayList;
import java.util.List;


public class GraphAdjacencyList {
    private Nodo root;
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
        if (p == 0) {
            return 0;
        }
        return 1 + depth(graph.get(p).get(0));
    }
    }



