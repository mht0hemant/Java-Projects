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
        if ( position == 0)
        {
            //int pos = Integer.parseInt(position);
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
        }
        
        // if position is 1 then new node is
        // set infornt of head node
        // head node is changing.
        if (position == 1) 
        {
            Node.listNode curNode = new Node.listNode(data);
            curNode.next = SLListMahato.head;
            new_node = curNode;
        } 
        else 
        {
            while (position-- != 0) {
                if (position == 1) {
                    // adding Node at required position
                    Node newNode = GetNode(data);
 
                    // Making the new Node to point to
                    // the old Node at the same position
                    newNode.nextNode = headNode.nextNode;
 
                    // Replacing current with new Node
                    // to the old Node to point to the new Node
                    headNode.nextNode = newNode;
                    break;
                }
                headNode = headNode.nextNode;
            }
            if (position != 1)
                System.out.print("Position out of range");
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
