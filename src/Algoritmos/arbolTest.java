package Algoritmos;

import java.util.ArrayList;
import java.util.List;

/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*Objetivo: Testear todos los metodos hechos en la clase Arbol
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:04/12/2025
 */
public class arbolTest {

    public static void main(String[] args) {
        System.out.println("Nigoa Nieto Josue Trinidad");
        Nodo raiz = new Nodo(1);
        Nodo hijoA = new Nodo(2);
        Nodo hijoB = new Nodo(3);
        Nodo nieto1 = new Nodo(4);
        Nodo nieto2 = new Nodo(5);
        Nodo nieto3 = new Nodo(6);

        raiz.addChild(hijoA);      // 1 -> 2
        raiz.addChild(hijoB);      // 1 -> 3
        hijoA.addChild(nieto1);    // 2 -> 4
        hijoA.addChild(nieto2);    // 2 -> 5
        hijoB.addChild(nieto3);    // 3 -> 6

        Arbol arbol = new Arbol(raiz);
        List<Nodo> resultado = new ArrayList<>();
        System.out.println("Metodo BFS");
        arbol.breadFirst(raiz, resultado);
        Arbol.print(resultado);
        resultado.clear();

        System.out.println(" Metodo PREORDER ");
        arbol.preorder(raiz, resultado);
        Arbol.print(resultado);
        resultado.clear();

        System.out.println(" Metodo POSTORDER");
        arbol.postorder(raiz, resultado);
        Arbol.print(resultado);
        resultado.clear();

        System.out.println(" Metodo INORDER ");
        arbol.inorder(raiz, resultado);
        Arbol.print(resultado);
        resultado.clear();

        System.out.println(" Metodo HEIGHT ");
        System.out.println("Altura : " + arbol.heigth(raiz));

        System.out.println(" Metodo HEIGHTBAD ");
        System.out.println("Altura : " + arbol.heigthBad());

        System.out.println(" Metodo DEPTH ");
        System.out.println("Profundidad del Nodo 4: " + arbol.depth(nieto1));
    }
}
