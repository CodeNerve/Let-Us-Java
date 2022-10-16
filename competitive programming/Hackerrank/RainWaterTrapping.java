""" Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining """

class RainWaterTrapping {
	public static int maxWater(int arr[], int n)
	{
		int size = n - 1;
		int prev = arr[0];
		int prev_index = 0;
		int water = 0;
		int temp = 0;
		for (int i = 1; i <= size; i++) {
			if (arr[i] >= prev) {
				prev = arr[i];
				prev_index = i;

				temp = 0;
			}
			else {

				water += prev - arr[i];

				temp += prev - arr[i];
			}
		}

		if (prev_index < size) {

			water -= temp;

			prev = arr[size];

			for (int i = size; i >= prev_index; i--) {

				if (arr[i] >= prev) {
					prev = arr[i];
				}
				else {
					water += prev - arr[i];
				}
			}
		}
		return water;
	}

	public static void main(String[] args)
	{
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int N = arr.length;
		System.out.print(maxWater(arr, N));
	}
}
