/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package showwhatyouknow1;
import java.util.*;
/**
 *
 * @author joham3169
 */
public class ShowWhatYouKnow1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean Mainloop = true;
       
        int TEAM_LIST; 
        TEAM_LIST = 0;
        
        String [] teams = new String[5];
        
        Scanner ui = new Scanner(System.in);
        
       
       while (Mainloop == true)
       {
           System.out.println("What Are Your Favourite Sports Teams (Atlest 5)");
           
           for (int i = TEAM_LIST; i<=4; i = i + 1)
           {
               teams[i] = ui.nextLine ();
           }
           System.out.println("The Teams You Entered Were, " +teams[0] + ", " + teams[1] + ", "+ teams[2] + ", " + teams[3] + ", " + teams[4]);
           Mainloop = false;
       }
    }
    
}
