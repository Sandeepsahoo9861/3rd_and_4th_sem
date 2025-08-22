 package sandeep;

import java.io.File;  
import java.io.IOException;

public class FileCreate {

    public static void main(String[] args) {
        File myFile = new File("sample5.text");//here sample5.txt is not created yet,it is created by if part.
       // File myFile = new File("sample5.text")
        // it does NOT create any actual file.
        //you just wrote "sample5.text" on a folder label. The folder is empty — no file yet.
      //Instead, it creates a Java object (myFile) that refers to a file name.
        try {
            if (myFile.createNewFile()) {//if file is not created with sample5.txt, it will create the  file for the 
            	//the first time once it is created every time else part will run.But for the first time if statement only
            	//work if the file is not created,so it will create a file with sample5.txt
            	                         
                System.out.println("Created file is " + myFile.getName());//it will show the name of 
                                                                  // the file
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//The File class does not read/write file content; instead, it provides information about the
//file and allows us to create, delete, or check if it exists.
//Other classes, like FileReader and FileWriter, are used to read and write file content but do not manage 
//files themselves.

//The File class (from java.io.File) does not read or write data.
//It does not belong to Character Streams (Reader/Writer) or Byte Streams (InputStream/OutputStream).
//.....................
//File myFile = new File("sample5.text");
//🟢 This line does NOT create any actual file.
//Instead, it creates a Java object (myFile) that refers to a file name.
//
//Think of it like this: 🗂️ You just wrote "sample5.text" on a folder label. The folder is empty — no file yet.
//....................................................
//✅ Step 2: myFile.createNewFile()
//🟢 Now you’re saying to Java:
//
//“Okay Java, now go ahead and actually create the file you were referring to earlier.”
//
//This command will:
//
//Create the file sample5.text on your computer (in the same folder as your Java program).
//
//Return true if the file was created just now.
//
//Return false if the file already exists.//...............
//First run (when sample5.text doesn’t exist):
//
//createNewFile() returns true, so it prints:
//"Created file is sample5.text"
//
//Second run (after the file already exists):
//
//createNewFile() returns false, so it prints:
//"File already exists"