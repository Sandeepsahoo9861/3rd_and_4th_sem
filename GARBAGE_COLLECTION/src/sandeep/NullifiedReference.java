//Write a Java program to demonstrate nullification of references and garbage collectionv   
//using the NullifiedReference class. The class should have a constructor to initialize an 
//object with a given name. In the main() method, create an instance of 
//NullifiedReference, assign it, then nullify the reference, and explicitly invoke the 
//garbage collector. Override the finalize() method to print the object's name upon 
//successful garbage collection. 

package sandeep;

public class NullifiedReference {
	String name;
	 public NullifiedReference (String name) {
		 this.name=name;
		 System.out.println("name is"+ " " + name);
	 }
	 protected void finalize() {//finalize method overide the System.gc
		 System.out.println("ob object is destroyed");
	 }
	public String toString() {
		return "[Name is " + this.name + "]" ;
	 }
	

	public static void main(String[] args) {
		NullifiedReference  ob=new NullifiedReference ("Sandeep");
		ob=null;
		System.gc();//you have System.gc(); first, but calling System.gc(); only requests
		//garbage collection—it does not guarantee immediate execution. The JVM 
		//decides when to actually run the garbage collector
		System.out.println(ob);
		

	}

}
//toString() is only called when ob is not null.
//If ob == null, Java will not call toString(), it will just print null.
