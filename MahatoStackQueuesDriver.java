/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 02/01/2021
 */
package SQ_Mahato;

import java.util.*;

public class MahatoStackQueuesDriver 
{
    private static int maxSize = 10;
    public static MahatoArrayStack MahatoStack;
    public static MahatoArrayQueue MahatoQueue;
    
    /** Creating the main function to add/remove values to stack/queue and print it. */
    public static void main(String[] args)
    {
        MahatoQueue = new MahatoArrayQueue(maxSize);
        try
        {
            for (int index = 0; index < maxSize+1; index++)
            {
                MahatoQueue.enqueue(1001+index);
            }
        }
        catch(IndexOutOfBoundsException e)
        {
            
        }
        
        MahatoStack = new MahatoArrayStack(maxSize);
        try
        {
            for (int index = 0; index < maxSize+1; index++)
            {
                MahatoStack.push(1001+index);
            }
        }
        catch(IndexOutOfBoundsException e)
        {
            
        }
        
        
        
        
        System.out.print("If you want to print Stack, enter 1\n");
        System.out.print("If you want to print Queue, enter 2\n");
        System.out.print("Enter Here --> ");
        Scanner input = new Scanner(System.in);
        int inputValue = input.nextInt();
        System.out.print("\n");
        
        /** Switching user input values to use stack or queue . */
        switch (inputValue)
        {
            case 1:
                print(MahatoStack.stackArray, 1);
                break;
                
            case 2:
                print(MahatoQueue.theArray, 2);
                break;
        }
        
    }
    /** Creating print function to print and remove each element of stack/queue. */
    public static void print(long[] a, int x)
    {
        int enteredValue = x;
        /** Switching for user input. */
        switch (enteredValue)
        {
            case 1:/** For  stacks. */
                System.out.print("Printing Stack :\n");
                System.out.print("Adding     Removing\n");
                try
                {
                    for (int index = 0; index < maxSize+1; index++)
                    {
                        System.out.print("  "+a[index] + "       ");
                        System.out.print("  "+MahatoStack.pop()+" \n");  
                    }
                }
                catch(IndexOutOfBoundsException e)
                {

                }
                break;
                
            case 2: /** For queues. */
                System.out.print("Printing Queue :\n");
                System.out.print("Printing Stack :\n");
                System.out.print("Adding     Removing\n");
                try
                {
                    for (int index = 0; index < maxSize; index++)
                    {
                        System.out.print("  "+a[index] + "       ");
                        System.out.println("  "+MahatoQueue.dequeue()+" \n"); 
                    }
                }
                catch(IndexOutOfBoundsException e)
                {

                }
                break;
        }
    }
        
}
