import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordAnalyzerTest2 {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
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
	}

}
