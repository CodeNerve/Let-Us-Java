class Employee2{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getid()
    {
        return id;
    }
    public void setid(int i){
        id=i;
    }
}
public class Private{
    public static void main(String args[])
    {
        Employee2 subhajit=new Employee2();
        subhajit.setName("Subhajit nandi");
        System.out.println(subhajit.getName());
    }

}