/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package names;

import java.util.*;
/**
 *
 * @author Jordan
 */
public class Names {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
        String [ ] friends = new String [5];
        
        System.out.println("Enter the names of ten friends:");
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        System.out.println("The fourth and seventh names listed were:");
        System.out.println("Second: " + friends[1]);
        System.out.println("Third: " + friends[2]); 
        System.out.println("Fourth: " + friends[3]); 


    }
    
}
