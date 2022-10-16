//https://leetcode.com/problems/trapping-rain-water/

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(naiveApproach(arr));
        System.out.println(optimalApproach(arr));
    }

    private static int naiveApproach(int[] arr) {
        int n = arr.length, ans = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        right[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            ans += (Math.min(left[i], right[i])) - arr[i];
        }
        return ans;

    }

    private static int optimalApproach(int[] arr) {
        int n = arr.length, l = 0, r = n - 1, lm = 0, rm = 0, ans = 0;
        while (l <= r) {
            if (arr[l] <= arr[r]) {
                if (arr[l] >= lm) lm = arr[l];
                else ans += lm - arr[l];
                l++;
            } else {
                if (arr[r] >= rm) rm = arr[r];
                else ans += rm - arr[r];
                r--;
            }
        }
        return ans;
    }
}