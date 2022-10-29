
//Problem: https://leetcode.com/problems/combination-sum

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, res, new ArrayList<Integer>(), 0, 0);
        return res;
    }

    private static void backtrack(int[] c, int t, List<List<Integer>> res, List<Integer> cur, int sum, int i) {
        if(sum > t) {
            return;
        }
        if(sum == t) {
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        for(int start = i;start<c.length;start++) {
            cur.add(c[start]);
            backtrack(c, t, res, cur, sum + c[start], start);
            cur.remove(cur.size() - 1);
        }
    }
}
