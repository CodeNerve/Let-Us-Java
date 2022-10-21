import java.util.*;
public class My_result {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        int roll=sc.nextInt();
        int roll_code=sc.nextInt();
        sc.nextLine();
        String name2=sc.nextLine();
        String name3=sc.nextLine();
        int tm1=sc.nextInt();
        int tm2=sc.nextInt();
        int tm3=sc.nextInt();
        int tm4=sc.nextInt();
        int tm5=sc.nextInt();
        int pm4=sc.nextInt();
        int pm5=sc.nextInt();
        System.out.println();
        System.out.println("Name          : "+name1);
        System.out.println("Roll          : "+roll);
        System.out.println("Roll Code     : "+roll_code);
        System.out.println("Father's Name : "+name2);
        System.out.println("College Name  : "+name3);
        System.out.println();
        System.out.println("_________________________________________");
        System.out.println("Subject Code | Theory | Practical | Total");
        System.out.println("_________________________________________");
        System.out.println("ENA          | "+tm1+"     |   "+"        | "+tm1);
        System.out.println("MAT          | "+tm2+"     |   "+"        | "+tm2);
        System.out.println("ECO          | "+tm3+"     |   "+"        | "+tm3);
        System.out.println("PHY          | "+tm4+"     |   "+pm4+   "      | "+(tm4+pm4));
        System.out.println("CHEM         | "+tm5+"     |   "+pm5+   "      | "+(tm5+pm5));
        System.out.println("_________________________________________");
        int t=tm1+tm2+tm3+tm4+pm4+tm5+pm5;
        System.out.println("Total marks  | "+t);
        if(t<150)
        System.out.println("Result       | "+"Fail");
        else if(t>151 && t<=200)
        System.out.println("Result       | "+"3rd");
        else if(t>200 && t<=299)
        System.out.println("Result       | "+"2nd");
        else if(t>=300)
        System.out.println("Result       | "+"1st");
        System.out.println("_________________________________________");
    }
}
