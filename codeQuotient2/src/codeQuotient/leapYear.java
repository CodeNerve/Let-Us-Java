package codeQuotient;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int year=s.nextInt();
 if (( year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0))) {
	System.out.println("Leap Year"); 
 }else
		System.out.println("Not a Leap Year"); 

}
}