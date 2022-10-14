import java.util.Random;    

public class RandomNumber    

{    

public static void main(String[] args)    

{    

randomInts(5);   

randomInts(9, 50, 90);   

}    

public static void randomInts(int num)    

{   

Random random = new Random();   

random.ints(num).forEach(System.out::println);   

}   

public static void randomInts(int num, int origin, int bound)    

{   

Random random1 = new Random();   

random1.ints(num, origin, bound).forEach(System.out::println);   

}   

}   