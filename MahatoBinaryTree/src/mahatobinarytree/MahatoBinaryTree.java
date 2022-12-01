/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 03/17/2021
 */
package mahatobinarytree;

import java.util.Scanner;

/*Class BinaryTree */
public class MahatoBinaryTree
{
    public static void main(String[] args)
    {
        Scanner lineScan = new Scanner(System.in);
        
        /* Creating object of BT */
        BT bt = new BT();

        System.out.print("Please choose from the following:\n\n");
        System.out.print("Please Enter 1 to insert node into the tree.\n");
        System.out.print("Please Enter 2 to perform search into the tree.\n");
        System.out.print("Please Enter 3 to count the nodes in the tree.\n");
        System.out.print("Please Enter 4 to check if the tree is empty or not.\n");
        System.out.print("Please Enter 5 to quit and exit from the program.\n");
        System.out.print("--> ");  
        
        int option = lineScan.nextInt();
        
        System.out.print("\n");  
        System.out.print("***************************************************\n");  

        while (option != 5)
        {
            switch(option)
            {
                case 1:
                    System.out.print("Please Enter the alphabet one at a time to insert:--> ");
                    char newNode = lineScan.next().charAt(0);
                    
                    bt.insert(newNode);
                    
                    
                        
                    System.out.print(newNode +" " + " is successfully inserted into the tree.\n");
                    int currentTotalNode = bt.countNodes();
                    System.out.print("Current total node = "+ " " + currentTotalNode +"\n");
                    System.out.print("***************************************************\n");
                    break;
                    
                case 2:
                    if(bt.isEmpty() == false)
                    {
                        System.out.print("Please Enter the alphabet you would like to search:--> ");
                        char searchChar = lineScan.next().charAt(0);
                        System.out.print("***************************************************\n");
                        
                        if(bt.search(searchChar) == true)
                        {
                            System.out.print("" + searchChar +" "+"is in the tree.\n");
                            System.out.print("***************************************************\n");
                        }
                        else 
                        {
                            System.out.print(searchChar + " "+ "is not in the tree.\n");
                            System.out.print("***************************************************\n");
                        }
                    }
                    else
                    {
                        System.out.print("The tree is empty, please perform insertion operation.\n");
                        System.out.print("***************************************************\n");
                    }
                    break;
                    
                case 3:
                    currentTotalNode = bt.countNodes();
                    System.out.print("The number of total nodes = "+ " "+currentTotalNode +"\n");
                    System.out.print("***************************************************\n");
                    break;
                    
                case 4:
                    
                    if(bt.isEmpty() == true)
                    {
                        System.out.print("The tree is empty.\n");
                        System.out.print("***************************************************\n");
                    }
                    else
                    {
                        System.out.print("-->The tree is not  empty.\n");
                        System.out.print("-->There are"+ " " + bt.countNodes() + " "+" nodes in tree\n");
                        System.out.print("***************************************************\n");
                    }
                    break;

                default:
                    System.out.print("Invalid choice. Please enter valid choice.\n");
                    System.out.print("***************************************************\n");
                    break;
            }
            System.out.print("***************************************************\n");
            System.out.print("\nPlease choose from the following:\n\n");
            System.out.print("Please Enter 1 to insert node into the tree.\n");
            System.out.print("Please Enter 2 to perform search into the tree.\n");
            System.out.print("Please Enter 3 to count the nodes in the tree.\n");
            System.out.print("Please Enter 4 to check if the tree is empty or not.\n");
            System.out.print("Please Enter 5 to quit and exit from the program.\n\n");
            System.out.print("--> ");

            option = lineScan.nextInt();
            
            System.out.print("\n");
            System.out.print("***************************************************\n");
        }
        System.out.print("Thank You for using the program. The program is ending.\n");
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

    public BTNode(char n)
    {
        left = null;
        right = null;
        data = n;
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
    public void insert(char data)
    {
        /* Inserts data to the Node */
        root = insert(root, data);
    }
    /*Function to insert data recursively */
    private BTNode insert(BTNode node, char n)
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
    public boolean search(char n)
    {
        return search(root, n);
    }
    /*Function to search for an element recursively*/
    private boolean search(BTNode r, char n)
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


