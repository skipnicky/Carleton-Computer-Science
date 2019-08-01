package comp1406t9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.*;

public class WriteFile {

    public static String filename = "10.txt";

    public static void main(String[] args) {
         try {
             PrintWriter  out;

             // open file for writing
             // (deleting current contents if the file already exists)
             out = new PrintWriter(new FileWriter(filename));

            ReadFile rf = new ReadFile();

            for(int i = 0; i<rf.freqList.size(); i++){
              out.print();
              out.println();
            }


             // close the file
             out.close();

         } catch (FileNotFoundException e) {
             System.out.println("Error: Cannot open file \"" + filename + "\" for writing.");
         } catch (IOException e) {
             System.out.println("Error: Cannot write to file \"" + filename + "\".");
         }
     }


}
