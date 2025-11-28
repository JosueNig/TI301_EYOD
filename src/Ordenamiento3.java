// Fig. 16.9: Ordenamiento3.java
// Método sort de Collections con un objeto Comparator personalizado.
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ordenamiento3
{
   public static void main(String[] args)
   {
              System.out.println("Nigoa Nieto Josue Trinidad");

      List<Tiempo2> lista = new ArrayList<>(); // crea objeto List

      lista.add(new Tiempo2(6, 24, 34));
      lista.add(new Tiempo2(18, 14, 58));
      lista.add(new Tiempo2(6, 05, 34));
      lista.add(new Tiempo2(12, 14, 58));
      lista.add(new Tiempo2(6, 24, 22));

      // imprime los elementos del objeto List
      System.out.printf("Elementos del arreglo desordenados:%n%s%n", lista);

      // ordena usando un comparador
      Collections.sort(lista, new ComparadorTiempo());

      // imprime los elementos del objeto List
      System.out.printf("Elementos de la lista ordenados:%n%s%n", lista);

   }
} // fin de la clase Ordenamiento3
