/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;


import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.*;


/**
 *This class defines how game will be played
 
 */
public  class GroupOfCards  extends WarGame{
    
    public void playCard(LinkedList<Card> deckCPU,LinkedList<Card> deckP1,String player1)
    {
        int size = deckCPU.size();
        int size1=deckP1.size();
        
        boolean res=false;
        res=checkShuffle(size,size1);
        if(res){
            System.out.println("Error: The size of shuffled deck is not same.");
        }else{
            //creating card objects to compare the values later on
            Card p1Card = deckCPU.pop(); 
            Card p2Card = deckP1.pop();
            
            //display the face up card
            System.out.println(player1 + "\'s card:  " + p1Card.toString());
            System.out.println("Computer's card: " + p2Card.toString());
            
            //Number comparation between two cards
            if(p1Card.getValue() > p2Card.getValue()){                          
                deckCPU.addLast(p1Card);                                              
                deckCPU.addLast(p2Card);                                               
                System.out.println(player1 + " Wins\n");
            }
 
            else if(p1Card.getValue() < p2Card.getValue()){                    
                deckP1.addLast(p1Card);   
                deckP1.addLast(p2Card);  
                System.out.println("Computer Wins\n");
            }
            
            else {                                         
                System.out.println("war"); 
                
                //creating war cards
                List<Card> war1 = new ArrayList<Card>(); 
                List<Card> war2 = new ArrayList<Card>();
                
                //checking if players have enough (4)cards 
                for(int x=0; x<3; x++){ 
                    
                    //if one player does not have enough cards then he loses automatically
                    
                    if(deckCPU.size() == 0 || deckP1.size() == 0 ){                      
                        break;
                    }
                    
                    
                    System.out.println("War card for " +player1+ " is |_|\nWar card for Computer is |_|");

                    war1.add(deckCPU.pop());  
                    war2.add(deckP1.pop());                  
                }
                
              
                if(war1.size() == 3 && war2.size() == 3 ){
                    
                    
                    System.out.println("War card for " +player1 +" is " + war1.get(0).toString());
                    System.out.println("War card for Computer is " + war2.get(0).toString());
                    
                    //if player 1 wins the war
                    if(war1.get(2).getValue() > war2.get(2).getValue()){
                        deckCPU.addAll(war1); //player1 get all cards
                        deckCPU.addAll(war2);
                        System.out.println("Winner of The War: "+player1);
                    }//end if
                    // player 2 wins war
                    else{
                        deckP1.addAll(war1); //player2 get all cards
                        deckP1.addAll(war2);
                        System.out.println("Winner of the War: Computer");
                    }                      
                }
                
            }            
            if(deckCPU.size() == 0 ){
                System.out.println("............................GAME OVER............................\nWinner: "+ player1);
               
            }
            else if(deckP1.size() == 0){
                System.out.println("............................GAME OVER............................\nWinner: Computer.");
               
            }
           
        } //end of while loop
    }

    public boolean checkShuffle(int size, int size1) {
        if(size==size1){
            return true;
        }
        else {
            return false;
        }
    }
        
}