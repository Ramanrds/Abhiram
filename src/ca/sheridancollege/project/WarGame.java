/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author raman
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * This class has main method and work as the class
 * that calls all other classes to make a game out of it.
 * @author Group SkyHawks
 */
public abstract class WarGame {
    
    public static void main(String[] args) {
        
        //Object for taking user input.
        Scanner in = new Scanner(System.in);
        List<Card> deck = new ArrayList<Card>(); //create an ArrayList.
        
        for(int x=0; x<4; x++){          
            for(int y=2; y<15; y++){      
                deck.add(new Game(x,y)); 
            } 
        }
        Collections.shuffle(deck, new Random()); // to shuffle the deck 
        
        //creating 2 decks, each for player1/player2
        LinkedList<Card> deckCPU = new LinkedList<Card>();
        LinkedList<Card> deckP1 = new LinkedList<Card>();
        
        deckCPU.addAll(deck.subList(0, 25));                                
        deckP1.addAll(deck.subList(26, deck.size()));       
        

         //Creating Player Object
         Player self=new Player();
         while(true){
        System.out.println("Enter Your Name: ");
        String name=in.nextLine();
        if(name.equals(null) || name.equals("")){
            System.out.println("Enter A Valid Name.");
        }else{
            self.setName(name);
            break;
        }
         }
        GroupOfCards obj = new GroupOfCards();
        
        
        obj.playCard(deckCPU, deckP1, self.getName());
 
    }//end main   
    
}