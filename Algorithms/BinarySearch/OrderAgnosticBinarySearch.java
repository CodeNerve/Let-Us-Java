public class Main
{
	public static void main(String[] args) {
	    int[] arr={10,6,4,3,2,1};
	    int target=3;
		System.out.println(OrderAgnosticBinarySearch(arr,target));
	}
  //function for Order Agnostic Binary Search
	static int OrderAgnosticBinarySearch(int[] arr,int target){
	   int low,high,mid;
	   low=0;
	   high=arr.length-1;
	   
	   while(low<=high){
	      mid=low+(high-low)/2; 
	      if(arr[mid]==target){
	          return mid;
	      }
	   else if(arr[low]<arr[high]){
	     if(target<arr[mid]){
	          high=mid-1;
	      }
	      else{
	          low=mid+1;
	      }
	   }
	   else{
	         if(target<arr[mid]){
	            low=mid+1;
	      }
	      else{
	          high=mid-1;
	        
	      }
	   }
	   }
	   return -1;
	}
}
