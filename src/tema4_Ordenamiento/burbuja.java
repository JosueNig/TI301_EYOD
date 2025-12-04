/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4_Ordenamiento;

import java.util.Random;

/**
 *
 * @author josue
 */
public class burbuja {

    // --- 1. EL ALGORITMO (MÉTODO APARTE) ---
    public void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;

        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio (Swap)
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;
                }
            }

            // Si en una pasada no hubo intercambios, el arreglo ya está ordenado
            if (!intercambiado) {
                break;
            }
        }
    }
}