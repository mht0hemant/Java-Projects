/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 04/21/2021
 */
/***************************************************************************
 * Compilation : javac AdjMatrixGraph.java
 * Execution : java AdjMatrixGraph V E
 * Dependencies: StdOut.java
 * 
 * A graph, implemented using an adjacency matrix.
 * Parallel edges are disallowed; self-loops are allowed.
 * 
 ****************************************************************************/

package adjmatrixgraph;

import java.util.Scanner;
public class AdjMatrixGraph 
{
    private boolean adjMatrix[][];
    private int numVertices;

    public AdjMatrixGraph(int numVertices)
    {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    //Adds an edge
    public void addEdge(int i, int j)
    {
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    // removes an edge
    public void removeEdge(int i, int j)
    {
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    public boolean isEdge(int i, int j)
    {
        return adjMatrix[i][j];

    }

    public String toString()
    {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < numVertices; i++)
        {
            s.append(i + ": ");
            for(boolean j : adjMatrix[i])
            {
                s.append((j?1:0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the graph.");
        System.out.println("Please enter the positive integer only.");
        System.out.println("Enter the size here:");
        System.out.print("--> ");
        int size = sc.nextInt();
        System.out.print("\n");

        AdjMatrixGraph g = new AdjMatrixGraph(size);

        System.out.println("Please enter how many times would you like to take input edges.");
        System.out.println("Enter Positive number greater than 0.");
        System.out.print("--> ");
        int count = sc.nextInt();
        System.out.print("\n");
        while(count > 0)
        {
            System.out.println("Enter edges from 0 to " + (size - 1));
            System.out.println("Enter two numerical values separated by a space :--> ");
            int firstInput = sc.nextInt();
            int secondInput = sc.nextInt();

            if(firstInput < 0 || firstInput >= size || secondInput < 0 || secondInput >= size)
            {
                System.out.println("Invalid entry. Please Enter edges from 0 to " + (size - 1));
                System.out.println("Enter two numerical values separated by a space :--> ");
                firstInput = sc.nextInt();
                secondInput = sc.nextInt();
            }
            // add edges 
            g.addEdge(firstInput, secondInput);	
            count--;
        }
        System.out.println("The current matrix is: ");
        System.out.println(g.toString());
    }	
    // end of main
}	
// end of AdjMatrixGraph class
