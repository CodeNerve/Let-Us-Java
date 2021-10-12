/**
 * Author:  Soumen Roy
 * Date:    11 October 2021 (Monday)
 */
public class TrappingRainWaterProblem {

	//driver method - main
	public static void main(String[] args) {
        int[] heightsOfWalls = {4,3,6,1,2,5}; // height of walls is provided as an array, question is how much water will be trapped between the heights of wall
        int finalAmount = amountRainWaterTrapped(heightsOfWalls);
        System.out.println(finalAmount); // Output: 8
	}

	//amountRainWaterTrapped method calculates the amount of water that will be trapped between walls using the prefix Maximum and Suffix Maximum method
	//prefixMax array for {4,3,6,1,2,5} will be {4,4,6,6,6,6}
	//PostfixMax or SuffixMax array for {4,3,6,1,2,5} will be {6,6,6,5,5,5}
	//Minimum of two will be {4,4,6,5,5,5}
	//Subtracting Minimum of two from the original array will result in {0,1,0,4,3,0}
	//finalSum will be 1+4+3=8
	public static int amountRainWaterTrapped(int arr[]) {
		int[] prefixMax = new int[arr.length];
		int[] suffixMax = new int[arr.length];
		int prefix_max = 0, suffix_max = 0, finalSum = 0;

		// array starts from the starting position and finds out the max, then replaces the same within prefixMax array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > prefix_max) {
				prefix_max = arr[i];
			}
			prefixMax[i] = prefix_max;
		}

		// array starts from the end position and finds out the max, then replaces the same within suffixMax array
		for (int i = arr.length-1; i>=0; i--) {
			if (arr[i] > suffix_max) {
				suffix_max = arr[i];
			}
			suffixMax[i] = suffix_max;
		}

		//Calculates the final amount by taking the minimum between both the array and subtracting them from the original values
		for (int i = 0; i < arr.length; i++) {
			finalSum = finalSum + (Math.min(prefixMax[i], suffixMax[i])) - arr[i];
		}

		return finalSum;
	}

}
