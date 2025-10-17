 
package Unidad0.poo;
 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 0 respaso de las interfaces  
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:23/09/2025
*objetivo i.e [1 2 3 4 ] true 
        ie [3 4 5 6 ] false 
*compile and run
*javac arreglos02_ContainsDuplicate.java
*java Arreglos02_ContainsDuplicate.java
 */
public class BookLibraryITESSTest {
    public static void main(String[] args) {
        BookBibliotecaItess aBook = new BookBibliotecaItess("Java","Deithel",4);
        System.out.println(aBook.toString());
        aBook.lend();
        System.out.println("getTitle()"+aBook.getAuthor());
        System.out.println("getTitle()"+aBook.getTitle());
        System.out.println("getTitle()"+aBook.getQuantity());

        // Probar isAvailable
        
        // Probar prestar 
        aBook.isAvailable();
        System.out.println("Cantidad: " + aBook.getQuantity());
        
        // Probar devolber
        aBook.returnBack();
        System.out.println("Cantidad: " + aBook.getQuantity());
        
        // Test BookInterface
        Bookinterface iBook = aBook;
        iBook.lend();
        

    }
    
}
