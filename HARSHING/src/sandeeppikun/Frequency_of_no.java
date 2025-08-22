//finding the frequency of elements that are present in it

package sandeeppikun;
import java.util.*;

public class Frequency_of_no {
    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {//it returns true
                map.put(nums[i], map.get(nums[i]) + 1); 
//                map.get(nums[i]) → Retrieves the existing value (frequency count) of nums[i].
//                +1 → Increments the value by 1.
//                map.put(nums[i], updated_value); → Stores the new value at key nums[i] 
                  //in the HashMap.

                
                //map.get(nums[i]) retrieves the current count (value) of nums[i] from the HashMap.
                //If nums[i] is already in the map, it returns its count.
                //It updates the count of nums[i] by increasing it by 1.
            } else {
                map.put(nums[i], 1); 
            }
        }

        // Print key and frequency
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
       // Integer key → Stores each key one by one as we loop through the set.
       //The loop automatically picks one key at a time from map.keySet()
        //map.keySet() returns a set of all keys in the map.
        //map.get(key) retrieves the corresponding value
    }

    public static void main(String[] args) {
        int num[] = {1, 3, 1, 7, 6};
        majorityElement(num); // Removed incorrect print statement
    }
}
