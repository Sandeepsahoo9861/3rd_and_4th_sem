package sandeeppikun;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Harshtable {

    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");

        // Printing the entire hashtable
        System.out.println(ht);  

        // Getting value of key 2
        String val = ht.get(2);
        System.out.println(val);  

        // Iterating through the Hashtable
        Set<Integer> keys = ht.keySet(); // Get all keys
        Iterator<Integer> itr = keys.iterator(); // Create an iterator
     //   at a time, the iterator (itr) processes one key at a time. The while loop checks
     //   for the next key before moving forward.


        while (itr.hasNext()) { 
            Integer key = itr.next();
            String mapvalue = ht.get(key);
            System.out.println("Key: " + key + ", Value: " + mapvalue);
        }
    }
}


//When the iterator is first created, it does not point to any element.
//It is positioned before the first element.
//Set<Integer> keys = ht.keySet(); it means
//keys = {1, 2, 3} (Order is not guaranteed in Hashtable, but we assume {1, 2, 3} for dry run)
//while(itr.hasNext()) {
//	Integer key=itr.next();
//	String mapvalue=ht.get(key);
//	System.out.println("key" + key + "value" + map.value);

//itr.hasNext() checks if an element exists before moving forward.
//Step	itr.hasNext()	,itr.next() (Key),	ht.get(key) (Value) ,	  Output
//1	   true	               1	                "A"                   Key: 1, Value: A
//2	   true                2                     "B"	               Key: 2,Value: B
//3	   true	               3	                 "C"	                Key: 3, Value: C
//4      false	       Loop ends	Loop ends	(No output)
