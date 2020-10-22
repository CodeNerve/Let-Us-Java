import java.util.Scanner;

class longestPalindromicSubString {

    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Please give a String");
        s = in.nextLine();
        System.out.println("The longest palindromic substring is: " + longestPalindromicSubString(s));
    }


    public static String longestPalindromicSubString(String string) {
        String result = "";
        String subString;
        int maxLength;
        StringBuilder inputStringBuilder = new StringBuilder();

        //iterating through the letters of the String 
        for (int i = 0; i <= string.length(); i++) {
            for (int j = i; j <= string.length(); j++) {
                inputStringBuilder.append(string, i, j);

                //checking if the substring is palindromic
                if (inputStringBuilder.toString().equals(inputStringBuilder.reverse().toString())) {
                    subString = inputStringBuilder.toString();
                    maxLength = subString.length();

                    //holds the longest subString
                    if (maxLength > result.length()) {
                        result = subString;
                    }
                }
                inputStringBuilder.setLength(0);
            }
        }
        return result;
    }
}