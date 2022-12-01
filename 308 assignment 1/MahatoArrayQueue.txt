/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 02/01/2021
 */
package SQ_Mahato;

public class MahatoArrayQueue 
{
    static long[]   theArray; /** static because main can access it. */
    private int      currentSize;
    private int      front;
    private int      back;
    static final int DEFAULT_CAPACITY = 10;
    
    /** Construct  the queue. */
    public   MahatoArrayQueue()
    {
        this(DEFAULT_CAPACITY);
    }
    /** Construct the queue. */
    public MahatoArrayQueue (int capacity)
    {
        theArray = new long[capacity];
        makeEmpty();
    }
    /** To add next element to the array before the previous array. */
    public void enqueue( long x) throws IndexOutOfBoundsException
    {
        if ( isFull() )
        {
            throw new IndexOutOfBoundsException();
        }
        back = increment( back );
        theArray[ back ] = x;
        currentSize++;
    }
    /** To return the first value of the array. */
    public long peek() 
    {
        return theArray[ front ];
    }
    /** To remove values from the array. */
    public long dequeue( )
    {
        currentSize--;
        
        long frontItem = theArray[ front ];
        theArray[ front ] = 0;
        front = increment ( front );
        return frontItem;
    }
    /** To check if the array is empty. */
    public boolean isEmpty( )
    {
        return currentSize == 0;
    }
    /** To empty the array. */
    public void makeEmpty( )
    {
        currentSize = 0;
        front = 0;
        back = -1;
    }
    /** To get the first value fo the array. */
    public long getFront( )
    {
        return theArray [ front ];
    }
    /** To check if the array is full while adding new data. */
    public boolean isFull( )
    {
        return currentSize == theArray.length;
    }
    /** To not go beyond array size. */
    private int increment ( int x)
    {
        if( ++x == theArray.length)
        {
            x = 0;
        }
        return x;
    }
}

