/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 03/17/2021
 */

import java.util.ArrayList;
import java.util.Scanner;

/*Class BinaryTree */
public class MahatoBinaryTreeHeapClass
{
    public static void main(String[] args)
    {
        
        int index, temp, dex;
        /* Creating object of BT */
        BT bt = new BT();

        System.out.print("\n");  
        System.out.print("***************************************************\n");  


        System.out.println("Enter the required size of the array :: ");
        Scanner lineScan = new Scanner(System.in);
        int size = lineScan.nextInt();
        int myArray[] = new int [size];
        System.out.println("Enter the elements of the array one by one ");
        for(int i=0; i<size; i++)
        {
            myArray[i] = lineScan.nextInt();
        }
        lineScan.close();
        System.out.print("***************************************************\n");
        System.out.print("You entered: ");
        for(index = 0; index < size; index++)
        {
            System.out.print(myArray[index] + " ");
        }

        for(index = 0; index < size; index++)
        {  
            for(dex = index + 1; dex < size; dex++)
            {
                if (myArray[index] > myArray[dex]) 
                {
                    temp = myArray[index];
                    myArray[index] = myArray[dex];
                    myArray[dex] = temp;
                }
            }
        }
        int incr = 0;
        System.out.print("\n");
        for (index = size; index > 0; index--) 
        {

            System.out.print("Iteration " + (1+ incr) + ": " +myArray[size - index] + "\n");
            bt.insert(myArray[size - index]); 
            incr++;
        }
        System.out.print("\n***************************************************\n");
        System.out.print("Complete Sorted list: ");
        for (index = 0; index < size - 1; index++) 
        {
            System.out.print(myArray[index] + " ");
        }
        System.out.print(myArray[size - 1]);
        System.out.print("\n***************************************************\n");
           System.out.println("The Binary Tree Heap is ");
        try
        {
           for (index = 0; index <= size / 2; index++)
           {
                System.out.print("  PARENT : " + myArray[index]
                + " LEFT CHILD : " + myArray[2 * index + 1]
                + " RIGHT CHILD : " + myArray[2 * index + 2]);
                System.out.println();
           }
        }
        catch(IndexOutOfBoundsException ioe)
        {

        }
    }
}
	/***************************************/
	/********Class BTNode******************/
	/*************************************/
class BTNode
{
    BTNode left, right;
    char data;

    /* Constructor- no input */
    /*This code makes a node with no input for the data*/
    public BTNode()
    {
        left = null;
        right = null;
        data = '#';
    }
    /* Constructor - input */
    /* this code makes a node with n as the input for the data*/

    public BTNode(int n)
    {
        left = null;
        right = null;
        data = '#';
    }
    /* Function to set left node*/
    /* This code sets the left child's location*/
    public void setLeft(BTNode n)
    {
        left = n;
    }
    /* Function to set right node*/
    /* This code sets the right child's location*/
    public void setRight(BTNode n)
    {
        right = n;
    }
    /*Function to get the left node*/
    public BTNode getLeft()
    {
        return left;
    }
    /*Function to get the right node*/
    public BTNode getRight()
    {
        return right;
    }
    /*Function to set data to node*/
    public void setData(char d)
    {
        data = d;
    }
    /*function to get data from node*/
    public int getData()
    {
        return data;
    }
}	
/*End of the Node Class*/

/*Creating the Binary Tree Class and Functionality*/
/************************************************/
/****************** Class BT ********************/
/************************************************/
class BT
{
    /*Declares the root node*/
    private BTNode root;
    /*Constructor*/

    /*Creates an empty binary tree with no nodes*/
    public BT()
    {
        root = null;
    }
    /*Function to check if tree is empty*/
    public boolean isEmpty()
    {
        return root == null;
    }
    /*Function to insert data*/
    public void insert(int data)
    {
        /* Inserts data to the Node */
        root = insert(root, data);
    }
    /*Function to insert data recursively */
    private BTNode insert(BTNode node, int n)
    {
        if(node == null)
        {
            node = new BTNode(n);
        }
        else
        {
            if(node.getRight() == null)
            {
                node.right = insert(node.right, n);
            }
            else
            {
                node.left = insert(node.left, n);
            }
        }
        return node;
    }
    /* Function to count number of nodes*/
    public int countNodes()
    {
        return countNodes(root);
    }
    /*Function to count number of nodes recursively*/
    private int countNodes(BTNode r)
    {
        if(r == null)
        {
            return 0;
        }
        else
        {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    /*Function to search for an element*/
    public boolean search(int n)
    {
        return search(root, n);
    }
    /*Function to search for an element recursively*/
    private boolean search(BTNode r, int n)
    {
        if(r.getData() == n)
        {
            return true;
        }
        if(r.getLeft() != null)
        {
            if(search(r.getLeft(), n))
            {
                return true;
            }
        }
        if(r.getRight() != null)
        {
            if(search(r.getRight(), n))
            {
                return true;
            }
        }
        return false;
    }
}


