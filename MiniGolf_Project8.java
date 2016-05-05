/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minigolf_project8;

/**
 *
 * @author Mario Perez-Jordan
 */
public class MiniGolf_Project8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    //Methods with not implementation, just skeleton
    //Based on assignment 8, This method creates and stores a new round object
    // and returns a reference to that Round object
    public static Round newRound ( String courseName, String playerName ) {
       return null; 
    }
    //This method looks up the Round object.  Note it isn't specified how you store Round objects,
    //but a likely choice is some sort of “Collection”. 
    public static Round getRound (String player, String courseName ) {
        return null;
    }
    //Returns a Course object.  These must be persisted to storage but there aren't many 
    //courses so creating a “Collection” to hold them all
    
    public static Course getCourse ( String courseName )  {
        return null;
    }
    //This method looks up the round information and returns it's score so far 
    //to the swipe station, to display.
    
    public static int scoreSoFar( String courseName, String playerName ) {
        return 0;
    } 
    //method is redundant.  It also will be used by the swipe-station once 
    //a player hits the button for their number of strokes for that hole
    public static void enterStrokes ( String courseName, String playerName, int strokes ) { 
       
    }
    
}

