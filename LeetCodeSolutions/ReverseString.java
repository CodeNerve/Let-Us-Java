public class Algorithm_Day4_ReverseString {
    public void reverseString(char[] s) {
        int L = 0;
        int R = s.length-1;

        while(L < R) {
            char temp = s[L];
            s[L] = s[R];
            s[R] = temp;
            L = L+1;
            R = R-1;
        }
    }
}
