// Fig. 16.10: MazoDeCartas.java
// Barajar y repartir cartas con el método shuffle de Collections.
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

// clase para representar un objeto Carta en un mazo de cartas
class Carta
{
   // CORREGIDO: "Joker" se cambió por "Jota" (Jack) para tener 13 caras estándar.
   public static enum Cara { As, Dos, Tres, Cuatro, Cinco, Seis,
      Siete, Ocho, Nueve, Diez, Jota, Reina, Rey };
   
   // CORREGIDO: Se usaron los 4 palos de la baraja francesa (52 cartas).
   public static enum Palo { Corazones, Diamantes, Treboles, Picas };

   private final Cara cara;
   private final Palo palo;

   // constructor
   public Carta(Cara cara, Palo palo)
   {
      this.cara = cara;
      this.palo = palo;
   }

   // devuelve la cara de la carta
   public Cara obtenerCara()
   {
      return cara;
   }

   // devuelve el palo de la Carta
   public Palo obtenerPalo()
   {
      return palo;
   }

   // devuelve la representación String de la Carta
   public String toString()
   {
      // CORREGIDO: Se cambió "of" por "de" para consistencia.
      return String.format("%s de %s", cara, palo);
   }
} // fin de la clase Carta

// declaración de la clase MazoDeCartas
public class MazoDeCartas
{
   private List<Carta> lista; // declara objeto List que almacenará los objetos Carta

   // establece mazo de objetos Carta y baraja
   public MazoDeCartas()
   {
      Carta[] mazo = new Carta[52];
      int cuenta = 0; // número de cartas

      // llena el mazo con objetos Carta
      for (Carta.Palo palo : Carta.Palo.values())
      {
         for (Carta.Cara cara : Carta.Cara.values())
         {
            mazo[cuenta] = new Carta(cara, palo);
            ++cuenta;
         }
      }

      lista = Arrays.asList(mazo); // obtiene objeto List
      Collections.shuffle(lista); // baraja el mazo
   } // fin del constructor de MazoDeCartas

   // imprime el mazo
// imprime el mazo
   // imprime el mazo
   public void imprimirCartas()
   {
      // Muestra las 52 cartas en dos columnas
      for (int i = 0; i < lista.size(); i++)
      {
         if ((i + 1) % 2 == 0) {
            // Es la SEGUNDA columna: imprime el texto y un salto de línea
            System.out.printf("%s%n", lista.get(i));
         } 
         else {
            // Es la PRIMERA columna: imprime el texto con padding a la derecha
            // (Ajustado a 20 para dar un espacio extra)
            System.out.printf("%-20s", lista.get(i));
         }
      }
   }
   public static void main(String[] args)
   {
              System.out.println("Nigoa Nieto Josue Trinidad");

      MazoDeCartas cartas = new MazoDeCartas();
      cartas.imprimirCartas();

   }
} // fin de la clase MazoDeCartas