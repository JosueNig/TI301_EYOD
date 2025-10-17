package Unidad0.poo;
    /*
*
*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 0 respaso de las interfaces con una biblioteca
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:23/09/2025
*objetivo i.e [1 2 3 4 ] true 
           ie [3 4 5 6 ] false 
*compile and run
*javac arreglos02_ContainsDuplicate.java
*java Arreglos02_ContainsDuplicate.java
 */
public class BookBibliotecaItess implements Bookinterface{
    
    private String Title;
    private String Author;
    private int quantity;

    public BookBibliotecaItess(String Title, String Author, int quantity) {
        this.Title = Title;
        this.Author = Author;
        this.quantity = quantity;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getQuantity() {
        return quantity;
    }

public void addQuantity(int quantity){
        if (quantity >0)
        this.quantity += quantity;
    }
    @Override
    public boolean isAvailable() {
        if (quantity>0)
            return true;
        return false;
    }
    @Override
    public void lend() {
        if (isAvailable())
            quantity--;
        
    }
@Override
    public void returnBack() {
        quantity ++;
    }    
   

    @Override
    public String toString() {
        return "BookBibliotecaItess{" + "Title=" + Title + ", Author=" + Author + ", quantity=" + quantity + '}';
    }
}