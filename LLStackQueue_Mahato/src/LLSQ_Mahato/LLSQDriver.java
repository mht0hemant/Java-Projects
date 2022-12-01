/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LLSQ_Mahato;

/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 02/03/2021 : Time: 5:00 pm CST
 */
import java.util.Scanner;

public class LLSQDriver 
{
    static int maxSize = 10;
    static String option;
    public static MahatoArrayStack MahatoStack;
    public static MahatoArrayQueue MahatoQueue;
    
    //Driver Code
    public static void main(String[] args)
    {
        /* Start with the empty list.*/
        SinglyLinkedListClass_Mahato SLListMahato = new SinglyLinkedListClass_Mahato();
        MahatoQueue = new MahatoArrayQueue(maxSize);
        MahatoStack = new MahatoArrayStack(maxSize);
        
        // Creating menu options for user to choose from
       System.out.print("---------------MAIN MENU---------------\n");
       System.out.print(" 1 - Use Stack\n");
       System.out.print(" 2 - Use Queue\n");
       System.out.print(" Enter any other number to exit program\n");
       System.out.print("---------------------------------------\n");
       System.out.print("Enter Here: --> ");
       
       Scanner lineScan = new Scanner(System.in);
       int mainMenuInput = lineScan.nextInt();
       
       System.out.print("\n");
       
       if (mainMenuInput <1 || mainMenuInput >2)
       {
          System.exit(0);
       }
       else
       {
            while(mainMenuInput == 1 || mainMenuInput == 2)
           {
               if (mainMenuInput == 1)
                   option = "STACK";
               if (mainMenuInput == 2)
                   option = "QUEUE";
               
               
               System.out.print("---------------EDIT "+option+" MENU---------------\n");
               System.out.print(" 1 - Add to "+ option +"\n");
               System.out.print(" 2 - Remove from "+ option +"\n");
               System.out.print(" 3 - (Peek) View first value from "+ option +"\n");
               System.out.print(" 4 - Clear "+ option +"\n");
               System.out.print(" 5 - Print "+option+"\n");
               System.out.print(" 6 - Go back to MAIN MENU\n");
               System.out.print("--------------------------------------------------\n");
               System.out.print("Enter Here: --> ");
               int secMenuInput = lineScan.nextInt();
               System.out.print("\n");
               
               //if(secMenuInput >= 1 && secMenuInput <=5)
               while(secMenuInput != 6)
               {
                   switch (secMenuInput)
                   {
                       
                       case 1:
                           System.out.print(" Enter any integer you want to add to the "+option+"\n");
                           System.out.print("Enter Here: --> ");
                           
                           long valueInput = lineScan.nextLong();
                           
                           System.out.print("\n");
                           System.out.print(option+" after adding\n");
                           
                           if (mainMenuInput == 1)
                           {
                               try
                               {
                                   MahatoStack.push(valueInput);
                               }
                               catch(IndexOutOfBoundsException e)
                               {

                               }
                               
                               print(MahatoStack.stackArray, 1);
                               System.out.print("\n");
                               maxSize = maxSize +1;
                           }
                           if (mainMenuInput == 2)
                           {
                               try
                               {
                                   MahatoQueue.enqueue(valueInput);
                               }
                               catch(IndexOutOfBoundsException e)
                               {

                               }
                               maxSize++;
                               print(MahatoQueue.theArray, 2);
                               System.out.print("\n");
                           }
                           System.out.print("---------------EDIT "+option+" MENU---------------\n");
                           System.out.print(" 1 - Add to "+ option +"\n");
                           System.out.print(" 2 - Remove from "+ option +"\n");
                           System.out.print(" 3 - (Peek) View first value from "+ option +"\n");
                           System.out.print(" 4 - Clear "+ option +"\n");
                           System.out.print(" 5 - Print "+option+"\n");
                           System.out.print(" 6 - Go back to MAIN MENU\n");
                           System.out.print("--------------------------------------------------\n");
                           System.out.print("Enter Here: --> ");
                           secMenuInput = lineScan.nextInt();
                           System.out.print("\n");
                           break;
                           
                       case 2:
                           System.out.print(option+" after removing\n");
                           if (mainMenuInput ==1)
                           {
                               MahatoStack.pop();
                               print(MahatoStack.stackArray, 1);
                               System.out.print("\n");
                           }
                           if (mainMenuInput ==2)
                           {
                               MahatoQueue.dequeue();
                               print(MahatoQueue.theArray, 2);
                               System.out.print("\n");
                           }
                           System.out.print("---------------EDIT "+option+" MENU---------------\n");
                           System.out.print(" 1 - Add to "+ option +"\n");
                           System.out.print(" 2 - Remove from "+ option +"\n");
                           System.out.print(" 3 - (Peek) View first value from "+ option +"\n");
                           System.out.print(" 4 - Clear "+ option +"\n");
                           System.out.print(" 5 - Print "+option+"\n");
                           System.out.print(" 6 - Go back to MAIN MENU\n");
                           System.out.print("--------------------------------------------------\n");
                           System.out.print("Enter Here: --> ");
                           secMenuInput = lineScan.nextInt();
                           System.out.print("\n");
                           break;
                           
                       case 3:
                           if (mainMenuInput ==1)
                           {
                                System.out.print(MahatoStack.peek());
                                System.out.print("\n");
                           }
                           if (mainMenuInput ==2)
                           {
                                 System.out.print(MahatoQueue.peek());
                                 System.out.print("\n");
                           }
                           System.out.print("---------------EDIT "+option+" MENU---------------\n");
                           System.out.print(" 1 - Add to "+ option +"\n");
                           System.out.print(" 2 - Remove from "+ option +"\n");
                           System.out.print(" 3 - (Peek) View first value from "+ option +"\n");
                           System.out.print(" 4 - Clear "+ option +"\n");
                           System.out.print(" 5 - Print "+option+"\n");
                           System.out.print(" 6 - Go back to MAIN MENU\n");
                           System.out.print("--------------------------------------------------\n");
                           System.out.print("Enter Here: --> ");
                           secMenuInput = lineScan.nextInt();
                           System.out.print("\n");
                           break;
                           
                       case 4:
                           if (mainMenuInput ==1)
                                MahatoStack.makeEmpty();
                           if (mainMenuInput ==2)
                                MahatoStack.makeEmpty();
                           System.out.print("---------------EDIT "+option+" MENU---------------\n");
                           System.out.print(" 1 - Add to "+ option +"\n");
                           System.out.print(" 2 - Remove from "+ option +"\n");
                           System.out.print(" 3 - (Peek) View first value from "+ option +"\n");
                           System.out.print(" 4 - Clear "+ option +"\n");
                           System.out.print(" 5 - Print "+option+"\n");
                           System.out.print(" 6 - Go back to MAIN MENU\n");
                           System.out.print("--------------------------------------------------\n");
                           System.out.print("Enter Here: --> ");
                           secMenuInput = lineScan.nextInt();
                           System.out.print("\n");
                           break;
                           
                       case 5:
                           if (mainMenuInput ==1)
                           {
                                print(MahatoStack.stackArray, 1);
                                System.out.print("\n");
                           }
                           
                           if (mainMenuInput ==2)
                           {
                                print(MahatoQueue.theArray, 2);
                                System.out.print("\n");
                           }
                           System.out.print("---------------EDIT "+option+" MENU---------------\n");
                           System.out.print(" 1 - Add to "+ option +"\n");
                           System.out.print(" 2 - Remove from "+ option +"\n");
                           System.out.print(" 3 - (Peek) View first value from "+ option +"\n");
                           System.out.print(" 4 - Clear "+ option +"\n");
                           System.out.print(" 5 - Print "+option+"\n");
                           System.out.print(" 6 - Go back to MAIN MENU\n");
                           System.out.print("--------------------------------------------------\n");
                           System.out.print("Enter Here: --> ");
                           secMenuInput = lineScan.nextInt();
                           System.out.print("\n");
                           break;
                   }
               }
               
               System.out.print("---------------MAIN MENU---------------\n");
               System.out.print(" 1 - Use Stack\n");
               System.out.print(" 2 - Use Queue\n");
               System.out.print(" Enter any other number to exit program\n");
               System.out.print("---------------------------------------\n");
               System.out.print("Enter Here: --> ");
               mainMenuInput = lineScan.nextInt();
               System.out.print("\n");
           }
       }
    }
    
    public static void print(long[] a, int x)
    {
        int enteredValue = x;
        /** Switching for user input. */
        switch (enteredValue)
        {
            case 1:/** For  stacks. */     
                try
                {
                    for (int index = 0; index < maxSize+1; index++)
                    {
                        System.out.print("  "+a[index] + "       ");
                          
                    }
                    maxSize = maxSize+1;
                }
                catch(IndexOutOfBoundsException e)
                {
                    
                }
                break;                 
                
            case 2: /** For queues. */ 
                try
                {
                    for (int index = 0; index < maxSize; index++)
                    {
                        System.out.print("  "+a[index] + "       ");
                    }
                }
                catch(IndexOutOfBoundsException e)
                {

                }
                break;                    
        }
                
    }
       
}
