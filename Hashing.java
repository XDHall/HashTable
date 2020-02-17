
/**
 * Write a description of class Hashing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Hashing
{
    public static void main (String [] args){
        Hashtable balance = new Hashtable<>();
        balance.put("apple", "address1");
        balance.put("orange", "address2");
        balance.put("orange", "address3");
        System.out.println(balance);
        System.out.println("Dealing with hash maps:");
        //(key, value) for both table and map
        //Functions for table and map have order of O(1) 
        Map <String,String> myMap  = new HashMap<String,String>();
        myMap.put("apple", "address1");
        myMap.put("orange", "address2");
        myMap.put("orange", "address2");
        myMap.put(null, "address2");
        System.out.println(myMap);

        for (String key: myMap.keySet()) {
            System.out.println(myMap.get(key));
        }

        for (String value: myMap.values()) {
            System.out.println(value);
        }
        
        HashSet <String> mySet  = new HashSet<String>();
        mySet.add("zara"); //Order O(1) and no duplicates in the HashSet
        mySet.add("zara");
        System.out.println(mySet);
    }
}