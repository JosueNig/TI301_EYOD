
package tema2_EstructurasLineales.testStack;

import java.util.ArrayList;
import java.util.Stack;

public class HighestTemperatures {
    private int [] temperatures;
    private int [] conta;
    public HighestTemperatures(int[] temperatures) {
        this.temperatures = temperatures;
    }
    //Crear resultado
    //n-1 agregar al stack
    //recorrer el arreglo del final al inicio
   
    public static void main(String[] args) {
        ArrayList<Integer> conta =  new ArrayList<>();   
        ArrayList<Integer> temp =  new ArrayList<>();   
        Stack<Integer> temperatures = new Stack<>();
            //crear temperature
            temperatures.push(23); 
            temperatures.push(25); 
            temperatures.push(36); 
            temperatures.push(21); 
            temperatures.push(29); 
            temperatures.push(37); 
            //crear stack de T.altas
            temp.add(23);
            temp.add(25);
            temp.add(36);
            temp.add(21);
            temp.add(29);
            temp.add(37);
            for (int i = temp.size()-1; i >0; i--) {
                if(temp.get(i)< temp.get(temperatures.peek()));
                conta.set(i, i);
            
        }
    }
            
        
    
}
