import java.lang.Math ;

public class Search {
	static int interpolation_search(int arr[],int key){
		int start = 0 , end = arr.length -1 ;
		while(start <= end && key >= arr[start] && key <= arr[end]){
			if(start == end){
				if(arr[start] == key) return start ;
				return -1 ;
			}
			int pos = start + ((end - start) / (arr[end] - arr[start])*(key - arr[start]));
			if(arr[pos] == key)
				return pos ;
			if(arr[pos] < key)
				start = pos + 1 ;
			else
				end = pos - 1;
		}
		return -1 ;
	}

	public static void main(String ...s){
		int arr[]= {1,3,5,7,9,13,19,30};
		int key = 19;
		int index  = interpolation_search(arr, key);
		System.out.println("-----INTERPOLATION SEARCH-----");
		System.out.print("The key " + key + " ");
		System.out.print((index == -1) ? "doesn't exist in the Array." : ("is present at index: " + index));

	}
}