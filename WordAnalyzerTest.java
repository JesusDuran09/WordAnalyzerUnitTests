import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordAnalyzerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
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


		private static void getWords(String string, Map<String, Integer> words) {
			// TODO Auto-generated method stub
			
		}

		private static int getMaxOccurance(Map<String, Integer> words) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
