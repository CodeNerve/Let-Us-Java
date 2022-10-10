import java.util.*;

public class Algorithm_Day6_LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int L=0;
        int R=0;
        int max=0;
        HashSet<Character> c = new HashSet<>();

        while(R<s.length()) {
            if(!c.contains(s.charAt(R))) {
                c.add(s.charAt(R));
                R++;
                max = Math.max(c.size(),max);
            }
            else {
               c.remove(s.charAt(L));
               L++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbbb"));
    }
}
