/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.*;

/**
 modified by group-Abhiram
 */
public class Game extends Card {
    /**
     * The Game class Takes the numbers and suits from by card class 
     * to combine them and make a deck out of them.
     * 
     */
    
    
    public Game(int s, int gVal)
    {
        super(s,gVal);
    }
    
    @Override
    public String toString(){
    
        StringBuilder display = new StringBuilder();
        
       
        
        switch(super.getValue()){
            //since rank is int type, now match int 11 to String jack...14 to Ace
            case 11:
                display.append("Jack");
                break;
            case 12:
                display.append("Queen");
                break;
            case 13:
                display.append("King");
                break;
            case 14:
                display.append("Ace");
                break;    
            default:
                display.append(super.getValue()); //no need to modify
                break;
        }
        
        display.append(" of ");
        
        switch(super.getSuit()){
            case 0:
                display.append("Spades");
                break;
            case 1:
                display.append("Hearts");
                break;
            case 2:
                display.append("Clubs");
                break;
            case 3:
                display.append("Diamonds");
                break;
            default: 
                break;
        }//end suit switch
       
        return display.toString();
    }
	
}
