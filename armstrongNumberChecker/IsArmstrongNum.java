import java.util.Scanner;
import java.lang.Math;

public class IsArmstrongNum {
    static boolean isArmstrongNum(int n){
        int digits=0, sum=0, last=0, temp;
        temp=n;

        while(temp>0){
            temp = temp/10;
            digits+=1;
        }

        temp=n;
        while(temp>0){
            last = temp %10;
            sum += (Math.pow(last,digits));
            temp = temp/10;
        }

        if (sum==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {

        System.out.println("///--------Program to check whether a number is an Armstrong Number or not---------///");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int num = sc.nextInt();
        if(isArmstrongNum(num)){
            System.out.println(num+" is a armstrong number");
        }
        else{
            System.out.println(num+" is not a armstrong number");
        }
    }
}