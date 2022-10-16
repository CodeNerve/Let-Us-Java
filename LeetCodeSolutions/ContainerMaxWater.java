

public class ContainerMaxWater {
    public static int maxArea(int[] height) {
        int maximumArea = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int shorterLine = Math.min(height[left], height[right]);
            maximumArea = Math.max(maximumArea, shorterLine * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maximumArea;
    }

    public static void main(String[] args) {

        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    
}
