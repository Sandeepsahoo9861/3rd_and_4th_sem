//Write a memory-intensive Java program that creates a large number of objects and test  
//it using the G1 garbage collector. Print timestamps along with the total heap size and 
//free memory. Use the following commands to retrieve heap memory details: 
//• Total heap memory: Runtime.getRuntime().totalMemory(); 
//• Free heap memory: Runtime.getRuntime().freeMemory();

package sandeep;

public class Gc_6 {
	int a;
	public Gc_6(int a) {
		this.a=a;
		System.out.println("a is " + a);
	}
	

	public static void main(String[] args) {
		

     Runtime r= Runtime.getRuntime();
     System.out.println("Total memory" + r.totalMemory());
     System.out.println("Free memory in the stack" + r.freeMemory());
     for(int i=0;i<=100;i++) {
    	 Gc_6 ob=new  Gc_6(5);
    //	 System.out.println(ob.a); ob is the reffernce though this we can print the value

     }
     System.out.print("After passing parameter the amout of free memory left is" + r.freeMemory());
    System.gc();//destroying the object

	}

}
//.......................
//What is System.gc()?
//System.gc() is a request to the JVM (Java Virtual Machine) to run garbage collection — that is, to clean up memory by removing objects that are no longer used.
//
//But remember:
//➡️ It's just a request. The JVM may or may not do it immediately.
//
//🔍 What is finalize()?
//The finalize() method is a special method that Java calls before an object is destroyed by garbage collection. You can write code inside finalize() to do cleanup (like closing a file or releasing a resource).
//
//⚙️ How They Work Together
//In your code:
//
//
//System.gc();
//You are asking the JVM to do garbage collection.
//If the JVM agrees and decides to destroy an object, then it will call:

//finalize();
//just before destroying the object.
