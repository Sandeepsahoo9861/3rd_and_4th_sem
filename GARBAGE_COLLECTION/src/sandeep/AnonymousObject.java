//Create a Java program to demonstrate anonymous objects and garbage  collection using

//the AnonymousObject class. The class should have a constructor to initialize an object 
//with a name. In the main() method, create an anonymous object and explicitly invoke 
//the garbage collector. Override the finalize() method to print the object's name upon 
//successful garbage collection.

package sandeep;

public class AnonymousObject {
	String name;
	public AnonymousObject(String name) {
		this.name=name;
		System.out.println(name);
		
	}
	protected void finalize() {//we use the protected because it is the syntax
		System.out.println("The object is destroyed");
	}

	public static void main(String[] args) {
		new AnonymousObject("Sandeep");//we have created an object without refference variable
		//as there is no refference variable so we cant access this variable so it is a garbage
		   //AnonymousObject are those object without any refference variable
		System.gc();

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
