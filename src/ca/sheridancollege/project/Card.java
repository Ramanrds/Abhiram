/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 * Modified by group Abhiram
 */
public class Card {
    
    /* Intializing the suit and card numbers */
    private int value; 
    private int suit; 
    
    
    /*The Constructor*/
    public Card(int s, int gVal){
        value = gVal;
        suit = s;
    }

    
    
    public int getValue(){
        return value; 
    }
    
    
    public int getSuit() {
        return suit;
    }

    
    
    public void setValue(int gVal){
        value = gVal;
    }

  
    public void setSuit(int suit) {
        this.suit = suit;
    }
}//end Card Class 
