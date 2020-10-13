package codeQuotient;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int fact=1;
for(int i=1;i<=x;i++) {
	fact=fact*i;
}System.out.println(fact);
	}

}
