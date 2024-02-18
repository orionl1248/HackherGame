
import java.io.*;


// Main class
// ReadingFromFile
public class Animated_Slot_Animal {

    // Main driver method
    public static void main(String[] args) throws Exception{
        int j; 
        j = 1;
        while (j<=10){
            String f_name_string;
            f_name_string = "Ascii_Files/Homer/F" + (j);


        
        // Passing the path to the file as a parameter
            FileReader fr = new FileReader(f_name_string);
            // Declaring loop variable
            int i;
            // Holds true till there is nothing to read
            while ((i = fr.read()) != -1)
                // Print all the content of a file
                System.out.print((char)i);
            int k = 1
            while (k<=41){
                System.out.print("/n");

            }
        j += 1;
        }
            
    }
}

