import java.util.*;
import java.lang.*;
import java.io.*;
class PowerofFour{
	public static void main (String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is power of four or not : ");
		int n = scn.nextInt();
		System.out.println(isPowerOfFour(n));
	}
    public static boolean isPowerOfFour(int n) {
       return Math.log(n)/Math.log(4) %1==0;
    }
}

//question link : https://leetcode.com/problems/power-of-four/
