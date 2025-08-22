//11. Append Content to an Existing File: Write a Java program that adds a new diary entry
//to the "diary.txt" file without overwriting its existing content. The program should ask the
//user for the new entry and append it to the file along with a timestamp.
package sandeep;

import java.io.*;

public class Appendfile_at_the_end {

    public static void main(String[] args) {
        String s = "welcome to java io";
        try {
            // Step 1: Write original content (this will overwrite existing content)
            FileOutputStream fos = new FileOutputStream("sample.txt");
            fos.write(s.getBytes());  // convert String to bytes and write
            fos.close();

            // Step 2: Append "sandeep sir" to the file
            FileWriter frw = new FileWriter("sample.txt", true);  // append mode
            frw.write("\nsandeep sir");  // \n to go to a new line
            frw.close();

         // Reading the content of the file
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr);  // BufferedReader for easy reading
            String line;
            StringBuilder content = new StringBuilder();  // To store all lines

            // Reading the file line by line
            while ((line = br.readLine()) != null) {
                content.append(line).append("\n");  // Append each line and a newline character
            }
            br.close();  // Closing the reader

            // Printing the entire content
            System.out.println("Content inside the sample.txt is: \n" + content.toString());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
