
//it will give the sum of 1 ,3,5,7
// or 0,2,4,6
package sks;
import java.util.Scanner;
public class Q1 {

	public static int sum(int oj) {
		if (oj==1) {
			return 1;
			
		}
		else if(oj==0) {
			return 0;
		}
		else {
			System.out.println(oj);//first it will print in every call 
			return oj + sum(oj-2);
		}
	}
	
	

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();          // Input from user
        int result = sum(no);           // Call method
        System.out.println("The final out put is this"+result);     // Output result
    }
}
