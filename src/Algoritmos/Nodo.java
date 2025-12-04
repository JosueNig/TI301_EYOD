package Algoritmos;
import java.util.ArrayList;
import java.util.List;
/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 3 estructura no lineales 
        3.1 recursividad
*Objetivo : Clase Nodo para ejecutar los algoritmos
*Programador: Josué Trinidad Nigoa Nieto
*Fecha:04/12/2025
 */
import java.util.ArrayList;
import java.util.List;

public class Nodo {

    private int value;
    private List<Nodo> parent;
    private List<Nodo> childs;

    public Nodo(int value) {
        this.value = value;
        this.childs = new ArrayList<>();
        this.parent = new ArrayList<>();
    }

    public void setParent(List<Nodo> parent) {
        this.parent = parent;
    }

    public void addChild(Nodo child) {
        this.childs.add(child);
        child.getParent().add(this);
    }

    public int getValue() {
        return value;
    }

    public List<Nodo> getParent() {
        return parent;
    }

    public List<Nodo> getChilds() {
        return childs;
    }

    public Boolean isExternal() {
        return childs.isEmpty();
    }

    @Override
    public String toString() {
        return "Nodo{" + value + "}";
    }
}
