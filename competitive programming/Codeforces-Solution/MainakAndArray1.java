import java.util.*;

public class MainakAndArray1{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- >0)
        {
            int n = scan.nextInt();
            int [] array = new int[n];
            int [] array1 = new int[n];
            int max =0;
            int min = 999;
            int maxIndex=-1;
            int minIndex=-1;
            for (int i=0;i<n;i++)
            {
                array[i] = scan.nextInt();
                if(max<=array[i])
                {
                    max  = array[i];
                    maxIndex=i;

                }
                if(min>=array[i])
                {
                    min = array[i];
                    minIndex=i;
                }
            }
            if(minIndex==maxIndex+1 || minIndex==0 || maxIndex==n-1)
            {
                System.out.println(max-min);
            }
            else {
                int diff=0;
                for(int i=0;i<n-1;i++)
                {
                    diff = Math.max(diff,array[i]-array[i+1]);
                }
                diff = Math.max(diff,max-array[0]);
                diff = Math.max(diff,array[n-1]-min);
                System.out.println(diff);
            }
        }
    }
}