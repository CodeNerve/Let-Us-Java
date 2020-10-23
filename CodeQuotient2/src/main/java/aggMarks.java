import java.util.Scanner;

public class aggMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int marks1=s.nextInt();
int marks2=s.nextInt();
int marks3=s.nextInt();
int marks4=s.nextInt();
int marks5=s.nextInt();
int totalMarks=marks1+marks2+marks3+marks4+marks5;
double percent=totalMarks*100/500;
System.out.println(totalMarks+" "+(int)percent);
	}

}
