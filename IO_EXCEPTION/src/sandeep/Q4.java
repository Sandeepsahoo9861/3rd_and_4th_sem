package sandeep;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Q4 {
    public static void main(String[] args) {
        try {
            FileWriter frw = new FileWriter("samplebab.txt");  // ✅ Correct way to create FileWriter
            
            //If the file samplebab.txt does NOT exist, FileWriter will: 👉 automatically create it for you.
            //If the file already exists, FileWriter will: 👉 overwrite its content by default.


            frw.write("Have a nice day");  // ✅ Writing text to file
            frw.close();  // ✅ Closing the file

            System.out.println("samplebab.txt is successfully written");  // ✅ Corrected print statement
            
         // Reading the content of the file
            FileReader fr = new FileReader("samplebab.txt");
            BufferedReader br = new BufferedReader(fr);  // BufferedReader for easy reading
            String content = br.readLine();  // Reading the content line by line
            br.close();  // Closing the reader

            // Printing the content
            System.out.println("Content inside the samplebab.txt is: " + content);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
// Creating a file → Yes, because createNewFile() throws IOException
//✅ Writing to a file → Yes, because FileWriter.write() throws IOException
//✅ Reading from a file → Yes, because FileReader.read() throws IOException
//BufferedReader is a class in Java that makes reading text from an input stream (like a file or console) 
//more efficient by buffering the input. 

