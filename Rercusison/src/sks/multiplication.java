//  this is actually to find the factorial of a number

package sks;
import java.util.Scanner;
public class multiplication {
	public static int mul(int no) {
		if(no==1) {
			return 1;
		}
		else return no * mul(no-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println("enter the no");
		
		int result=mul(no);
		System.out.print(result);
	}

}
