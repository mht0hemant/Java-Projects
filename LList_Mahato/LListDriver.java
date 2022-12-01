/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LList_Mahato;

import java.util.Scanner;

/**
 *
 * @author hemantmht0
 */
public class LListDriver 
{
    
    //Driver Code
    public static void main(String[] args)
    {
        /* Start with the empty list.*/
        SinglyLinkedListClass_Mahato SLListMahato = new SinglyLinkedListClass_Mahato();
        
        // Creating menu options for user to choose from
       System.out.print("----------------MENU---------------\n");
       System.out.print(" 1 - Print list\n");
       System.out.print(" 2 - Add to tail of list\n");
       System.out.print(" 3 - Add at location i\n");
       System.out.print(" 4 - Remove from tail of list\n");
       System.out.print(" 5 - Remove at location i\n");
       System.out.print(" 6 - Cancel and exit the program\n");
       System.out.print("----------------MENU---------------\n");
       System.out.print("Enter numerical values from 1 to 6.\n");
       System.out.print("--> ");
       
       Scanner input = new Scanner(System.in);
       int intInput = input.nextInt();
       System.out.print("\n");
       
       switch(intInput)
       {
           case 1:
               // Print the linkedList
               SinglyLinkedListClass_Mahato.printList(SLListMahato);
               break;
               
           case 2:
               //adding user input string to the tail of the list
               System.out.print("Enter the text you want to add to the list\n");
               System.out.print("--> ");
               String stringInput = input.next();
               System.out.print("\n");
               SLListMahato = SinglyLinkedListClass_Mahato.insert(SLListMahato, stringInput);
               break;
               
               
           case 3:
               break;
               
           case 4:
               break;
               
           case 5:
               break;
               
           case 6:
               System.out.print("--------YOU CHOSE TO EXIT THE PROGRAM--------\n");
               System.out.print("-----------------EXITING NOW-----------------\n");
               System.exit(0);
               break;
       }
        // Insert Values
        SLListMahato = SinglyLinkedListClass_Mahato.insert(SLListMahato, "a");
        
        
        
    }
}
