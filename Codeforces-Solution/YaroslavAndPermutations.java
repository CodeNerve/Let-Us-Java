import java.util.Scanner;

public class YaroslavAndPermutations {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];
        int [] index = new int[1000];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
            index[a[i]-1]++;
        }
        int flag=0;
        for(int i=0;i<1000;i++)
        {
            if(index[i] >(n+1)/2)
            {
                flag++;
            }
        }
        if(flag>0)
        {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}