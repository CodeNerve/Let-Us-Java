import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter operator");
        char ch=sc.next().trim().charAt(0);
        int ans=0;
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
            System.out.println("Enter the numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(ch=='+')
            ans=a+b;
            else if(ch=='-')
            ans=a-b;
            else if(ch=='*')
            ans=a*b;
            else if(ch=='/')
            ans=a/b;
            else if(ch=='%')
            ans=a%b;
        }
        else if (ch=='x' || ch=='X'){
            System.out.println("End");
            break;
        }
        else{
        System.out.println("Invalid operator");
        }
        System.out.println(ans);
    }
    }
    
}
