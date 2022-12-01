/*
 /*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 03/11/2021
 */

import java.util.Scanner;

public class MaxMinHeap_Mahato 
{
    private int[] MahatoMinHeap;
    private int[] MahatoMaxHeap;
    private int size;
    private int maxsize;
    private static int minOrMax = 0;
    private static int heapSize = 0;
    private static final int HEAD = 1;
    
    //Driver code
    public static void main(String args[])
    { 
        // Implementing scanner class for user to give commands
        Scanner input = new Scanner(System.in);
        
        System.out.print("What heap do you want to use?\n");
        System.out.print("  Enter --> 1 to use Min Heap\n");
        System.out.print("  or    --> 2 to use Max Heap\n");
        System.out.print("--> ");
        
        // Options input for min or max heap
        minOrMax = input.nextInt();
      
        System.out.print("\n");
        
        System.out.print("What size do you want the heap to be?\n");
        System.out.print("   Enter --> Heap size in numbers\n");
        System.out.print("--> ");
        
        // Options input for size of heap
        heapSize = input. nextInt();
        
        // Define an instance of the heap
        MaxMinHeap_Mahato mahatoHeap = new MaxMinHeap_Mahato(heapSize);
 
        System.out.print("\n");
        System.out.print("Enter the numbers corresponding to the commands\n");
        System.out.print("   Make a new heap      --> 1\n");
        System.out.print("   Add to the Heap      --> 2\n");
        System.out.print("   Remove from the Heap --> 3\n");
        System.out.print("   Print the heap       --> 4\n");
        System.out.print("   Exit the program     --> 5\n");
        System.out.print("--> ");
        
        int editOptions = input.nextInt();
        
        System.out.print("\n");
        
        while (editOptions != 100)
        {
            switch(editOptions)
            {
                case 1:
                   int[] MahatoMinHeap = null;
                   int[] MahatoMaxHeap = null;
                    break;

                case 2:
                    System.out.print("What data do you want to insert?\n");
                    System.out.print("   Enter --> Data in numbers\n");
                    System.out.print("--> ");

                    int data = input.nextInt();

                    System.out.print("\n");

                    if(minOrMax == 1)
                        mahatoHeap.insertInMinHeap(data);
                    else if(minOrMax == 2)
                        mahatoHeap.insertInMaxHeap(data);
                    break;

                case 3:
                    if(minOrMax == 1)
                    {
                        int removed = mahatoHeap.remove(minOrMax);
                        int removed1 = mahatoHeap.removeElement(2,1);
                        int removed2 = mahatoHeap.removeElement(5,1);
                        mahatoHeap.remove(minOrMax);
                        System.out.print(removed +", "+ removed1 +", " + removed2 + " was removed.\n");
                    }
                    else if(minOrMax == 2)
                    {
                        int removed = mahatoHeap.remove(minOrMax);
                        int removed1 = mahatoHeap.removeElement(4,2);
                        int removed2 = mahatoHeap.removeElement(7,2);
                        mahatoHeap.remove(minOrMax);
                        System.out.print(removed +", "+ removed1 +", " + removed2 + " was removed.\n");
                    }
                    break;

                case 4:
                    if(minOrMax == 1)
                        mahatoHeap.print(minOrMax);
                    else if(minOrMax == 2)
                        mahatoHeap.print(minOrMax);
                    break;

                case 5:
                    if(minOrMax == 1)
                    {
                        mahatoHeap.print(minOrMax);
                        System.out.print("The Current Minimum is " + mahatoHeap.MahatoMinHeap[1] + "\n\n");
                    }
                    else if(minOrMax == 2)
                    {
                        mahatoHeap.print(minOrMax);
                        System.out.print("The Current Maximum is " + mahatoHeap.MahatoMaxHeap[heapSize - 1] + "\n\n");
                    }
                    System.exit(0);
                    break;

                default:
                    System.out.print("Please enter numbers from 1-5. Any other numbers will not work.\n\n");
            }
            System.out.print("Enter the numbers corresponding to the commands\n");
            System.out.print("   Make a new heap      --> 1\n");
            System.out.print("   Add to the Heap      --> 2\n");
            System.out.print("   Remove from the Heap --> 3\n");
            System.out.print("   Print the heap       --> 4\n");
            System.out.print("   Exit the program     --> 5\n");
            System.out.print("--> ");

            editOptions = input.nextInt();

            System.out.print("\n");
        }
    }
    
    public MaxMinHeap_Mahato(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        MahatoMinHeap = new int[this.maxsize +1];
        MahatoMinHeap[0] = Integer.MIN_VALUE;
        MahatoMaxHeap = new int[this.maxsize +1];
        MahatoMaxHeap[0] = Integer.MAX_VALUE;
    }
    
    // Function to return the position of
    // the parent for the node currently
    // at pos
    private int parent(int pos)
    {
        return pos / 2;
    }
    
    // Function to return the position of the
    // left child for the node currently at pos
    private int leftChild(int pos)
    {
        return (2 * pos);
    }
    
    // Function to return the position of the
    // right child for the node currently at pos
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
    
    // Function to return true if the passed
    // node is a leaf node
    private boolean isLeaf(int pos)
    {
        if (pos >= (size /2) && pos <= size)
        {
            return true;
        }
        return false;
    }
    
