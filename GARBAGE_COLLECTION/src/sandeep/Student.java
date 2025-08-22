//Create a Java program for university student enrollment using a Student class  to 
//manage course details and student information. Implement efficient garbage collection 
//for memory management and use the Runtime class to monitor memory usage. 
//Override the finalize() method to print a message upon successful garbage collection. 
package sandeep;

public class Student {
 String name;
 int rollno;
  public Student(String name,int rollno) {
	  this.name=name;
	  this.rollno=rollno;
	  
  } 
  public void Studentdetail() {
	  System.out.println("name is " + name + " and rollno is " + rollno);
  }
  protected void finalize() {
	  System.out.println("gabage is removed");
  }
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		System.out.println("Initial free memory is" + r.freeMemory());
		Student st=new Student("Sandeep" , 44);
		st.Studentdetail();
		System.gc();
		System.out.println("Final free meory left is" +r.freeMemory());

	}

}
//The JVM only runs finalize() when it's about to destroy an object — and that only
//happens when the object becomes garbage (unreachable) and the Garbage Collector decides to collect it.
//No garbage = no finalize.
//Even if garbage exists, finalize() runs only if GC chooses to clean it.

//....

//GC (Garbage Collector) automatically deletes objects that are no longer reachable (garbage) from memory.

//finalize() is called by the GC just before it deletes the object to perform 
//cleanup tasks (like closing files or freeing resources).

//You don't call finalize() manually, it is called automatically by GC if the object is being collected
//......

//Example Flow:
//You call System.gc(), which requests the JVM to run the Garbage Collector.

//The Garbage Collector looks for unused (garbage) objects.

// If an object is garbage, GC will automatically call finalize() for that object before removing it from memory.