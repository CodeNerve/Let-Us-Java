public class Algorithm_Day3_TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int L = 0;
        int R = numbers.length-1;
        int[] index = new int[2];
        while(L < R) {
            if(numbers[L]+numbers[R] == target) {
                index[0] = L+1;
                index[1] = R+1;
                return index;
            }
            else if(numbers[L]+numbers[R] < target) {
                L = L+1;
            }
            else {
                R = R-1;
            }
        }
        return index;
    }
}
