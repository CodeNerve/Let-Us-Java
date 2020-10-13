package codeQuotient;

import java.util.ArrayList;

class classRectangle
{
 
	public void main(ArrayList<Integer> v) 
	{
	 for (int i = 0; i < v.size(); i++) 
	 {
	  int n = v.get(i);
	  if (n % 10 == 0) 
	  {
	   v.remove(i);
	   v.add(n);
	  }
	 }
	 System.out.println(v);
	}
}