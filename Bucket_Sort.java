// Bucket sort: Time Complexity = Theta(n)
import java.util.*;
import java.util.Collections;

class Bck_Srt {


	public static void main(float arr[])
	{
		int n = arr.length;
		bucketSort(arr, n);

		System.out.println("Bucket sorted: ");
		for (float el : arr) {
			System.out.print(el + " ");
		}
	}

	static void bucketSort(float arr[], int n)
	{
		if (n <= 0)
			return;

		@SuppressWarnings("unchecked")
		Vector<Float>[] buckets = new Vector[n];

		for (int i = 0; i < n; i++) {
			buckets[i] = new Vector<Float>();
		}

			float idx = arr[i] * n;
			buckets[(int)idx].add(arr[i]);
		}

		for (int i = 0; i < n; i++) {
			Collections.sort(buckets[i]);
		}

		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < buckets[i].size(); j++) {
				arr[index++] = buckets[i].get(j);
			}
		}
	}

	
}