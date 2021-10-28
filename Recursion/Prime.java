package com.company;

public class Prime {
    public static void main(String[] args) {
        int n = 9;
        int i=2;
        System.out.println(isPrime(n,i));
    }
    static boolean isPrime(int n, int i){
        //base case
        if(n<=2){
            return n==2 ? true:false;
        }
        if(n%i == 0){
            return false;
        }
        if(i*i > n){
            return true;
        }
        //if none of the cases are true then check for another divisor
        return isPrime(n,i+1);
    }
}
