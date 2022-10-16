/**
 * Author:  Soumen Roy
 * Date:    16 October 2021 (Saturday)
 */
//TC = O(mn) where m is the length of the minimum string and n is the no of string
//SC = O(m) since StringBuilder object created, StringBuilder is preferred over StringBuffer with respect to performance
class LongestCommonPrefix {

	//driver method - main
	public static void main(String[] args) {
		String[] strs = { "flow","fl", "flowering","flowers"};
		String answer = longestCommonPrefix(strs);
		System.out.println(answer);
	}

	// returns the longest common prefix
	public static String longestCommonPrefix(String[] strs) { 
	        StringBuilder ans = new StringBuilder();
	        if(strs.length == 0) return "";
	        //String min = getMinimumLengthString(strs); // Get the minimum length String
	        String min = strs[0]; // Or you can assume the first String as having minimum length
	        for (int i = 0; i < min.length(); i++) {// i is used for character wise comparison
				for (int j = 1; j < strs.length; j++) { // j is used to iterate over the number of elements in the array
					if (i>= strs[j].length() || min.charAt(i) != strs[j].charAt(i))
						return ans.toString(); // if any character mismatch happen on comparison between elements of the array OR if any of the element in the array has finished comparing all the elements and the assuming String length is bigger then return or else IndexOutOfBoundException
				}
				ans.append(min.charAt(i)); // appending the longest common prefix after all the elements in the array iterate
			}
			return ans.toString();
	    }

	       // return the string with minimum length
		/* public static String getMinimumLengthString(String[] strs) { 
		int min = strs[0].length();
		String minimum = "";
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() <= min) {
				min = strs[i].length();
				minimum = strs[i];
			}
		}
		System.out.println(minimum);
		return minimum;
	}*/
}