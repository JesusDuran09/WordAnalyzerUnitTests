 //Importing File classes
import java.io.File;
import java.io.FileNotFoundException;

// Importing Map and HashMap class from
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Importing Scanner
import java.util.Scanner;
 
//find maximum occurrences
public class WordAnalyzer {
 
    // Method 1 - getWords()
    static void getWords(String fileName,
                         Map<String, Integer> words)
        throws FileNotFoundException
    {
        // Creating a Scanner object
        Scanner file = new Scanner(new File(fileName));
 
        // Condition check using hasNext() method
        while (file.hasNext()) {
 
            // Reading word using next() method
            String word = file.next();
 
            // Frequency count variable
            Integer count = words.get(word);
 
            // If the same word is repeating
            if (count != null) {
 
                count++;
            }
            else
 
                // If word never occurred after occurring
                // once set as 1
                count = 1;
            words.put(word, count);
        }
 
        // Close the file
        file.close();
    }
 
    // Method 2 - getMaxOccurrence()
    // To get maximum occurred Word
    static int getMaxOccurance(Map<String, Integer> words)
    {
        // Initially set maximum count as unity
        int max = 1;
 
        // Iterating over above Map using for-each loop
        for (Entry<String, Integer> word :
             words.entrySet()) {
 
            // Condition check
            // Update current max value  with the value
            // exceeding unity in Map while traversing
            if (word.getValue() > max) {
                max = word.getValue();
            }
        }
 
        // Return the maximum value from the Map
        return max;
    }
 
    // Method 3
    // Main driver method
    public static void main(String[] args)
        throws FileNotFoundException
    {
        // Creating an object of type Map
        // Declaring object of String and Integer types
        Map<String, Integer> words
            = new HashMap<String, Integer>();
 
        // Retrieving the path as parameter to Method1()
        // above to get the file to be read
        getWords("C:\\Users\\jesus\\Desktop\\The Raven - SDLC Assignment.txt", words);
 
        // Variable holding the maximum
        // repeated word count in a file
        int max = getMaxOccurance(words);
 
        for (Entry<String, Integer> word : words.entrySet()) {
 
            // Comparing values using geValue() method
            if (word.getValue() == max) {
 
                // Print and display word-count pair
                System.out.println(word);
            }
         
        } 
    } 
}