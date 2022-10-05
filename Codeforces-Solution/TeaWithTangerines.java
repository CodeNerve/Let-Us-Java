import java.util.Scanner;

public class TeaWithTangerines {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- >0)
        {
            int n = scan.nextInt();
            long [] a= new long[n];
            for(int i=0;i<n;i++)
            {
                a[i] = scan.nextLong();
            }
            long min = a[0];
            long miiin = min*2;
            long steps = 0;
            for(int i=1;i<n;i++)
            {
                if(a[i]>=miiin)
                {
                    if(a[i]%(miiin-1)==0)
                    {
                        steps += (a[i]/(miiin-1)-1);
                    }else {
                        steps +=(a[i]/(miiin-1));
                    }
                }
            }
            System.out.println(steps);
        }
    }
}