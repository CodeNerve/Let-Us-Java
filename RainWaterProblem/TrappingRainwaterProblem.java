public class TrappingRainwaterProblem {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int ans = rainWater(arr);
		System.out.println(ans);
	}
	static int rainWater(int arr[]) {
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];
		
		left[0] = arr[0];
		for(int i=1; i<n; i++) {
			left[i] =Math.max(left[i-1], arr[i]);
		}
		
		right[n-1] = arr[n-1];
		for(int i=(n-2); i>= 0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		
		int ans = 0;
		for(int i=0; i<n; i++) {
			ans += (Math.min(left[i], right[i]) - arr[i]);
		}
		return ans;
	}
}
