import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NewBusRoute {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        long[] cd = new long[n];
        for(int i=0;i<n;i++)
        {
            cd[i] = scan.nextLong();
        }
        Arrays.sort(cd);
        int count =1;
        long min = Integer.MAX_VALUE;
        long min1 = min;
        for(int i=1;i<n;i++)
        {
            min = Math.min(min,Math.abs(cd[i]-cd[i-1]));
            if(min1==Math.abs(cd[i]-cd[i-1]))
            {
                count++;
            }
            else {
                if(min!=min1)
                {
                    min1 = min;
                    count=1;
                }
            }
        }
        System.out.println(min+" "+count);
    }
}