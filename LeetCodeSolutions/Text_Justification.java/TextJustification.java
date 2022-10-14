 public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int left = 0; List<String> result = new ArrayList<>();
        
        while (left < words.length) {
            int right = findRight(left, words, maxWidth);
            result.add(justify(left, right, words, maxWidth));
            left = right + 1;
        }
        
        return result;
    }
    
    public String justify(int left, int right, String[] words, int maxWidth) {
        if (left == right) {
            return padRight(words[left], maxWidth);
        }
        
        int sum = words[left].length();
        
        for (int i = left + 1; i <= right; i++) {
            sum += words[i].length();
        }
        
        boolean isLastLine = right == words.length - 1;
        int numWords = right - left;
        int numWhitespace = maxWidth - sum;
        
        int numSpacesBetween = isLastLine ? 1 : numWhitespace / numWords;
        int remainder = isLastLine ? 0 : numWhitespace % numWords;
        
        StringBuilder result = new StringBuilder(); 
        
        for (int i = left; i < right; i++) {
            result.append(words[i]);
            result.append(whitespace(numSpacesBetween));
            result.append(remainder-- > 0 ? " " : "");
        }
        
        result.append(words[right]);
        
        if (isLastLine) {
            return padRight(result.toString(), maxWidth);
        } else { 
            return result.toString();
        }
    }
    
    public String whitespace(int numSpacesBetween) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numSpacesBetween; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
    
    public String padRight(String s, int maxWidth) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(whitespace(maxWidth - s.length()));
        return sb.toString();
    }
    public int findRight(int left, String[] words, int maxWidth) {
        
        int right = left;
        int sum = words[right++].length();
        
        while (right < words.length && sum + 1 + words[right].length() <= maxWidth) {
            sum += (1 + words[right++].length());
        }
        
        return right - 1;
    }
    
}
