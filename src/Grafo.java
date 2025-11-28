import java.util.ArrayList;

public class Grafo {
    public static void main(String[] args) {
        int numVertices = 4;
        
        // 1. Crear la estructura base (Lista de Listas)
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // 2. Inicializar una lista vacía para cada vértice
        for (int i = 0; i < numVertices; i++) {
            adj.add(new ArrayList<>());
        }

        // 3. Agregar arista (0 -> 1)
        adj.get(0).add(1); 
        // Si es no dirigido, agregamos la vuelta (1 -> 0)
        adj.get(1).add(0);

        // 4. Agregar arista (0 -> 2)
        adj.get(0).add(2);
        adj.get(2).add(0);

        // Imprimir vecinos del nodo 0
        System.out.println("Vecinos del nodo 0: " + adj.get(0));
    }
}