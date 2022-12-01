/*
* This is a procedural java lab project that is meant
 * to get us used to java.
 Created By: Hemant Mahato
         on: 08/21/20
 
 */
import java.util.*;

public class EnterCard {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String message = "Please enter the number corresponding\n"+
                         "to the suit you want to enter:\n"+
                         "  1 for clubs\n"+
                         "  2 for hearts\n"+
                         "  3 for spades\n"+
                         "  5 for diamonds\n -->";
        System.out.print(message);
        
        int suit = keyboard.nextInt();
        
        message = "\nPlease enter the number corresponding\n"+
                  "to the card value you want to enter:\n"+
                  "  1 for Ace\n"+
                  "  2-10 depending on the number value wanted\n"+
                  "  11 for jack\n"+
                  "  12 for queen\n"+
                  "  13 for king\n -->";
        System.out.print(message);
        
        int faceVal = keyboard.nextInt();
        
        String output = "\nYou entered ";
        
        switch (faceVal)
        {
            case 1:
                output += "the Ace of";
                break;
            case 2:
                output += "the Two of";
                break;
            case 3:
                output += "the Three of";
                break;
            case 4:
                output += "the Four of";
                break;
            case 5:
                output += "the Five of";
                break;
            case 6:
                output += "the Six of";
                break;
            case 7:
                output += "the Seven of";
                break;
            case 8:
                output += "the Eight of";
                break;
            case 9:
                output += "the Nine of";
                break;
            case 10:
                output += "the Ten of";
                break;
            case 11:
                output += "the Jack of";
                break;
            case 12:
                output += "the Queen of";
                break;
            case 13:
                output += "the King of";
                break;
        }
        
        switch (suit)
        {
            case 1:
                output += " Clubs.";
                break;
            case 2:
                output += " Hearts.";
                break;
            case 3:
                output += " Spades.";
                break;
            case 4:
                output += " Diamonds.";
                break;
        }
        
        output += "\n\nProgram is now ending\n\n";
        System.out.print(output);
        
        message = "\nHemant Mahato\n"+
                  "Computer Science - General\n"+
                  "Class Standing: CSCI282, 9:00A.M-9:30A.M, ONLINE MOODLE\n";
        System.out.print(message);
    }

}
