 /*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*objetivo: Imprimir n veces mi nombre
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:12/11/2025
 */
package Tema3EstructurasNoLineales;

/**
 *
 * @author josue
 */
public class myNombreRecursivo {
    public static int count =0;
    
    public static void main(String[] args) {
        printName(5,"Josue");
    }
    public static void printName(int n,String name){
        if (count >n) {
            count=0;
            return;
    }
        System.out.println(count + ":" + name);
        count++;
        printName(n,name);
    }
}
