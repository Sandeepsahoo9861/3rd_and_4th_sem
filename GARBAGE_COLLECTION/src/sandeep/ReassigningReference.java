//Develop a Java program to demonstrate reference reassignment and garbage collection  
//using the ReassigningReference class. The class should have a constructor to initialize 
//an object with a given name. In the main() method, create two instances of 
//ReassigningReference, reassign one reference to another, and then explicitly invoke 
//the garbage collector. Override the finalize() method to print the object's name upon 
//successful garbage collection.
package sandeep;

public class ReassigningReference {
	String name;
	public ReassigningReference(String name) {
		this.name=name;
		System.out.println("name is" + name);
	}
	public void finalize() {//finalize method will override the system.gc
		              ////we use the protected because it is the syntax
		System.out.println("now object ob is destroyed");
	}
	public String toString() {
		return "Person[Name is" +this.name + "]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReassigningReference ob=new ReassigningReference("Sandeep");
		ReassigningReference kk=new ReassigningReference("pikun");
		
		ob=kk;//kk data are transfered to ob
		System.out.println();
		System.gc();//garbage collection
		System.out.println(ob);
		
		

	}

}
//The r.gc() method requests the JVM to run garbage collection, which automatically
//deletes objects that have no active references (like ob and ab set to null). The JVM 
//decides when to run garbage collection, and before deletion, it calls the finalize() method
//if overridden. However, garbage collection is not guaranteed to run immediately.
