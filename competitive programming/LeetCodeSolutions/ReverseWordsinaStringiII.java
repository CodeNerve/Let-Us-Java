public class Algorithm_Day4_ReverseWordsinaStringiII {
    public static String reverseWords(String s) {
        StringBuilder n = new StringBuilder("");
       int x = 0;
        for(int i=0; i<s.length();i++) {
            if(s.charAt(i)==' ') {
                for (int j=i-1;j>=x;j--) {
                    char c = s.charAt(j);
                    n.append(c);
                }
                n.append(' ');
                x = i+1;
            }
            else {
                if(i==s.length()-1) {
                    for (int j=i;j>=x;j--) {
                        char c = s.charAt(j);
                        n.append(c);
                    }
                }
            }
        }
        return n.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("lakshay roopchandani great"));
        System.out.println(Math.ceil((double) 7/2));
    }
}
