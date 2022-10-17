public class Main
{
  public static void main (String[]args)
  {
    int[] arr = { 1, 3, 4, 6, 9 };
    int target = 6;
    System.out.println (BinarySearch (arr, target, 0, arr.length - 1));
  }
  static int BinarySearch (int[]arr, int target, int s, int e)
  {
    int mid = s + (e - s) / 2;

    if (arr[mid] == target)
      {
	return mid;
      }
    if (s <= e)
      {
	if (target < arr[mid])
	  {
	    return BinarySearch (arr, target, s, mid - 1);
	  }
	else
	  {
	    return BinarySearch (arr, target, mid + 1, e);
	  }
      }



    return -1;

  }
}
