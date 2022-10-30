//by ajay

class Main
{
   
    public static int findMajorityElement(int[] nums)
    {
    
        int m = -1;
 
    
        int i = 0;
 

        for (int j = 0; j < nums.length; j++)
        {
         
            if (i == 0)
            {
   
                m = nums[j];
 
              
                i = 1;
            }
 
            else if (m == nums[j]) {
                i++;
            }
            
            else {
                i--;
            }
        }
 
        return m;
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
 
        System.out.println("The majority element is " + findMajorityElement(nums));
    }
}
