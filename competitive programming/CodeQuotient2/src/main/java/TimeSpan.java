import java.util.Scanner;

class TimeSpan
{
 
  // Write your code here
  private int hours,minutes;
  public TimeSpan(int hours,int minutes)
  {
    this.hours=hours;
    this.minutes=minutes;
  }
  
  public int getHours()
  {
    return hours;
  }
  
  public int getMinutes()
  {
    return minutes;
  }
  
  public void add(int hours,int minutes)
  {
    this.hours = this.hours+hours;
    this.minutes = this.minutes+minutes;
  }
  
  public void add(TimeSpan tp)
  {
    this.hours = this.hours+tp.hours;
    this.minutes = this.minutes+tp.minutes;
  }
  
  public double getTotalHours()
  {
    double minToHour = this.minutes/60.0;
    double totalHours = this.hours + minToHour;
    //return ((double)this.hours+(this.minutes/60.0));
    return totalHours;
  }

  public String toString()
  {
    if(this.minutes==60){
      this.hours+=1;
      return (this.hours+" Hours,");
    }
    return (this.hours+" Hours, "+ this.minutes +" Minutes");
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    TimeSpan t1=new TimeSpan(s.nextInt(),s.nextInt());
    TimeSpan t2=new TimeSpan(s.nextInt(),s.nextInt());
    System.out.println(t1.getHours());
    System.out.println(t1.getMinutes());
    System.out.println(t1.toString());
    t1.add(s.nextInt(),s.nextInt());
    System.out.println(t1.getHours());
    System.out.println(t1.getMinutes());
    t1.add(t2);
    System.out.println(t1.getHours());
    System.out.println(t1.getMinutes());
    System.out.println(t1.getTotalHours());
  }
}