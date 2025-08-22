package sandeep;
import java.io.File;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) {
        File myFile = new File("sample9087.text");
//        try {
//            myFile.createNewFile();  // ✅ This creates the file if it doesn't exist
//        } catch (IOException e) {
//            e.printStackTrace();
//        }if we remove this line it will not ceate the file ,once you write this it will create the 
          //file permanet
     
//myFile.createNewFile();, it only creates an empty file. There is no data inside the file
//  unless you explicitly write something into it.     
        if (myFile.canWrite()) {  // Check if file is writable
            System.out.println(myFile.getName() + " is writable");
        } else {
            System.out.println(myFile.getName() + " is not writable");
        }
    }
}

//When Should We Use try-catch?
//Method	Throws Exception?	       Needs try-catch?
//getName()	❌ No	                   ❌ No
//exists()	❌ No	                    ❌ No
//canWrite()	❌ No	                    ❌ No
//createNewFile()	✅ Yes (IOException) 	✅ Yes
//delete()	❌ No	❌ No
//getAbsolutePath()	❌ No	                 ❌ No


//1️⃣ The file does not exist
//
//canWrite() only checks if an existing file can be written to.
//
//If the file does not exist, canWrite() will return false.
//
//Java does not create a new file when you call canWrite().
//
//2️⃣ The file is "read-only"
//
//Maybe the file exists but is read-only (cannot be written to).

//....................

//CONCEPT TO KNOW
//File myFile = new File("demo.txt");
//It creates a File object in Java (in memory).
//It tells Java: "I want to work with a file named demo.txt."
//But it does NOT create the file on your disk yet.

//myFile.createNewFile();
//It actually creates the real file named demo.txt on your disk.
//If the file already exists, it does nothing.
//If the file doesn’t exist, it creates an empty file.

