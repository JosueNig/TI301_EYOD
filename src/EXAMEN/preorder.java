package Examen;
/*
*ITESS-TICS 20225 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Unidad 4 Ordenamiento 
*objetivo: Usar Iterator
*Programador: 
Nigoa NietoJosué Trinidad
Leyva Paniagua Diego
*Fecha:10/12/2025
 */
public class preorder {

    public static void main(String[] args) {
        Node raiz = new Node(4);
        Node hijoA = new Node(3);
        Node hijoB = new Node(8);
        Node nieto1 = new Node(1);
        Node nieto2 = new Node(6);
        Node nieto3 = new Node(7);
        Node nieto4 = new Node(13);

        raiz.addChild(hijoA);      
        raiz.addChild(hijoB);      
        hijoA.addChild(nieto1);    
        hijoA.addChild(nieto2);    
        hijoB.addChild(nieto3);
        hijoB.addChild(nieto4);

        preorder(raiz);

    }

    public static void preorder(Node p) {
        System.out.print(p.getValue() + ", ");

        for (int i = 0; i < p.getChilds().size(); i++) {

            preorder(p.getChilds().get(i));
        }
    }
}
