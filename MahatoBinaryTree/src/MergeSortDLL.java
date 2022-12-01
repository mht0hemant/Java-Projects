/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 03/17/2021
 */
public class MergeSortDLL 
{
    //Java progrm to implement merge sort in doubly linked list
    
    //head of list
    static Node head;
    
    //Node Class
    static class Node
    {
        int data;
        Node next, prev;
        
        //Constructor to create a new node
        Node(int d)
        {
            data = d;
            next = prev = null;
        }
       
    }
    //Driver program to test functions
    public static void main(String[] args)
     {
        Node node = null;
        MergeSortDLL list = new MergeSortDLL();
        MergeSortDLL.head = new Node(9);
        MergeSortDLL.head.next = new Node(14);
        MergeSortDLL.head.next.next = new Node(55);
        MergeSortDLL.head.next.next.next = new Node(33);
        MergeSortDLL.head.next.next.next.next = new Node(45);
        MergeSortDLL.head.next.next.next.next.next = new Node(10);
        
      
        node = list.mergeSort(head);
        System.out.println("Linked list after sorting:");
        list.print(node);
    }
    //To print the nodes
    void print(Node node)
    {
        Node temp = node;
        System.out.println("Forward Traversal using next pointer ");
        while(node != null)
        {
            System.out.print(node.data + " ");
            temp = node;
            node = node.next;
        }
        System.out.println("\n");
        System.out.println("Backward Traversal using prev pointer ");
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
    //Split a doubly linkled list(DDL) into 2 DLLs of half sizes
    Node split(Node node)
    {
        Node fast = head,slow = head;
        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }
    Node mergeSort(Node node)
    {
        if(node == null||node.next == null)
        {
            return node;
        }
        Node second;
        second = split(node);
        //Recursive for left and right halves
        node = mergeSort(node);
        
        second = mergeSort(second);
        
        //Merge the two sorted halves
        return merge(node, second);
    }
    //Function to merge two linked lists
    Node merge(Node first, Node second)
    {
        //If first linked list is empty
        if(first == null)
        {
            return second;
        }
        //If second linked list is empty
        if(second == null)
        {
            return first;
        }
        //Pick the smaller value
        if(first.data < second.data)
        {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        }
        else
        {
            second.next=merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }
}
