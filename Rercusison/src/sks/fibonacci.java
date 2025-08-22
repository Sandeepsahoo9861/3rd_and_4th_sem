package sks;
import java.util.Scanner;

public class fibonacci {
	public static int fibbo( int nam) {
		if (nam==0) {
			return 0;
		}
		else if(nam==1) {
			return 1;
		}
		else {
		 
			return fibbo(nam -1) + fibbo(nam-2);//fibbo(3)=fibbo(2) fibbo(1)
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int num=sc.nextInt();
		int res=fibbo(num);
		System.out.println(res);
		
		// for print series of individual numbeer we can call fibbo function
		for(int i=0 ;i <=num; i++) {
			System.out.print(fibbo(i) + " ");
		}

	}

}
