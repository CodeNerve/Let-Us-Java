
public class PermutationofString {

	public static void main(String[] args) {
		// Given an input string to return all possible permuations in a string Array
		String input="abc";
		String [] result=permutationOfString(input);
		print(result);

	}
	private static String[] permutationOfString(String input) {
	      if (input.length() == 0) {
				String[] result = {""};
				return result;
			}
			String[] smallAns = permutationOfString(input.substring(1));
			String[] ans = new String[smallAns.length*(smallAns[0].length() + 1)];

			int k = 0;
			for (int i = 0; i < smallAns.length; i++) {
				String current = smallAns[i];
				for (int j = 0; j <= current.length(); j++) {
					ans[k] = current.substring(0, j) + input.charAt(0)
							+ current.substring(j);
	                k++;
				}
	        
			}
			return ans;
	}
		private static void print(String[] result) {
		for(String s: result) {
			System.out.println(s);
		}
		
	}


}
