// Fig. 16.4: UsoToArray.java
// Ver arreglos como objetos List y convertir objetos List en arreglos.
import java.util.LinkedList;
import java.util.Arrays;

public class UseToArray
{
    
   // el constructor crea un objeto LinkedList, le agrega elementos y lo
   // convierte en arreglo
   public static void main(String[] args)
   {
              System.out.println("Nigoa Nieto Josue Trinidad");

      String[] colors = {"negro", "azul", "amarillo"};
      LinkedList<String> enlaces = new LinkedList<>(Arrays.asList(colors));

      enlaces.addLast("rojo"); // lo agrega como último elemento
      enlaces.add("rosa"); // lo agrega al final
      enlaces.add(3, "verde"); // lo agrega en el 3er índice
      enlaces.addFirst("cyan"); // lo agrega como primer elemento

      // obtiene los elementos de LinkedList como un arreglo
      colors = enlaces.toArray(new String[enlaces.size()]);

      System.out.println("colores: ");

      for (String color : colors)
         System.out.println(color);
   }
} // fin de la clase UsoToArray
