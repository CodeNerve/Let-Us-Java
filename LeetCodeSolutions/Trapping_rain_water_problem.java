class Solution {
    public int trap(int[] height) {
        int l = height.length;
        
        int left[] = new int[l];
        int right[] = new int [l];
        int largest1 = 0;
        int largest2 = 0;
        for(int i=0;i<l;i++)
        {
            if(height[i]>largest1)
            {
                largest1 = height[i];
            }
            left[i] = largest1;
        }
        
        for(int i=l-1;i>=0;i--)
        {
                 if(height[i]>largest2)
            {
                largest2 = height[i];
            }
                right[i] = largest2;
        }
        
        int sum = 0;
        for(int i=0;i<l-1;i++)
        {
            sum = sum + (Math.min(left[i],right[i])-height[i]);
        }
        return sum;
        
        
    }
        
    }
