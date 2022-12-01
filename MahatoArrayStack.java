/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 02/01/2021
 */
package SQ_Mahato;

public class MahatoArrayStack 
{
    int maxSize;
    long[] stackArray;
    int top;
    
    /** Constructor for the class to create the stack. */
    public MahatoArrayStack(int s)
    {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    /** To add values to the array one after the other. */
    public void push(long j)throws IndexOutOfBoundsException
    {
        if ( isFull() )
        {
            throw new IndexOutOfBoundsException();
        }
        stackArray[++top] = j;
    }
    /** To remove values from the array starting from the bottom. */
    public long pop() 
    {
        return stackArray[top--];  
    }
    /** To view the top element of the array. */
    public long peek() 
    {
        return stackArray[top];
    }
    /** To check  if the array is empty before adding values. */
    public boolean isEmpty() 
    {
        return (top == -1);
    }
    /** To check if the array is full. */
    public boolean isFull() 
    {
        return (top == maxSize -1);
    }
    
}
