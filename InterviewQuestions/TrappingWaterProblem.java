import java.io.*;
import java.util.*;
import java.lang.*;

class TrappingRainWater{
  public static void main(String[] args) throws IOException{
    BufferReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine().trim());
    int arr[] = new int[n];
    while(t --> 0){
      int n = Integer.parseInt(br.readLine().trim());
      int arr[] = new int[n];
      String inputLine[] = br.readLine().trim().split(" ");

      for(int i=0;i<n;i++){
        arr[i] = Integer.parseInt(inputLine[i]);
      }
      Solution obj = new Solution();
      System.out.println(obj.trappingWater(arr,n));
    }
  }
}


class Solution{

    static long trappingWater(int arr[], int n) { 
        int len = arr.length;
        int[] leftArr = new int[len];
        int[] rightArr = new int[len];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<len; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            leftArr[i] = max;
        }

        max = Integer.MIN_VALUE;
        for(int i=len-1; i>=0; i--){
            if(max < arr[i]){
                max = arr[i];
            }
            rightArr[i] = max;
        }

        long totalWater = 0;

        for(int i=0; i<len; i++){
            totalWater += Math.min(leftArr[i],rightArr[i]) - arr[i];
        }

        return totalWater;
    } 
}
