import java.util.*;
import java.util.Scanner;
class student{
	String name,dept;
	student(String name, String dept)
	{
		this.name=name;
		this.dept=dept;
	}
}

class Techno{
	student std[];
	int count;
	Scanner sc= new Scanner(System.in);
	Techno(int size)
	{
		std=new student[size];
		count=0;
	}
	public void stdadd()
	{
		if(count==std.length)
		{
			System.out.println("No Vacancy Available.");
		}
		else
		{
			//Scanner sc= new Scanner(System.in);
			System.out.print("Enter the name of the student: ");
			String name=sc.nextLine();
			System.out.print("Enter the dept. of the student: ");
			String dept=sc.nextLine();
			student ob= new student(name,dept);
			std[count++]=ob;
		}
	}
	public void display()
	{
			if(count==0)
					System.out.println("No New Admission");
			else
			{
				for(int i=0;i<count;i++)
				{
					System.out.print("No. "+(i+1)+" student details: "+" Name: "+std[i].name+" Dept.: "+std[i].dept+"\n");
				}
			}
	}
}

public class admission{
	public static void main(String arg[])
	{
			Scanner sc=new Scanner(System.in);
			Techno TISL=new Techno(10);
			Techno NSEC=new Techno(8);
			Techno BIT=new Techno(5);
			while(true)
			{
				System.out.print("Press 1 for TISL\nPress 2 for NSEC\nPress 3 for BIT\nPress 4 for Display TISL\nPress 5 for Display NSEC\nPress 6 for Display BIT\nPress 7 for Exit\n");
				System.out.print("Enter your choice: ");
				int ch=sc.nextInt();
				switch(ch)
				{
					case 1: TISL.stdadd();
							break;
					case 2: NSEC.stdadd();
							break;
					case 3: BIT.stdadd();
							break;
					case 4: TISL.display();
							break;
					case 5: NSEC.display();
							break;
					case 6: BIT.display();
							break;
					case 7: System.exit(0);
					default: System.out.println("Wrong Choice!");
				}
			}
	}
}
