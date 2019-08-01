package comp1406t9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.*;

public class ReadFile{

    public static String filename = "input.txt";
    public static ArrayList freqList = new ArrayList();
    public static String filename2 = "best10.txt";

    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        try {

            BufferedReader   in;

						// open file
            in  = new BufferedReader(new FileReader(filename));

            int count = 0;

            Hashtable<String, Integer> freq = new Hashtable<String, Integer>();

						// read from file
						String line = in.readLine();
						while( line != null ){
							String[] words = line.split("\\s+");
              for(int i = 0; i<words.length; i++){
                if(freq.containsKey(words[i])){
                  freq.put(words[i], freq.get(words[i]) + 1);
                }else{ freq.put(words[i], 1); }
              }
              line = in.readLine();
						}

            for(String key : freq.keySet()){
              freqList.add(new KeyValue(key, freq.get(key)));

            }
            Collections.sort(freqList);
            for(int i = 0; i < freqList.size(); i++){
              System.out.println(freqList.get(i).toString());
            }

						// clse file
            in.close();


        } catch (FileNotFoundException e) {
            System.out.println("Error: Cannot open file \"" + filename + "\" for reading");
        } catch (IOException e) {
            System.out.println("Error: Cannot read from file \"" + filename + "\"");
        }


        try {
            PrintWriter  out;

            // open file for writing
            // (deleting current contents if the file already exists)
            out = new PrintWriter(new FileWriter(filename2));

          int j = 0;
           for(int i = freqList.size()-1; i>-1; i--){
             if(j<10){
               out.println(freqList.get(i).toString());
             }
             j++;
           }



            // close the file
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Cannot open file \"" + filename2 + "\" for writing.");
        } catch (IOException e) {
            System.out.println("Error: Cannot write to file \"" + filename2 + "\".");
        }
    }
}
