/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 02/03/2021 : Time: 5:00 pm CST
 */
package LLSQ_Mahato;

public class SinglyLinkedListClass_Mahato 
{ 
    // head of the list
    Node.listNode head;
    
    // Method to insert a new node
    public static SinglyLinkedListClass_Mahato
    insert (SinglyLinkedListClass_Mahato SLListMahato,int position, String data)
    { 
        //Create a new node with given data
        Node.listNode new_node = new Node.listNode(data);
        new_node.next = null;
        
        //If the lnked List is empty,
        // then make the new node as head

        if (SLListMahato.head == null)
        {
            SLListMahato.head = new_node;
        }
        else 
        {
            // Else traverse till last node
            // and insert the new_node there
            Node.listNode last = SLListMahato.head;
            while (last.next != null)
            {
                last = last.next;
            }
            
            // Insert the new_node at the last node
            last.next = new_node;
        }

        // Return List by Head
        return SLListMahato;
    }
    
    //Method to print the LinkedList
    public static void printList(SinglyLinkedListClass_Mahato SLListMahato)
    {
        Node.listNode currNode = SLListMahato.head;
        System.out.print("Mahato's Linked List: ");
        
        //Traverse through the LinkedList
        while (currNode != null)
        {
            //Print the data at current node
            System.out.print(currNode.data + " ");
            
            //Go to next node
            currNode = currNode.next;
        }  
    } 
}
