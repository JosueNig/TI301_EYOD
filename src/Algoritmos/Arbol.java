package Algoritmos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*Objetivo: Clase que contiene los metodos de recorrido de grafos
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:04/12/2025
 */
public class Arbol {

    private Nodo root;

    public Arbol(Nodo root) {
        this.root = root;
    }

    public Iterable<Nodo> positions() {
        List<Nodo> position = new ArrayList<>();
        preorder(root, position);
        return position;
    }

    public void preorder(Nodo p, List<Nodo> List) {
        List.add(p);
        for (Nodo c : p.getChilds()) {
            preorder(c, List);
        }
    }

    public int depth(Nodo p) {
        if (p == root) {
            return 0;
        }
        return 1 + depth(p.getParent().get(0));
    }

    public int heigthBad() {
        int h = 0;
        for (Nodo p : positions()) {
            if (p.isExternal()) {
                h = Math.max(h, depth(p));
            }
        }
        return h;
    }

    public int heigth(Nodo p) {
        int h = 0;
        for (Nodo c : p.getChilds()) {
            h = Math.max(h, 1 + heigth(c));
        }
        return h;
    }

    public void postorder(Nodo p, List<Nodo> List) {
        for (Nodo c : p.getChilds()) {
            postorder(c, List);
        }
        List.add(p);
    }

    public void inorder(Nodo p, List<Nodo> List) {
        if (p.getChilds().size() > 0) {
            inorder(p.getChilds().get(0), List);
        }
        List.add(p);
        if (p.getChilds().size() > 1) {
            inorder(p.getChilds().get(1), List);
        }
    }

    public void breadFirst(Nodo p, List<Nodo> List) {
        Queue<Nodo> Cola = new LinkedList<>();
        Cola.add(root);
        while (!Cola.isEmpty()) {
            p = Cola.poll();
            List.add(p);
            for (Nodo c : p.getChilds()) {
                Cola.add(c);
            }
        }
    }

    public static void imprimirLista(List<Nodo> lista) {
        for (Nodo n : lista) {
            System.out.print(n.getValue() + " -> ");
        }
        System.out.println(" ");
    }
}
