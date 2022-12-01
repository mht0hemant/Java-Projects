/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 02/03/2021 : Time: 5:00 pm CST
 */
package LLSQ_Mahato;

public class Node 
{
    // Linked List Node.
    // This inner class is namde static
    // so that main() can access it
    
    static class listNode 
    {
        String data;
        listNode next;
        
        // Constructor
        listNode(String d)
        {
            data = d;
            next = null;
        }
    }
    
}
