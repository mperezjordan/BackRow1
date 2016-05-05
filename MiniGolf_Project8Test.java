/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf_project8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario Perez-Jordan 
 * Java 2 Project 8 
 */
public class MiniGolf_Project8Test {
    
    public MiniGolf_Project8Test() {
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

    /**
     * Test of main method, of class MiniGolf_Project8.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MiniGolf_Project8.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newRound method, of class MiniGolf_Project8.
     */
    @Test
    public void testNewRound() {
        System.out.println("newRound");
        String courseName = "";
        String playerName = "";
        MiniGolf_Project8.newRound(courseName, playerName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRound method, of class MiniGolf_Project8.
     */
    @Test
    public void testGetRound() {
        System.out.println("getRound");
        String player = "";
        String courseName = "";
        MiniGolf_Project8.getRound(player, courseName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourse method, of class MiniGolf_Project8.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        String courseName = "";
        MiniGolf_Project8.getCourse(courseName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scoreSoFar method, of class MiniGolf_Project8.
     */
    @Test
    public void testScoreSoFar() {
        System.out.println("scoreSoFar");
        String courseName = "";
        String playerName = "";
        int expResult = 0;
        int result = MiniGolf_Project8.scoreSoFar(courseName, playerName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enterStrokes method, of class MiniGolf_Project8.
     */
    @Test
    public void testEnterStrokes() {
        System.out.println("enterStrokes");
        String courseName = "";
        String playerName = "";
        int strokes = 0;
        MiniGolf_Project8.enterStrokes(courseName, playerName, strokes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
