import java.util.Map;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        
        int maxLength = 1, last = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                last = Math.max(last, map.get(c) + 1);
            }
                
            map.put(c, i);
            maxLength = Math.max(maxLength, i - last + 1);
        }
                
        return maxLength;
    }    
}