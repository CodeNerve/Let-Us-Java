import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(recur(n));
    }
    static int recur(int n){
        int d=(int)(Math.log10(n))+1;
        return help(n,d);
    }
    static int help(int n,int d){
        if(n%10==n){
        return n;
        }
        int r=n%10;
        return r*(int)(Math.pow(10,d-1))+help(n/10,d-1);
    }
}
