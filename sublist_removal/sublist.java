import java.util.*; 
  
public class AbstractList { 
    public static void main(String args[]) 
    { 
  
       
        AbstractList<String> 
            list = new LinkedList<String>(); 
  

        list.add("GFG"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("computer"); 
        list.add("portal"); 
  
        
        System.out.println("Original List: "
                           + list); 
  
       
        list.subList(1, 3).clear(); 
  
        
        System.out.println("Final List: "
                           + list); 
    } 
} 