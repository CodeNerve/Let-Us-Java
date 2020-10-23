import java.util.Scanner;

public class hra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int bs=s.nextInt();
double hra=0.1*bs;
double da=0.2*bs;
double gs= bs+hra+da;
System.out.println((int)gs);
	}

}
