/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LList_Mahato;

/**
 *
 * @author hemantmht0
 */
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
