/*
 * Name: Hemant Mahato
 * Class: ADV DATA STRUCTURS,ALGORTHMS I/ CSCI 308/ 21S CSCI308-WHA/ SPRING 2021
 * Date: 03/24/2021
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashMaps308_Mahato 
{
    public static void main(String args[])
    {
        //This is how we declare HashMap
        HashMap<Integer, String> HashMap308_Mahato = new HashMap<>();
        
        //Adding elements to the HashMap
        //let's add 13 One Piece Characters as elements in HashMap 
        HashMap308_Mahato.put(1,"Luffy");
        HashMap308_Mahato.put(2," Zoro");
        HashMap308_Mahato.put(3,"Ussop");
        HashMap308_Mahato.put(4,"Sanji");
        HashMap308_Mahato.put(5,"Nami");
        HashMap308_Mahato.put(6, "Chopper");
        HashMap308_Mahato.put(7, "Robin");
        HashMap308_Mahato.put(8,"Franky");
        HashMap308_Mahato.put(9, "Brook");
        HashMap308_Mahato.put(10,"Shanks");
        HashMap308_Mahato.put(11, "Ace");
        HashMap308_Mahato.put(12,"Roger");
        HashMap308_Mahato.put(13, "Aokiji");           

        System.out.println("This is a HashMap Participation Assignment.");
        System.out.println("List of 13 One piece Characters:");
        
        //Display content using Iterator
        Set set = HashMap308_Mahato.entrySet();
        Iterator iterator = set.iterator();

        //Print out all of the key/values again
        while(iterator.hasNext())
        {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key is : "+ mentry.getKey()+ " & Value is: " + mentry.getValue());
        }
        System.out.println();
        // add 3 elements references to a record in the HashMap & print
        String var1 = HashMap308_Mahato.get(1);
        //getting the values based on keys and
        //Printing the value after getting
        System.out.println("Key is 1 & Value is: " + var1 + " , the main character in One Piece.");
        System.out.println();

        String var2 = HashMap308_Mahato.get(12);
        System.out.println("Key is 12 & Value is: " + var2 + " , the first king of pirates.");
        System.out.println();

        String var3 = HashMap308_Mahato.get(10);
        System.out.println("Key is 10 & Value is : " + var3 + " , an inspiration to " + var1 + ".");
        System.out.println();

        //printing the key & value that I want to remove from the HashMap.
        System.out.println("Removing the following values:");
        System.out.println("Key is 11  & Value is "+HashMap308_Mahato.get(11));
        System.out.println("Key is 13 & Value is "+HashMap308_Mahato.get(13));
        System.out.println("Key is 2 & Value is "+HashMap308_Mahato.get(2));
        System.out.println();

        //removing the value from the HashMap
        HashMap308_Mahato.remove(11);
        HashMap308_Mahato.remove(13);
        HashMap308_Mahato.remove(2);

       //Printing out the HashMap after removing
        System.out.println("Map key and values after removal:");

        Set set2 = HashMap308_Mahato.entrySet();

        Iterator iterator2 = set2.iterator();

        //Printing all the keys and the values

        while(iterator2.hasNext())
        {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.println("Key is: "+mentry2.getKey() + " & Value is: ");
            System.out.println(mentry2.getValue());
        }

        //Next, we replace the value in our HashMap.
        //replace the values based on the key.
        String replace1 = HashMap308_Mahato.replace(1, "New Pirate King");
        String replace2 = HashMap308_Mahato.replace(4,"Cook");
        String replace3 = HashMap308_Mahato.replace(5, "Navigator");
        System.out.println();

        //printing the three before values of we replaced
        System.out.println("The three before values are:");
        System.out.println("key is  1 & Value is "+ replace1);
        System.out.println("key is  4 & Value is "+ replace2);
        System.out.println("key is 5 & Value is "+ replace3);
        System.out.println();

        //printing the three keys and values after replacement
        System.out.println("The three after values are");
        System.out.println("key is  1  & Value is "+ HashMap308_Mahato.get(1));
        System.out.println("key is  4  & Value is "+ HashMap308_Mahato.get(4));
        System.out.println("key is 5 & Value is "+ HashMap308_Mahato.get(5));
        System.out.println();

        //printing the HashMap after replacement
        System.out.println("Map key and values after replacement:");

        Set set3 = HashMap308_Mahato.entrySet();

        Iterator iterator3 = set3.iterator();

        //Printing all the keys and the values

        while(iterator3.hasNext())
        {
            Map.Entry mentry3 = (Map.Entry)iterator3.next();
            System.out.println("Key is: "+mentry3.getKey() + " & Value is: ");
            System.out.println(mentry3.getValue());
        }

    }//end main
}//end HashMaps308_Mahato class
