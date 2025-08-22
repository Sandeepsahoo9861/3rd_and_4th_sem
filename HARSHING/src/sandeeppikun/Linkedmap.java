package sandeeppikun;
import java.util.*;


public class Linkedmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,String> lmap=new LinkedHashMap<>();
		lmap.put("Sandeep", "Pikun");
		lmap.put("Rockey", "chikun");
		lmap.put("Pratik", "Babulu");
		lmap.put(null, "Kapil");
		lmap.put(null, "natia");//last will added the last null key and vlaue
		System.out.println(lmap);
         System.out.println("size of the map" +"is" + ""+ lmap.size());
         System.out.println("the value of the key Rockey"+"IS" +" "+ lmap.get("Rockey") );
         System.out.println("the value of the key Rockey" +"is" +" " + lmap.get("sonu") );
         System.out.println("does the key Rockey present ?" + lmap.containsKey("Rockey"));
         System.out.println("deleting element Rockey" + lmap.remove("Rockey"));
         System.out.println(lmap);
	}

}
