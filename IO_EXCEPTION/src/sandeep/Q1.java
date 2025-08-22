package sandeep;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.io.*;

public class Q1 {

    public static void main(String[] args) {
        String s = "welcome to java io";
        try {
            FileOutputStream fos = new FileOutputStream("sample.txt");
            fos.write(s.getBytes());//s.getBytes()

                        //Converts the string s = "welcome to java io" into a byte array.

                        //Since FileOutputStream works with bytes, this conversion is necessary.
                     // fos.write(byteArray)

                   // Writes the converted byte array data to the file (sample.txt).
            fos.close();
         // Read from the file using BufferedReader
            FileReader fr = new FileReader("sample.txt");//fr	Opens and reads the file   sample.txt", fr is the reference
            BufferedReader br = new BufferedReader(fr); //br  Wraps fr, reads efficiently , br is the reference
            String content = br.readLine();  // Read one line,Reads a full line or a large chunk into memory at once.Much faster.


            br.close();

            // Print the content
            System.out.println("Content inside the sample.txt is: " + content);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {//fos.write(s.getBytes()) Can Throw IOException
        	//When writing data to the file, if an error occurs (e.g., disk full, file system error), 
        	//an IOException will be thrown.
            e.printStackTrace();
        }
    }
}
//FileOutputStream constructor can throw FileNotFoundException if the file cannot be created or opened.

//fos.write(s.getBytes()) and fos.close() can throw IOException.
//....
//Work of fos (FileOutputStream object)
//fos is an object of the FileOutputStream class.
//
//It is used to write data to a file in byte format.
//
//It opens (or creates) the file "sample.txt" and writes data into it.
//
//After writing, it is closed to free system resources.

//Work of "sample.txt" (File)
//"sample.txt" is the file where the data "welcome to java io" is written.
//
//If the file does not exist, it is created automatically.
//
//If it already exists, its previous content is erased, and new data is written.
//
//The data written in this file can be checked by opening it in a text editor.
//...
//s.getBytes()
//
//Converts the string s = "welcome to java io" into a byte array.
//
//This is necessary because FileOutputStream works with bytes, not strings.
//
//fos.write(byteArray)
//
//Writes the byte array data to the file (sample.txt).
//
//Stores "welcome to java io" in the file as raw byte data.
//
//Why is getBytes() used?
//FileOutputStream does not support direct string writing.
//
//getBytes() converts the string into binary form (byte array), which write() understands.