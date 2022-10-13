class maximumSumSubArray {
	public static void main(String[] args) {
		int arr[] = {-1 , 2 , -7 , 5 };
		int ans = maxSumSubarray(arr);
		System.out.println(ans);
	}
	static int maxSumSubarray(int arr[]) {
		int maxSum = 0;
		int curSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			curSum = curSum + arr[i];
			if(curSum > maxSum) {
				maxSum = curSum;
			}
			if(curSum < 0) {
				curSum = 0;
			}
		}		
		return maxSum;
	}
}