/*
 * This program is to help us better understand object oriented programming
 * through the object oriented coding, using GUI,  
 * of a rock paper scissor game.
 */

/**
 *
 * Created by: Hemant Mahato on 10/29/20
 */

import java.util.*;
import javax.swing.*;

public class RSP_game 
{
   
    private static Random rand = new Random();
    
    public static char generateComputersChoice()
    {
        int comp_play = rand.nextInt(3);
        
        switch (comp_play)
        {
            case 0:
                return 'r';
                
             case 1:
                return 'p';
                
             case 2:
                return 's';      
        }
        return '?';
    }
    
    public static char enterPlayersChoice()
    {
            
            String prompt = "Please click the button that\n"+
                            "corresponds to your play\n";
            
            ImageIcon icon = new ImageIcon("RPS.png");
            String[] plays = {"rock", "paper", "scissors"};
            
            int play = JOptionPane.showOptionDialog(null,"<html><h1>Please click the button that<br>corresponds to your play</h1>" , "Play(Rock, Paper, Scissor)          Hemant Mahato",1,1,icon,plays,plays[0]); 
           
            switch (play)
            {
                case 0:
                    return 'r';
                    
                case 1:
                    return 'p';
                    
                default:
                    return 's';
            }
    }
    public static String translateCharacter(char oneChar)
    {
        String replacedChar = "xx";
        if (oneChar == 'r')  
        {
        replacedChar = "rock";
        }
        else if (oneChar == 'p')  
        {
        replacedChar = "paper";
        }
        else if (oneChar == 's')  
        {
        replacedChar = "scissors";
        }
        
        return replacedChar;
    }


    public static void main(String[] args)
    {
        int counter = 0;
        
        String message = "Please enter the integer number of games\n"+
                         "that you want to play.\n --> ";
       
        ImageIcon icon = new ImageIcon("RPS.png");
        String response = JOptionPane.showInputDialog(null, message, "Play(Rock, Paper, Scissor)           Hemant Mahato",1);
        
        if(response == null || response.equals("") )
        {
            String res = "You Chose to not enter a response,\n"+
                         "so this program is going to end";
            JOptionPane.showMessageDialog(null,res, "Termination Screen        Hemant Mahato", 2);
            System.exit(0);
        }
        else
        {
            
            int numGames = 0;
            try 
            {
                numGames = Integer.parseInt(response);
            }
            catch(NumberFormatException nfe)
            {
                   String res = "Your entry doesnot match an integer,\n"+
                         "so this program is going to end";
            JOptionPane.showMessageDialog(null,res, "Termination Screen        Hemant Mahato", 2);
            System.exit(0);     
            }

            JOptionPane.showMessageDialog(null, "Let the games begin", "Play(Rock, Paper, Scissor)           Hemant Mahato", 1,icon);
            int wins = 0;
            int losses = 0;
            int ties = 0;

            while (counter < numGames)
            {
                ImageIcon icon1 = new ImageIcon("RPS2.png");
                ImageIcon icon2 = new ImageIcon("paperWrapsRock.png");
                ImageIcon icon3 = new ImageIcon("rockCrushScissor.png");
                ImageIcon icon4 = new ImageIcon("scissorCutPaper.png");

                char compChoice = generateComputersChoice();
                char userChoice = enterPlayersChoice();

                message = "You choose " + translateCharacter(userChoice) + " and \n"+
                                 "the computer chose " + translateCharacter(compChoice) + "!\n";


                if(compChoice == userChoice)
                {
                    JOptionPane.showMessageDialog(null,message+"<html><h1>This is a tie<br></h1>.", "Rock, Paper, Scissor           Hemant Mahato", 1,icon1);
                    ties++;
                }
                else if(compChoice == 'r' &&  userChoice == 'p')
                {
                    JOptionPane.showMessageDialog(null,message+"<html><h1>Paper wraps rock<br></h1>"+"You win!.", "Rock, Paper, Scissor           Hemant Mahato", 1,icon2);
                    wins++;
                }
                else if(compChoice == 'p' &&  userChoice == 'r')
                {            
                    JOptionPane.showMessageDialog(null,message+"<html><h1>Paper wraps rock<br></h1>"+"Computer Wins", "Rock, Paper, Scissor           Hemant Mahato", 1,icon2);
                    losses++;
                }
                else if(compChoice == 's' &&  userChoice == 'r')
                {
                    JOptionPane.showMessageDialog(null,message+"<html><h1>Rock crushes scissor<br></h1>"+"You win!.", "Rock, Paper, Scissor           Hemant Mahato", 1,icon3);
                    wins++;
                }
                else if(compChoice == 'r' &&  userChoice == 's')
                {                
                    JOptionPane.showMessageDialog(null,message+"<html><h1>Rock crushes scissor<br></h1>"+"Computer Wins", "Rock, Paper, Scissor           Hemant Mahato", 1,icon3);
                    losses++;
                }
                else if(compChoice == 'p' &&  userChoice == 's')
                {
                    JOptionPane.showMessageDialog(null,message+"<html><h1>Scissor cuts paper<br></h1>"+"You win!.", "Rock, Paper, Scissor           Hemant Mahato", 1,icon4);
                    wins++;
                }
                else if(compChoice == 's' &&  userChoice == 'p')
                {
                    JOptionPane.showMessageDialog(null,message+"<html><h1>Scissor cuts paper<br></h1>"+"Computer Wins", "Rock, Paper, Scissor           Hemant Mahato", 1,icon4);
                    losses++;
                }
                counter++;
            }
            String message1 = "Final score board for "+numGames+" games\n";

            JOptionPane.showMessageDialog(null,message1+ "<html><h1>Wins : "+wins+"<br>Losses : "+losses+"<br>Ties : "+ties+"<br></h1>" , "Play(Rock, Paper, Scissor)           Hemant Mahato", 1,icon);

            JOptionPane.showMessageDialog(null,"<html><h1><br>*** Author :: Hemant Mahato  ***</h1>"+"***Program Terminating***","End of game          Hemant Mahato",1);
                 System.exit(0);
        }
    }
  
}   

