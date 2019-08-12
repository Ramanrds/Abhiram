/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 * modified by group-Abhiram
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public class Player {
    
    //field variable
    private String playerName;
    
    public void setName(String newPlayerName){
        playerName=newPlayerName;
    }    
    
    public String getName(){
        return playerName;
    }

    
}//end class 