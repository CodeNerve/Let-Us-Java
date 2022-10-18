// find minimum time required to send people on other side of bridge

import java.io.*;

class GFG {

	static int dp[][] = new int[1 << 20][2];

	public static int findMinTime(int leftmask,
								boolean turn, int arr[],
								int n)
	{

		
		if (leftmask == 0)
			return 0;

		int res = dp[leftmask][turn == true ? 1 : 0];

	
		if (~res != 0)
			return res;


		int rightmask = ((1 << n) - 1) ^ leftmask;

		if (turn == true) {
			int minRow = Integer.MAX_VALUE, person = 0;
			for (int i = 0; i < n; ++i) {

				
				if ((rightmask & (1 << i)) != 0) {
					if (minRow > arr[i]) {
						person = i;
						minRow = arr[i];
					}
				}
			}

			
			res = arr[person]
				+ findMinTime(leftmask | (1 << person),
								!turn, arr, n);
		}
		else {

			
			if (Integer.bitCount(leftmask) == 1) {
				for (int i = 0; i < n; ++i) {

					if ((leftmask & (1 << i)) != 0) {
						res = arr[i];
						break;
					}
				}
			}
			else {

		
				res = Integer.MAX_VALUE;
				for (int i = 0; i < n; ++i) {

				
					if ((leftmask & (1 << i)) == 0)
						continue;

					for (int j = i + 1; j < n; ++j) {
						if ((leftmask & (1 << j)) != 0) {

					)
							int val
								= Math.max(arr[i], arr[j]);

							
							val += findMinTime(
								(leftmask ^ (1 << i)
								^ (1 << j)),
								!turn, arr, n);
				
							res = Math.min(res, val);
						}
					}
				}
			}
		}
		return res;
	}


	public static int findTime(int arr[], int n)
	{
		
		int mask = (1 << n) - 1;

		
		for (int i = 0; i < (1 << 20); i++) {
			dp[i][0] = -1;
			dp[i][1] = -1;
		}

		return findMinTime(mask, false, arr, n);
	}

	
	public static void main(String[] args)
	{
		int arr[] = { 10, 20, 30 };
		int n = 3;
		System.out.print(findTime(arr, n));
	}
}


