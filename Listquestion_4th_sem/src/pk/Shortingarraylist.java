package pk;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class Shortingarraylist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of element you want to add");
		int no=sc.nextInt();
		ArrayList<Integer> var=new ArrayList<>();
		
		for(int i=0;i <=no;i++) {
			var.add(sc.nextInt());
		}
		
		
		HashSet<Integer> tom=new HashSet<>(var);
		System.out.println(tom);
		 

	}

}
