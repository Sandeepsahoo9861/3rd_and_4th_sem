//Develop a Java class with private integer and double data  members, along with  
//methods for initialization, setting, and updating these members. Create two objects of 
//this class and invoke the necessary methods to modify the data. Use the Runtime class 
//to calculate the total allocated memory and memory occupied by the objects. Apply any 
//L2, L3 
// 
//technique to make the objects unreachable, making them eligible for garbage 
//collection. Finally, recheck the utilized and total memory using the Runtime class. 
package sandeep;

public class Runtimeclass {
	private int a;
	private double d;
public	Runtimeclass(int a , double d) {
	this.a=a;
	this.d=d;
	System.out.print( "a = "+ a + "d =" + d );
}
public void updatemethod() {
	a=a+5;
	d=d +2.5;
}
protected void finalize() {//we use the protected because it is the syntax
System.out.println("object is destroyed from the stack");	
}

	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();//line-24
		System.out.println("Free memory in the stack is "+r.freeMemory());//only r.freeMemory will
		                                           // after writing line no 24
		Runtimeclass ob=new Runtimeclass( 5,5.0) ;
		Runtimeclass ab=new Runtimeclass(6,6.0)	;
		ob.updatemethod();
		//uses the reference ob to go to the object in the heap and update its values.

		//So even though the variable ob is on the stack, the real data (a, d) is on the heap. That's why you can still change 
		//those values through the method ab.updatemethod();
	
		
		//Runtime r=Runtime.getRuntime();
		System.out.println("Free memory in the stack is "+r.freeMemory());
		ob=null;
		ab=null;
		System.gc();//it will remove garbage(it will delete the garbage from the steck)
		System.out.println("The total free memory there in the stack is " + r.freeMemory() );
		
		

	}

}
//.........................................
//What is System.gc()?
//System.gc() is a request to the JVM (Java Virtual Machine) to run garbage collection — that is, to clean up memory by removing objects that are no longer used.
//
//But remember:
//➡️ It's just a request. The JVM may or may not do it immediately.
//🔍 What is finalize()?
//The finalize() method is a special method that Java calls before an object is destroyed by garbage collection. You can write code inside finalize() to do cleanup (like closing a file or releasing a resource).

//⚙️ How They Work Together
//In your code:
//System.gc();
//You are asking the JVM to do garbage collection.
//If the JVM agrees and decides to destroy an object, then it will call:

//finalize();
//just before destroying the object.

