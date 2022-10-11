// Java program to count frequencies of

// characters in string using Hashmap




import java.io.*;

import java.util.*;

class OccurenceOfCharInString {

	static void characterCount(String inputString)
	{
  
		// Creating a HashMap containing char as a key and occurrences as a value
	
  HashMap<Character, Integer> charCountMap= new HashMap<Character, Integer>();

// Converting given string to char array

	
  char[] strArray = inputString.toCharArray();

	
  // checking each char of strArray
	
  for (char c : strArray) {
		
    if (charCountMap.containsKey(c)) {
				
        charCountMap.put(c, charCountMap.get(c) + 1);
		
    }
		
    else {
    
				charCountMap.put(c, 1);
        
			}
      
		}


		for (Map.Entry entry : charCountMap.entrySet()) {
    
			System.out.println(entry.getKey() + " " + entry.getValue());
      
		}
    
	}



	public static void main(String[] args)
  
	{
  
		String str = "Ajit";
    
		characterCount(str);
    
	}
}