    // Function to swap two nodes of the heap
    private void swap(int fpos, int spos, int option)
    {
        int tmp;
        switch (option)
       {
           case 1:
                tmp = MahatoMinHeap[fpos];
                MahatoMinHeap[fpos] = MahatoMinHeap[spos];
                MahatoMinHeap[spos] = tmp;
                break;
               
           case 2:
                tmp = MahatoMaxHeap[fpos];
                MahatoMaxHeap[fpos] = MahatoMaxHeap[spos];
                MahatoMaxHeap[spos] = tmp;
               break;
       }
        
    }
    
    // Function to heapify he node at pos
    private void minHeapify(int pos)
    {
        // If the node is non-leaf node and greater
        // than any of its child
        if (!isLeaf(pos))
        {
            if (MahatoMinHeap[pos] > MahatoMinHeap[leftChild(pos)] 
                || MahatoMinHeap[pos] > MahatoMinHeap[rightChild(pos)])
            {
                // Swap with the left child anad heapify
                // the left child
                if (MahatoMinHeap[leftChild(pos)] < MahatoMinHeap[rightChild(pos)])
                {
                    swap(pos, leftChild(pos), 1);
                    minHeapify(leftChild(pos));
                }
                
                // Swap with the right child and heapify
                // the right child
                else
                {
                    swap(pos, rightChild(pos), 1);
                    minHeapify(rightChild(pos));
                }
            }
        }
    }
    
    // Function to heapify he node at pos
    private void maxHeapify(int pos)
    {
        // If the node is non-leaf node and greater
        // than any of its child
        if (!isLeaf(pos))
        {
            if (MahatoMaxHeap[pos] < MahatoMaxHeap[leftChild(pos)] 
                || MahatoMaxHeap[pos] < MahatoMaxHeap[rightChild(pos)])
            {
                // Swap with the left child anad heapify
                // the left child
                if (MahatoMaxHeap[leftChild(pos)] > MahatoMaxHeap[rightChild(pos)])
                {
                    swap(pos, leftChild(pos), 2);
                    maxHeapify(leftChild(pos));
                }
                
                // Swap with the right child and heapify
                // the right child
                else
                {
                    swap(pos, rightChild(pos), 2);
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }
    
    // Function to insert a node into the min-heap
    private void insertInMinHeap(int element)
    {
        if (size >= maxsize)
        {
            return;
        }
        MahatoMinHeap[++size] = element;
        int current = size;
        
        while (MahatoMinHeap[current] < MahatoMinHeap[parent(current)])
        {
            swap(current, parent(current), 1);
            current = parent(current);
        }
    }
    
    // Function to insert a node into the max-heap
    private void insertInMaxHeap(int element)
    {
        if (size >= maxsize)
        {
            return;
        }
        MahatoMaxHeap[++size] = element;
        int current = size;
        
        while (MahatoMaxHeap[current] > MahatoMaxHeap[parent(current)])
        {
            swap(current, parent(current), 2);
            current = parent(current);
        }
    }
    
    // Function to print the contents of the heap
    private void print(int option)
    {
       switch (option)
       {
           case 1:
               System.out.println("The Min Heap is ");
               for (int index = 1; index <= size / 2; index++)
               {
                    System.out.print("  PARENT : " + MahatoMinHeap[index]
                    + " LEFT CHILD : " + MahatoMinHeap[2 * index]
                    + " RIGHT CHILD : " + MahatoMinHeap[2 * index + 1]);
                    System.out.println();
               }
               break;
               
           case 2:
               System.out.println("The Max Heap is ");
               for (int index = 1; index <= size / 2; index++)
               {
                    System.out.print("  PARENT : " + MahatoMaxHeap[index]
                    + " LEFT CHILD : " + MahatoMaxHeap[2 * index]
                    + " RIGHT CHILD : " + MahatoMaxHeap[2 * index + 1]);
                    System.out.println();
               }
               break;
       }
    }
    
    // Function to build the min heap using 
    // the minHeapify
    public void minHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--)
        {
            minHeapify(pos);
        }
    }
    // Function to build the max heap using 
    // the minHeapify
    public void maxHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--)
        {
            maxHeapify(pos);
        }
    }
    
    // Function to remove and return the minimum
    // element from the  heap
    public int remove(int option)
    {
        int popped = 0;
        switch (option)
       {
           case 1:
                popped = MahatoMinHeap[HEAD];
                MahatoMinHeap[HEAD] = MahatoMinHeap[size--];
                minHeapify(HEAD);
                break;
               
           case 2:
                popped = MahatoMaxHeap[HEAD];
                MahatoMaxHeap[HEAD] = MahatoMaxHeap[size--];
                maxHeapify(HEAD);
               break;
       }
       return popped;
    }
    public int removeElement(int element, int option)
    {
        int popped = 0;
        switch (option)
       {
           case 1:
                popped = MahatoMinHeap[element];
                MahatoMinHeap[HEAD] = MahatoMinHeap[size--];
                minHeapify(HEAD);
                break;
               
           case 2:
                popped = MahatoMaxHeap[element];
                MahatoMaxHeap[HEAD] = MahatoMaxHeap[size--];
                maxHeapify(HEAD);
               break;
       }
        return popped;
    }
    
}
        