//problem 282A- Bit++
//--problem statement-> https://codeforces.com/problemset/problem/282/A
//codeforces profile --> https://codeforces.com/profile/Bond_James

import java.util.*; 
 
public class bit {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;
        while(n-->0)
        {
            String s = sc.next();
            x += check(s);
        }
        System.out.println(x);
        
        
    }
    static int check(String op)
    {
        int x = 0;
        if(op.equals("++X"))
        {
            x += 1;
        }
        else if(op.equals("X++"))
        {
            x =+ 1;
        }
        else if(op.equals("--X"))
        {
            x-=1;
        }
        else
        {
            x=-1;
        }
        return x;
    }
}
