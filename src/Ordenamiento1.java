// Fig. 16.6: Ordenamiento1.java
// Método sort de Collections.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Ordenamiento1
{
   public static void main(String[] args)
   {
              System.out.println("Nigoa Nieto Josue Trinidad");

      String[] palos = {"Corazones", "Diamantes", "Bastos", "Espadas"};

      // Crea y muestra una list que contiene los elementos del arreglo palos
      List<String> lista = Arrays.asList(palos);
      System.out.printf("Elementos del arreglo desordenados: %s%n", lista);

      Collections.sort(lista); // ordena ArrayList

      System.out.printf("Elementos del arreglo ordenados: %s%n", lista);

   }
} // fin de la clase Ordenamiento1