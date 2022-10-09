import java.util.*;
public class Count_zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
        }
        static int count(int n){
        if(n==0){
            return 0;
        }
        if(n%10==0){
            return 1+ count(n/10);
        }
        else{
        return count(n/10) ;
        }
    
    }
}
