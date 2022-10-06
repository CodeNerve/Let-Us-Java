import java.util.*;
public class DeadlyLaser {
    public static int distance(int n,int m, int sx,int sy)
    {
        return (Math.abs(n-sx) + Math.abs(m-sy));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        while (testcase>0)
        {
            int n = scan.nextInt(), m =scan.nextInt(), sx = scan.nextInt(), sy = scan.nextInt(),d = scan.nextInt();
            if(((distance(n,sy,sx,sy)>d) &&  (distance(sx,1,sx,sy)>d) ) ||  ((distance(1,sy,sx,sy)>d) && (distance(sx,m,sx,sy)>d)))
            {
                System.out.println(n+m-2);
            }else
            {
                System.out.println(-1);
            }
            testcase--;
        }
    }
}