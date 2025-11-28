package tema2_EstructurasLineales;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
*ITESS-TICS 2025 Estructura y Organización de Datos
*Agosto Dicimebre 2025
*Docente:Francisco Javier Montecillo Puente
*Descripción:Detecta numeros repetidos en una linea
Tema 2:Estructuras Lineales
     2.1 Lista
*Programador:Josué Trinidad Nigoa Nieto
*Fecha:17/10/2025
*compile and run
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        //datos
        int n =10;//cantidad de numeros
        int N=100;//rango de numeros de 0-1
        List<Integer> nums = generateNums(n,N);
        print(nums);
        System.out.println("containsDuplicate  " + containsDuplicate(nums) );
        //algoritmo para resolver
    }
    public static void print(List<Integer> nums){
        System.out.println(nums.toString());
    }
    
    public static List<Integer> generateNums(int n, int N){
        List<Integer> nums = new ArrayList<>();
        
        for (int i = 0; i < n; i++) 
            nums.add((int) (Math.random() * N));
        return nums;
    }
    
    public static boolean containsDuplicate(List<Integer> nums){
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if(Objects.equals(nums.get(i), nums.get(j)))
                    return true;
                }
            }
        return false;
        }
    
    }

