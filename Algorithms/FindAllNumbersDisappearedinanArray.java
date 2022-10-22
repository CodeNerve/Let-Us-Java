package Sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllNumbersDisappearedinanArray{
	public static void main (String [] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		List<Integer> nums=new ArrayList<>();

		char[] ans = null;
		System.out.println(ans);
		
		
	}
public List<Integer> findDuplicate(int[] nums) {
        
    
		int i=0;
		while(i<nums.length)
		{
			int correct=nums[i]-1;
			if(nums[i]!=nums[correct])
			{
				int temp=nums[i];
				nums[i]=nums[correct];
				nums[correct]=temp;
			}
			else {
				i++;
			}
		}
	     
		
		List<Integer> ans=new ArrayList<>();
		for(int j=0;j<nums.length;j++)
		{
			
			if(nums[j]!=j)
			{
				ans.add(j+1);
			}
		}
		return ans;
	    }
	}
	
		
		 
	

