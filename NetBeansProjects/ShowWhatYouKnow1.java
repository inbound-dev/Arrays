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
        
       // creating a bool obj for main loop
       boolean Mainloop = true;
       
       // creating variable for, for loop
        int TEAM_LIST; 
        TEAM_LIST = 0;
        
        // creating a string for an array of given data
        String [] teams = new String[5];
        
        // scanner obj t get team names of user to be stored in array
        Scanner ui = new Scanner(System.in);
        
       //starting while loop
       while (Mainloop == true)
       {
           //asking for team input and for atleast 5
           System.out.println("What Are Your Favourite Sports Teams (Atlest 5)");
            // for loop to gather inputed data an stores it in an array
           for (int i = TEAM_LIST; i<=4; i = i + 1)
           {
               // getting scanner data and storing it in variable teams
               teams[i] = ui.nextLine ();
           }
           // printing user defined teams
           System.out.println("The Teams You Entered Were, " +teams[0] + ", " + teams[1] + ", "+ teams[2] + ", " + teams[3] + ", " + teams[4]);
           
           // exiting mainloop when program is complete
           Mainloop = false;
       }
    }
    
}
