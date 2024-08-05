import java.util.*;
class Hashtables {
    public static void main(String[] args) {
        //Hashtable - A data structure that stores unique keys to values ex.<Integer, String>
        //          - Each key/value pair is known as an Entry
        //          - FAST insertion, look up, deletion of key/value pairs
        //          - Not ideal for small data sets, great for large data sets
        //          - runtime complexity = Best Case 0(1)
        //                               = Worst Case 0(n)

        //hasing - takes a key and computes an integer (formula will vary based on key & data type)
        //       - In a Hashtable,we use the hash % capacity to calculate an index number
        //       - key.hashCode() % capacity = index

        //bucket - an indexed storage location for one or more Entries
        //       - can store multiple Entries in case of a collection (linked similarly a LinkedList)

        //collision - hash function generates the same index for more than one key
        //          - less collisions = more efficiency

  
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100, "Vyapti");
        table.put(123, "Jiya");
        table.put(321, "Sachi");
        table.put(555, "Jinit");
        table.put(777, "Tirth");

        //table.remove(777);

        for(Integer key : table.keySet()){ //keySet method will take all the keys and return a set & a set is something we can iterate over
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key)); //here [key.hashCode() % 10] means to show the index where 
                                                                                         //the integer is stored & 10 is the size of Hashtable
        }



        Hashtable<String, String> table0 = new Hashtable<>(10);

        table0.put("100", "Vyapti");
        table0.put("123", "Jiya");
        table0.put("321", "Sachi");
        table0.put("555", "Jinit");
        table0.put("777", "Tirth");

        for(String key : table0.keySet()){ 
            System.out.println(key.hashCode()  + "\t" + key + "\t" + table0.get(key)); 
        }
    }
}