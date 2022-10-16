import java.util.*;
class list{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Enter the number of the elements");
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++)
        {
            System.out.println("The list is"+list);
        }
        
    }
}