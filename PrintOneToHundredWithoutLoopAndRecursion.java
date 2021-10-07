import java.util.BitSet;
class PrintOneToHundred
{
    // Java program to print the map of India
    public static void main(String[] args)
    {
       String set = new BitSet() {{set(1,101);}}.toString();
	   System.out.append(set,1,set.length());
    }
}