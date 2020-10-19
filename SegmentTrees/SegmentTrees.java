class NumArray 
{
    int[] tree;
    int n;
    
    private void buildTree(int[] nums, int index, int start, int end)
    {
        if(start==end)
        {
            tree[index] = nums[start];
            return;
        }
        
        int mid = start + (end-start)/2;
        buildTree(nums, index*2+1, start, mid);
        buildTree(nums, index*2+2, mid+1, end);
        
        tree[index] = tree[index*2+1] + tree[index*2+2];
    }
    
    public NumArray(int[] nums) 
    {
        n = nums.length;
        int treeLen = (int)Math.pow(2, Math.ceil(Math.log(n)/Math.log(2)))*2-1;
        if(n>0)
        {
            tree = new int[treeLen];
            buildTree(nums, 0, 0, n-1);
        }
    }
    
    private void updateUtil(int index, int start, int end, int i, int val)
    {
        if(start==end)
        {
            tree[index] = val;
            return;
        }
        
        int mid = start + (end-start)/2;
        
        if(i>mid)
            updateUtil(index*2+2, mid+1, end, i, val);
        else if(i<=mid)
            updateUtil(index*2+1, start, mid, i, val);
        
        tree[index] = tree[index*2+1] + tree[index*2+2];
    }
    
    public void update(int i, int val) 
    {
        updateUtil(0, 0, n-1, i, val);
    }
    
    private int sumRangeUtil(int index, int start, int end, int i, int j)
    {
        if(start>j || end<i)
        {
            return 0;
        }
        
        if(start>=i && end<=j)
        {
            return tree[index];
        }
        
        int mid = start + (end-start)/2;
        
        return sumRangeUtil(index*2+1, start, mid, i, j) + sumRangeUtil(index*2+2, mid+1, end, i, j);
    }
    
    public int sumRange(int i, int j) 
    {
        return sumRangeUtil(0, 0, n-1, i, j);
    }
}

public class SegmentTrees 
{
    public static void main(String ... args)
    {
        int[] nums = {-28,-39,53,65,11,-56,-65,-39,-43,97};
        
        NumArray segTree = new NumArray(nums);
        
        System.out.println(segTree.sumRange(0,1));
    }
}
