import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    long n= scn.nextInt();
    
    long zeros = 1;
    long ones = 1;
    
    for(int i=2;i<=n;i++)
    {
        long new0 = ones;
        long new1 = ones + zeros;
        
        zeros = new0;
        ones = new1;
    }
    long total = zeros+ones;
    
    System.out.println(total*total);
 }

}