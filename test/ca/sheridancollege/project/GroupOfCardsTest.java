/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author group-Abhiram
 */import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    GroupOfCards main=new GroupOfCards();
    /**
     * Test of playCard method, of class GroupOfCards.
     */
    @Test
    public void testShuffleGood() {
        System.out.println("Test Shuffle: Good");
        int size=25;
        int size1=25;
        boolean expresult= true;
        boolean result = main.checkShuffle(size,size1);
        GroupOfCards instance = new GroupOfCards();
        assertEquals(expresult,result);
    }
    
    @Test
    public void testShuffleBad() {
        System.out.println("Test Shuffle: Good");
        int size=24;
        int size1=26;
        boolean expresult= false;
        boolean result = main.checkShuffle(size,size1);
        GroupOfCards instance = new GroupOfCards();
        assertEquals(expresult,result);
    }
    
    @Test
    public void testShuffleBoundary() {
        System.out.println("Test Shuffle: Good");
        int size=0;
        int size1=0;
        boolean expresult= true;
        boolean result = main.checkShuffle(size,size1);
        GroupOfCards instance = new GroupOfCards();
        assertEquals(expresult,result);
    }

    /**
     * Test of playCard method, of class GroupOfCards.
     */
    @Test
    public void testPlayCard() {
        System.out.println("playCard");
        LinkedList<Card> deckCPU = null;
        LinkedList<Card> deckP1 = null;
        String player1 = "";
        GroupOfCards instance = new GroupOfCards();
        instance.playCard(deckCPU, deckP1, player1);
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testCheckShuffle() {
        System.out.println("checkShuffle");
        int size = 0;
        int size1 = 0;
        GroupOfCards instance = new GroupOfCards();
        boolean expResult = false;
        boolean result = instance.checkShuffle(size, size1);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    
}