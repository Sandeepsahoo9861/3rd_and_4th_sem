// write the greater than n/3
package sandeeppikun;
import java.util.*;

public class Frequency_greater_than_n_by_3 {
	public static void freq(int arr[]) {
		HashMap<Integer ,Integer> lp=new HashMap<>();
		int n=arr.length;
		for(int i=0;i< n; i++) {
		if (lp.containsKey(arr[i])){
			 lp.put(arr[i], lp.get(arr[i]) + 1); 
		}
		else {
			lp.put(arr[i], 1);
		}
		}
		
		for(Integer key :lp.keySet()) {//key is just a variable, and it iterates 
			                      //through all the keys (unique elements) in lp.keySet().
			if (lp.get(key) > n / 3) {// Checking frequency, not the element itself
 
				System.out.println("key" + " "+key);
			}
		}
			
		
		
	}


	public static void main(String[] args) {
		int arr[]= {4,3,5,6,7,7,6,7,7};
		freq(arr);

	

}
}