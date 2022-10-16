import java.util.Arrays;
import java.util.Scanner;

public class swap { 
	  
	
	public static void main(String[] args){  
		//int[] xs=new int[10];
		Scanner inp = new Scanner(System.in);
		int[] xs = new int[10];
		int[] x = new int[10];
		System.out.print("Enter elements of array");
		for(int i=0;i<xs.length;i++)
			xs[i]=inp.nextInt();
		inp.close();
	    int start = 0;
	    int end = 0;
	    int temp = 0;       
	    for (int i = 0; i < xs.length; i++) {
	        if(i==0 || xs[i]<xs[i-1]){
	            temp = i;           
	        }
	        else if(i-temp > end-start){
	            start = temp;
	            end = i;
	        }
	    }
	  x= Arrays.copyOfRange(xs, start, end+1);    
	 System.out.println(x);
	}

	}