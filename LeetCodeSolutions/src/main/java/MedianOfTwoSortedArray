import java.util.*;
public class MedianOfTwoSortedArray{
    public static void main(String[] args) {
        int [] n1={7,8,9};
        int [] n2={4,12,20};
        double med = findMedianSortedArrays(n1,n2);
        System.out.println(med);
    }
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArr=new int[nums1.length+nums2.length];
        double median=0;
        for(int i=0;i<nums1.length;i++){
            newArr[i]=nums1[i];
        }
        for(int i=nums1.length,j=0;j<nums2.length;j++,i++){
            newArr[i]=nums2[j];
        }
        Arrays.sort(newArr);
        if((newArr.length+1)%2==0){
          median=newArr[((newArr.length+1)/2)-1];  
        }
        else{
	double a = newArr[newArr.length / 2];
	double b = newArr[(newArr.length / 2) - 1];
	median = (a + b) / 2;
        }
        return median;
    }

}