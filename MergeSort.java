/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 03/17/2021
 */import java.util.Scanner;
public class MergeSort 
{
    //Driver method
    public static void main(String  args[])
    {  
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        
        int value = in.nextInt();
        int arr[] = new int[value];
        
        System.out.println("Enter positive values and make sure that the total");
        System.out.println("number of values is less than or equal to the size you entered");
        
        for(int index=0; index<value; index++)
        {
            arr[index] = in.nextInt();
        }
        System.out.println("Given Array is:-->  ");
        printArray(arr);
        
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
        
        System.out.println("\nSorted array is:-->   ");
        printArray(arr);
    }
    //marge
    void merge(int arr[], int l, int m, int r)
    {
        //Find size of two sub arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        
        //Create temp arrays
        
        int L[] = new int [n1];
        int R[] = new int[n2];
        
        /*Copy data to temp arrays*/
        for(int i = 0; i < n1; ++i)
        {
            L[i] = arr[l + i];
        }
        for(int j=0; j < n2; ++j)
        {
            R[j] = arr[m + 1 + j];
        }
        
        //Merge the temp arrays
        //Initial index of first and second sub arrays
        
        int i = 0,j = 0 ;
        
        //Initial index of merged sub array array
        int k = l; 
        while(i < n1 && j < n2)
        {
            if(L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++; 
            }
            k++;
        }
        //Copy remaining elements of L[] if any
        while(i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        //Copy remaining elements of R[] if any
        while(j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
          
    }
    void sort(int arr[],int l,int r)
    {
        if(l < r)
        {
            //Find the middle point
            int m =(l + r) / 2;
            
            //sort first and second halves
            sort(arr,l,m);
            sort(arr, m + 1, r);
            
            //Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for(int index=0; index<n; ++index)
        {
            System.out.print(arr[index] + " ");
        }
        System.out.print("\n");
    }
}